package br.com.cotiinformatica.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "membroequipe")
public class MembroEquipe {

    @Id
    private UUID id;
    private String nome;
    private String papel;
}
