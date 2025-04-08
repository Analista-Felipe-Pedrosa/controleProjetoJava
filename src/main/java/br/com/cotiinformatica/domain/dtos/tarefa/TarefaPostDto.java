package br.com.cotiinformatica.domain.dtos.tarefa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class TarefaPostDto {

    @NotBlank(message = "Informe a descrição da tarefa")
    private String descricao;
    @NotBlank(message = "Informe o status da tarefa")
    private String status;
    @NotBlank(message = "Informe o responsavel da tarefa")
    private String responsavel;
    @NotNull(message = "Informe o Id da Sprint")
    private UUID sprintId;
}
