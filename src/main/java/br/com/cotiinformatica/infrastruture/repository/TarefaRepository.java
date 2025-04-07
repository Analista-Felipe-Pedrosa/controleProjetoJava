package br.com.cotiinformatica.infrastruture.repository;

import br.com.cotiinformatica.domain.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TarefaRepository extends MongoRepository<Tarefa, UUID> {
}
