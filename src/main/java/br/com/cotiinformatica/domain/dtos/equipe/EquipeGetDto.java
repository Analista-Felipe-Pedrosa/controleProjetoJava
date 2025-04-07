package br.com.cotiinformatica.domain.dtos.equipe;

import lombok.Data;

import java.util.UUID;

@Data
public class EquipeGetDto {
    private UUID id;
    private String nome;
    private UUID projetoId;
}
