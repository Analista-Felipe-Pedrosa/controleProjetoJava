package br.com.cotiinformatica.aplication.controller;

import br.com.cotiinformatica.domain.dtos.tarefa.TarefaGetDto;
import br.com.cotiinformatica.domain.dtos.tarefa.TarefaPostDto;
import br.com.cotiinformatica.domain.interfaces.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/tarefa")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public UUID post(TarefaPostDto dto){
        return tarefaService.criar(dto);
    }

    @GetMapping("{sprintId}")
    public List<TarefaGetDto> get(@PathVariable("sprintId") UUID sprintIdd){
        return tarefaService.consultar(sprintIdd);
    }
}
