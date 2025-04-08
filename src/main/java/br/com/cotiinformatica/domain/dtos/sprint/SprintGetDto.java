package br.com.cotiinformatica.domain.dtos.sprint;

import lombok.Data;

import java.util.UUID;

@Data
public class SprintGetDto {
    private UUID id;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private UUID projetoId;
}
