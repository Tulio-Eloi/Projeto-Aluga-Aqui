package com.alugaaqui.aluga_aqui.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "carros")
@Getter//metodo getter
@Setter//metodo setter
@AllArgsConstructor //cria o metodo construtor
public class CarrosModel {

    public CarrosModel(){
        
    }
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_carros;

    private String modelo_carros;
    private String marca_carros;
    private String placa_carros;
    private String ano_carros;
    private String cor_carros;
    private String status_carros;
    private double valor_carros;
    private String imagens_carros;
}
