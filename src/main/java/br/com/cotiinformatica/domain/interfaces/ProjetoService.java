package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.dtos.projeto.ProjetoGetDto;
import br.com.cotiinformatica.domain.dtos.projeto.ProjetoPostDto;

import java.util.List;
import java.util.UUID;

public interface ProjetoService {

    UUID criar(ProjetoPostDto dto);

    List<ProjetoGetDto> consultar();
}
