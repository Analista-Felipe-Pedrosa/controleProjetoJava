package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.dtos.sprint.SprintGetDto;
import br.com.cotiinformatica.domain.dtos.sprint.SprintPostDto;

import java.util.List;
import java.util.UUID;

public interface SprintService {
    UUID criar (SprintPostDto dto);

    List<SprintGetDto> consultar(UUID projetoId);
}
