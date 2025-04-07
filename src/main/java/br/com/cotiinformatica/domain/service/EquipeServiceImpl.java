package br.com.cotiinformatica.domain.service;

import br.com.cotiinformatica.domain.dtos.equipe.EquipeGetDto;
import br.com.cotiinformatica.domain.dtos.equipe.EquipePostDto;
import br.com.cotiinformatica.domain.interfaces.EquipeService;
import br.com.cotiinformatica.domain.model.Equipe;
import br.com.cotiinformatica.infrastruture.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EquipeServiceImpl implements EquipeService {

    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public UUID criar(EquipePostDto dto) {
        Equipe equipe = new Equipe();
        equipe.setId(UUID.randomUUID());
        equipe.setNome(dto.getNome());
        equipe.setProjetoId(dto.getProjetoId());

        equipeRepository.save(equipe);

        return equipe.getId();
    }

    @Override
    public List<EquipeGetDto> consultar(UUID projetoId) {
        List<EquipeGetDto> resultado = new ArrayList<>();

        for (Equipe equipe : equipeRepository.findByProjetoId(projetoId)){
            EquipeGetDto dto = new EquipeGetDto();
            dto.setId(equipe.getId());
            dto.setNome(equipe.getNome());
            dto.setProjetoId(equipe.getProjetoId());
            resultado.add(dto);
        }
        return resultado;
    }
}
