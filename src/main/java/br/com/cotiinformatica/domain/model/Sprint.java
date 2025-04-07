package br.com.cotiinformatica.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "sprint")
public class Sprint {
    @Id
    private UUID id;
    private String nome;
    private Date dataInicio;
    private Date dataFim;
    private List<Tarefa> tarefas;

}
