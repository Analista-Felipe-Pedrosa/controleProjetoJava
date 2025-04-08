package br.com.cotiinformatica.domain.service;

import br.com.cotiinformatica.domain.dtos.membroequipe.MembroEquipeGetDto;
import br.com.cotiinformatica.domain.dtos.membroequipe.MembroEquipePostDto;
import br.com.cotiinformatica.domain.interfaces.MembroEquipeService;
import br.com.cotiinformatica.domain.model.MembroEquipe;
import br.com.cotiinformatica.infrastruture.repository.MembroEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MembroEquipeServiceImpl implements MembroEquipeService {

    @Autowired
    private MembroEquipeRepository equipeRepository;

    @Override
    public UUID criar(MembroEquipePostDto dto) {
        MembroEquipe membroEquipe = new MembroEquipe();
        membroEquipe.setId(UUID.randomUUID());
        membroEquipe.setNome(dto.getNome());
        membroEquipe.setPapel(dto.getPapel());
        membroEquipe.setEquipeId(dto.getEquipeId());

        equipeRepository.save(membroEquipe);

        return membroEquipe.getId();
    }

    @Override
    public List<MembroEquipeGetDto> consultar(UUID equipeId) {
        List<MembroEquipeGetDto> lista = new ArrayList<>();

        for (MembroEquipe membroEquipe : equipeRepository.findByEquipeId(equipeId)){
            MembroEquipeGetDto dto = new MembroEquipeGetDto();
            dto.setId(membroEquipe.getId());
            dto.setNome(membroEquipe.getNome());
            dto.setPapel(membroEquipe.getPapel());
            dto.setEquipeId(membroEquipe.getEquipeId());
            lista.add(dto);
        }
        return lista;
    }
}
