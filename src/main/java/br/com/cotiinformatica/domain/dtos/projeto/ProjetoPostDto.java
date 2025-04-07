package br.com.cotiinformatica.domain.dtos.projeto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ProjetoPostDto {

    @NotBlank(message = "Informe o nome do Projeto")
    private String nome;
    @NotBlank(message = "Informe o escopo do Projeto")
    private String escopo;
    @NotBlank(message = "Informe a data de entrega do Projeto")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Informe a data de entrega no formato YYYY-MM-DD")
    private String dataEntrega;
}
