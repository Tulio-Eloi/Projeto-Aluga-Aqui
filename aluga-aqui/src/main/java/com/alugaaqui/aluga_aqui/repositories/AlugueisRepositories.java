package com.alugaaqui.aluga_aqui.repositories;

import com.alugaaqui.aluga_aqui.model.AlugueisModel;
import com.alugaaqui.aluga_aqui.model.CarrosModel;
// import com.alugaaqui.aluga_aqui.model.ClientesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlugueisRepositories extends JpaRepository<AlugueisModel, Integer> {

    List<AlugueisModel> findByCarro(CarrosModel carro);
    // List<AlugueisModel> findByCliente(ClientesModel cliente);



    // List<AlugueisModel> findByCarroOrderByDataInicioAlugueisDesc(CarrosModel carro);
    // List<AlugueisModel> findByDataInicioAlugueisBetween(LocalDate dataInicial, LocalDate dataFinal);

    // //:data é a data que está sendo consultada se tem aluguel ativo 
    // @Query("SELECT a FROM AlugueisModel a WHERE a.dataInicioAlugueis <= :data AND a.dataFimAlugueis >= :data")
    // List<AlugueisModel> findAlugueisAtivosEmData(@Param("data") LocalDate data);


}

