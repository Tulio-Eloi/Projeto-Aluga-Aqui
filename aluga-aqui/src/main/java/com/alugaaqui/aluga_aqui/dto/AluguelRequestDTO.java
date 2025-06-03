package com.alugaaqui.aluga_aqui.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AluguelRequestDTO {
    private Long id_carro;
    private LocalDate dataInicioAlugueis;
    private LocalDate dataFimAlugueis;
    private String observacoesAlugueis;
    // private Long idCliente; // Adicionar se/quando a funcionalidade de cliente for integrada
}