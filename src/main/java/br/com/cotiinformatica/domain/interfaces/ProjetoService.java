package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.dtos.projeto.ProjetoPostDto;

import java.util.UUID;

public interface ProjetoService {

    UUID criar(ProjetoPostDto dto);
}
