package br.com.cotiinformatica.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "projeto")
public class Projeto {
    @Id
    private UUID id;
    private String nome;
    private String escopo;
    private Date dataEntrega;
    private List<Equipe> equipes;
    private List<Sprint> sprints;
}
