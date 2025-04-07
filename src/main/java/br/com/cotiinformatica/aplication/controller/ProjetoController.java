package br.com.cotiinformatica.aplication.controller;

import br.com.cotiinformatica.domain.dtos.projeto.ProjetoGetDto;
import br.com.cotiinformatica.domain.dtos.projeto.ProjetoPostDto;
import br.com.cotiinformatica.domain.interfaces.ProjetoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public UUID post(@RequestBody @Valid ProjetoPostDto dto){
        return projetoService.criar(dto);
    }

    @GetMapping
    public List<ProjetoGetDto> get(){
        return projetoService.consultar();
    }
}
