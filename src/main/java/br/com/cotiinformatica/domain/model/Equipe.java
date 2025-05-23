package br.com.cotiinformatica.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "equipe")
public class Equipe {

    @Id
    private UUID id;
    private String nome;
    private UUID projetoId;
    private List<MembroEquipe> membros;
}
