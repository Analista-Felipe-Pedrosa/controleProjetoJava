package br.com.cotiinformatica.domain.dtos.projeto;

import lombok.Data;

import java.util.UUID;

@Data
public class ProjetoGetDto {

    private UUID id;
    private String nome;
    private String escopo;
    private String dataEntrega;
}
