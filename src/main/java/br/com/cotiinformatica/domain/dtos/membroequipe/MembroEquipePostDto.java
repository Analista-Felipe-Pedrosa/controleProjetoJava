package br.com.cotiinformatica.domain.dtos.membroequipe;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class MembroEquipePostDto {

    @NotBlank(message = "Por favor informe o nome do Membro da equipe")
    private String nome;
    @NotBlank(message = "Por favor informe o papel Membro da equipe")
    private String papel;
    @NotNull(message = "Por favor informar o id da Equipe")
    private UUID equipeId;

}
