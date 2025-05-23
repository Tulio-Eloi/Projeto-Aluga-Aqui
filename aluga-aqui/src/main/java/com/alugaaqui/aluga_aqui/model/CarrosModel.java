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

    public String modelo_carros;
    public String marca_carros;
    public String placa_carros;
    public String ano_carros;
    public String cor_carros;
    public String status_carros;
    public double valor_carros;
    public String imagens_carros;
}
