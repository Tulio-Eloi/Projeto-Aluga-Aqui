package com.alugaaqui.aluga_aqui.controller;

import com.alugaaqui.aluga_aqui.model.AlugueisModel;
import com.alugaaqui.aluga_aqui.service.AlugueisService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alugaaqui.aluga_aqui.dto.AluguelRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alugueis")
public class AlugueisController {

    @Autowired
    private AlugueisService alugueisService;

    @PostMapping
    public ResponseEntity<AlugueisModel> registrarAluguel(@RequestBody AluguelRequestDTO aluguelRequestDTO) {
        
        AlugueisModel novoAluguel = alugueisService.registrarAluguel(
                aluguelRequestDTO.getId_carro(),
                aluguelRequestDTO.getDataInicioAlugueis(),
                aluguelRequestDTO.getDataFimAlugueis(),
                aluguelRequestDTO.getObservacoesAlugueis()
                // Se adicionar cliente: , aluguelRequestDTO.getIdCliente()
        );
        return new ResponseEntity<>(novoAluguel, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<AlugueisModel>> listarTodosAlugueis() {
        List<AlugueisModel> alugueis = alugueisService.listarTodosAlugueis();
        return ResponseEntity.ok(alugueis);
    }


    @GetMapping("/{idAluguel}")
    public ResponseEntity<AlugueisModel> buscarAluguelPorId(@PathVariable Integer idAluguel) {
        Optional<AlugueisModel> aluguelOpt = alugueisService.buscarAluguelPorId(idAluguel);
        return aluguelOpt.map(ResponseEntity::ok)
                         .orElseGet(() -> ResponseEntity.notFound().build());
    }

    
    // Processar a devolução de um carro e finalizar o aluguel.
    
    @PutMapping("/{idAluguel}/finalizar")
    public ResponseEntity<AlugueisModel> processarDevolucaoEFinalizarAluguel(@PathVariable Integer idAluguel) {
        AlugueisModel aluguel = alugueisService.processarDevolucaoEFinalizarAluguel(idAluguel);
        return ResponseEntity.ok(aluguel);
    }

}