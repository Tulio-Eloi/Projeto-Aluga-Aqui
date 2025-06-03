package com.alugaaqui.aluga_aqui.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alugaaqui.aluga_aqui.model.AlugueisModel;
import com.alugaaqui.aluga_aqui.model.CarrosModel;
import com.alugaaqui.aluga_aqui.model.enums.StatusCarro;
import com.alugaaqui.aluga_aqui.repositories.AlugueisRepositories;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AlugueisService {

    @Autowired
    private AlugueisRepositories alugueisRepositories;

    @Autowired
    private CarrosServices carrosService;
    @Transactional
    public AlugueisModel registrarAluguel(Long id_carro, LocalDate dataInicioAlugueis, LocalDate dataFimAlugueis, String observacoesAlugueis) {

        if (dataInicioAlugueis == null || dataFimAlugueis == null) {
            throw new IllegalArgumentException("As datas de início e fim do aluguel são obrigatórias.");
        }
        if (dataFimAlugueis.isBefore(dataInicioAlugueis)) {
            throw new IllegalArgumentException("A data de fim do aluguel não pode ser anterior à data de início.");
        }

        CarrosModel carro = carrosService.buscarCarroPorId(id_carro) 
                 .orElseThrow(() -> new EntityNotFoundException("Carro não encontrado com ID: " + id_carro));




        List<AlugueisModel> alugueisExistentesParaCarro = alugueisRepositories.findByCarro(carro);
        for (AlugueisModel aluguelExistente : alugueisExistentesParaCarro) {
            boolean conflito = !(dataFimAlugueis.isBefore(aluguelExistente.getDataInicioAlugueis()) ||
                                 dataInicioAlugueis.isAfter(aluguelExistente.getDataFimAlugueis()));
            if (conflito) {
                throw new IllegalArgumentException("O carro já possui um aluguel registrado que conflita com o período solicitado ("+
                                                   aluguelExistente.getDataInicioAlugueis() + " a " + aluguelExistente.getDataFimAlugueis() +").");
            }
        }
        AlugueisModel novoAluguel = new AlugueisModel();
        novoAluguel.setCarro(carro);
        novoAluguel.setDataInicioAlugueis(dataInicioAlugueis);
        novoAluguel.setDataFimAlugueis(dataFimAlugueis);
        novoAluguel.setObservacoesAlugueis(observacoesAlugueis);

       
        double valorDiariaCarro = carro.getValor_carros();
        if (valorDiariaCarro <= 0.0) { 
             throw new IllegalStateException("O valor da diária para o carro ID " + carro + " não está definido ou é inválido.");
        }

        long dias = ChronoUnit.DAYS.between(dataInicioAlugueis, dataFimAlugueis);
        dias = Math.max(dias, 0) + 1;

 
        double valorTotalCalculado = valorDiariaCarro * dias;
        double valorTotalArredondadoParaAluguel = Math.round(valorTotalCalculado * 100.0) / 100.0;


        AlugueisModel aluguelSalvo = alugueisRepositories.save(novoAluguel);

        carro.setStatus_carros(StatusCarro.INDISPONIVEL);
        // carrosService.salvarOuAtualizarCarro(carro);   Precisa criar o método de salvar carro em CarrosServices

        return aluguelSalvo;
    }


    public List<AlugueisModel> listarTodosAlugueis() {
        return alugueisRepositories.findAll();
    }

    public Optional<AlugueisModel> buscarAluguelPorId(Integer idAluguel) {
        return alugueisRepositories.findById(idAluguel);
    }

 
    public AlugueisModel processarDevolucaoEFinalizarAluguel(Integer idAluguel) {
        AlugueisModel aluguel = alugueisRepositories.findById(idAluguel)
            .orElseThrow(() -> new EntityNotFoundException("Aluguel não encontrado com ID: " + idAluguel));

        CarrosModel carroDoAluguel = aluguel.getCarro();
        if (carroDoAluguel == null) {
            throw new IllegalStateException("Aluguel ID " + idAluguel + " não está associado a um carro válido, não é possível processar devolução.");
        }

       

        return aluguel;
    }
}