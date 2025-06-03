package com.alugaaqui.aluga_aqui.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.alugaaqui.aluga_aqui.model.ClientesModel;


public interface ClientesRepositories extends JpaRepository<ClientesModel, Long> {
    //Declaração dos métodos
    

    // Optional<ClientesModel> findByCpf_clientes(String cpf_clientes); 


    @Query("SELECT c FROM ClientesModel c WHERE LOWER(c.nome_clientes) LIKE LOWER(CONCAT('%', :nomeParcial, '%'))")
    List<ClientesModel> buscarPorNomeParcial(@Param("nomeParcial") String nomeParcial);


}