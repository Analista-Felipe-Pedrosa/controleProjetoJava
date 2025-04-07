package br.com.cotiinformatica.domain.dtos.equipe;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class EquipePostDto {

    @NotBlank(message = "Informe o nome da Equipe")
    private String nome;

    @NotNull(message = "Informe o id do Projeto")
    private UUID projetoId;
}
