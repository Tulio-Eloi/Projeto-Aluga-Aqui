package com.alugaaqui.aluga_aqui.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ClientesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_clientes;
    
    @Column(name = "nome_clientes", nullable = false, length = 45)
    private String nome_clientes; 

    @Column(name = "email_clientes", nullable = false, length = 45)
    private String email_clientes;

    @Column(name = "telefone__clientes", nullable = false, length = 45)
    private String telefone_clientes;

    @Column(name = "endereco_clientes", nullable = false, length = 45)
    private String endereco_clientes;


    @Column(name = "cpf_clientes", nullable = false, unique = true, length = 14)
    private String cpf_clientes; 
}
