package br.com.cotiinformatica.domain.dtos.tarefa;

import lombok.Data;

import java.util.UUID;

@Data
public class TarefaGetDto {

    private UUID id;
    private String descricao;
    private String status;
    private String responsavel;
    private UUID sprintId;
}
