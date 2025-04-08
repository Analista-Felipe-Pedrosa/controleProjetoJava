package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.dtos.membroequipe.MembroEquipeGetDto;
import br.com.cotiinformatica.domain.dtos.membroequipe.MembroEquipePostDto;

import java.util.List;
import java.util.UUID;

public interface MembroEquipeService {

    UUID criar (MembroEquipePostDto dto);

    List<MembroEquipeGetDto> consultar(UUID equipeId);
}
