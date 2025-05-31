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
    private Long id;
    
    @Column(name = "nome_completo", nullable = false, length = 45)
    private String nomeCompleto; 

    @Column(name = "email",  unique = true, nullable = false, length = 45)
    private String email;

    @Column(name = "telefone", nullable = false, length = 45)
    private String telefone;

    @Column(name = "endereco", nullable = false, length = 80)
    private String endereco;


    @Column(name = "cpf", nullable = false, unique = true, length = 14)
    private String cpf; 

   
}
