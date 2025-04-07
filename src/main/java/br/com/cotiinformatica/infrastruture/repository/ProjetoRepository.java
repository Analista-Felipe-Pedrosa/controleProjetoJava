package br.com.cotiinformatica.infrastruture.repository;

import br.com.cotiinformatica.domain.model.Projeto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjetoRepository extends MongoRepository<Projeto, UUID> {
}
