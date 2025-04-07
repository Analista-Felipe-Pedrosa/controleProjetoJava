package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.dtos.equipe.EquipeGetDto;
import br.com.cotiinformatica.domain.dtos.equipe.EquipePostDto;

import java.util.List;
import java.util.UUID;

public interface EquipeService {

    UUID criar(EquipePostDto dto);
    List<EquipeGetDto> consultar(UUID projetoId);
}
