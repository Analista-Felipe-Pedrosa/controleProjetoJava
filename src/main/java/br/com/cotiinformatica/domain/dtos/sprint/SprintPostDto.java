package br.com.cotiinformatica.domain.dtos.sprint;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.UUID;

@Data
public class SprintPostDto {
    @NotBlank(message = "informe o nome da Sprint")
    private String nome;
    @NotBlank(message = "informe a Data Inicio")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Informe a data de inicio no formato YYYY-MM-AA")
    private String dataInicio;
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Informe a data de fim no formato YYYY-MM-AA")
    @NotBlank(message = "informe a Data Fim")
    private String dataFim;
    @NotNull(message = "Informe o Id do Projeto")
    private UUID projetoId;
}
