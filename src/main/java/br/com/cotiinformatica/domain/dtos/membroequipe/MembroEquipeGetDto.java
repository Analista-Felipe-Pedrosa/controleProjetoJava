package br.com.cotiinformatica.domain.dtos.membroequipe;

import lombok.Data;

import java.util.UUID;

@Data
public class MembroEquipeGetDto {
    private UUID id;
    private String nome;
    private String papel;
    private UUID equipeId;
}
