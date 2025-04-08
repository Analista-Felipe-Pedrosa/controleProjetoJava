package br.com.cotiinformatica.aplication.controller;

import br.com.cotiinformatica.domain.dtos.membroequipe.MembroEquipeGetDto;
import br.com.cotiinformatica.domain.dtos.membroequipe.MembroEquipePostDto;
import br.com.cotiinformatica.domain.interfaces.MembroEquipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/membroequipe")
public class MembroEquipeController {

    @Autowired
    private MembroEquipeService membroEquipeService;

    @PostMapping
    public UUID post(@RequestBody @Valid MembroEquipePostDto dto){
        return membroEquipeService.criar(dto);

    }

    @GetMapping("{equipeId}")
    public List<MembroEquipeGetDto> get(@PathVariable("equipeId") UUID equipeId){
        return membroEquipeService.consultar(equipeId);
    }
}
