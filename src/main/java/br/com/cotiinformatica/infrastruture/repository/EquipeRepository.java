package br.com.cotiinformatica.infrastruture.repository;

import br.com.cotiinformatica.domain.model.Equipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EquipeRepository extends MongoRepository<Equipe, UUID> {
}
