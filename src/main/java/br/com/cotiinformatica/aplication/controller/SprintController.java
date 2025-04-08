package br.com.cotiinformatica.aplication.controller;

import br.com.cotiinformatica.domain.dtos.sprint.SprintGetDto;
import br.com.cotiinformatica.domain.dtos.sprint.SprintPostDto;
import br.com.cotiinformatica.domain.interfaces.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/sprint")
public class SprintController {
    @Autowired
    private SprintService sprintService;

    @PostMapping
    public UUID post(SprintPostDto dto){
        return sprintService.criar(dto);

    }

    @GetMapping("{projetoId}")
    public List<SprintGetDto> get(@PathVariable("projetoId") UUID projetoId){
        return sprintService.consultar(projetoId);
    }
}
