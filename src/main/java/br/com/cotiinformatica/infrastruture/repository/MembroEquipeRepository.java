package br.com.cotiinformatica.infrastruture.repository;

import br.com.cotiinformatica.domain.model.MembroEquipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MembroEquipeRepository extends MongoRepository<MembroEquipe, UUID> {
}
