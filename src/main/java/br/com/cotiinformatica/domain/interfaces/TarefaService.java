package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.dtos.tarefa.TarefaGetDto;
import br.com.cotiinformatica.domain.dtos.tarefa.TarefaPostDto;

import java.util.List;
import java.util.UUID;

public interface TarefaService {

    UUID criar (TarefaPostDto dto);

    List<TarefaGetDto> consultar(UUID sprintId);
}
