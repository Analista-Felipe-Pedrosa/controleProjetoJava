package br.com.cotiinformatica.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "tarefa")
public class Tarefa {
    @Id
    private UUID id;
    private String descricao;
    private String status;
    private String responsavel;
    private UUID sprintId;
}
