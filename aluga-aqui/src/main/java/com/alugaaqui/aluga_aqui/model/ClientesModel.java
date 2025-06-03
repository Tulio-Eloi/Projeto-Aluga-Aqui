package com.alugaaqui.aluga_aqui.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ClientesModel {
    
    @Id
    @Column(name = "id_clientes")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_clientes;
    
    @Column( nullable = false, length = 45)
    private String nome_clientes; 

    @Column( unique = true, nullable = false, length = 45)
    private String email_clientes;

    @Column( nullable = false, length = 45)
    private String telefone_clientes;

    @Column( nullable = false, length = 80)
    private String endereco_clientes;


    @Column( nullable = false, unique = true, length = 14)
    private String cpf_clientes; 

   
}




