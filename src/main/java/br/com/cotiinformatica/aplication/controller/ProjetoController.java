package br.com.cotiinformatica.aplication.controller;

import br.com.cotiinformatica.domain.dtos.projeto.ProjetoPostDto;
import br.com.cotiinformatica.domain.interfaces.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "api/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public UUID post(@RequestBody ProjetoPostDto dto){
        return projetoService.criar(dto);
    }

    @GetMapping
    public void get(){

    }
}
