package br.com.cotiinformatica.aplication.controller;

import br.com.cotiinformatica.domain.dtos.equipe.EquipeGetDto;
import br.com.cotiinformatica.domain.dtos.equipe.EquipePostDto;
import br.com.cotiinformatica.domain.interfaces.EquipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/equipe")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    @PostMapping
    public UUID post(@RequestBody @Valid EquipePostDto dto) {
        return equipeService.criar(dto);
    }

    @GetMapping("{id}")
    public List<EquipeGetDto> get(@PathVariable("id") UUID projetoId){
        return equipeService.consultar(projetoId);
    }

}
