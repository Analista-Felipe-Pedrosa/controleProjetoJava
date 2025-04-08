package br.com.cotiinformatica.domain.service;

import br.com.cotiinformatica.domain.dtos.tarefa.TarefaGetDto;
import br.com.cotiinformatica.domain.dtos.tarefa.TarefaPostDto;
import br.com.cotiinformatica.domain.interfaces.TarefaService;
import br.com.cotiinformatica.domain.model.Tarefa;
import br.com.cotiinformatica.infrastruture.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TarefaServiceImpl implements TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    @Override
    public UUID criar(TarefaPostDto dto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setId(UUID.randomUUID());
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setStatus(dto.getStatus());
        tarefa.setResponsavel(dto.getResponsavel());
        tarefa.setSprintId(dto.getSprintId());

        tarefaRepository.save(tarefa);

        return tarefa.getId();
    }

    @Override
    public List<TarefaGetDto> consultar(UUID sprintId) {
        List<TarefaGetDto> result = new ArrayList<>();

        for (Tarefa tarefa : tarefaRepository.findBySprintId(sprintId)){
            TarefaGetDto dto = new TarefaGetDto();
            dto.setId(tarefa.getId());
            dto.setDescricao(tarefa.getDescricao());
            dto.setResponsavel(tarefa.getResponsavel());
            dto.setStatus(tarefa.getStatus());
            dto.setSprintId(tarefa.getSprintId());
            result.add(dto);
        }
        return result;
    }
}
