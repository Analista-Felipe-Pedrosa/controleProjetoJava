package br.com.cotiinformatica.infrastruture.repository;

import br.com.cotiinformatica.domain.model.Sprint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SprintRepository extends MongoRepository<Sprint, UUID> {

    List<Sprint> findByProjetoId(UUID projetoId);
}
