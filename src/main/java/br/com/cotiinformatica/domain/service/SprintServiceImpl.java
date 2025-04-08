package br.com.cotiinformatica.domain.service;

import br.com.cotiinformatica.domain.dtos.projeto.ProjetoGetDto;
import br.com.cotiinformatica.domain.dtos.sprint.SprintGetDto;
import br.com.cotiinformatica.domain.dtos.sprint.SprintPostDto;
import br.com.cotiinformatica.domain.interfaces.SprintService;
import br.com.cotiinformatica.domain.model.Projeto;
import br.com.cotiinformatica.domain.model.Sprint;
import br.com.cotiinformatica.infrastruture.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SprintServiceImpl implements SprintService {
    @Autowired
    private SprintRepository sprintRepository;

    @Override
    public UUID criar(SprintPostDto dto) {
        try {

            Sprint sprint = new Sprint();
            sprint.setId(UUID.randomUUID());
            sprint.setNome(dto.getNome());
            sprint.setDataInicio(new SimpleDateFormat("yyyy-MM-dd").parse(dto.getDataInicio()));
            sprint.setDataFim(new SimpleDateFormat("yyyy-MM-dd").parse(dto.getDataFim()));
            sprint.setProjetoId(dto.getProjetoId());

            sprintRepository.save(sprint);
            return sprint.getId();
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public List<SprintGetDto> consultar(UUID projetoId) {
        try {
            List<SprintGetDto> resultado = new ArrayList<>();
            for (Sprint sprint : sprintRepository.findAll()){
                SprintGetDto dto = new SprintGetDto();
                dto.setId(sprint.getId());
                dto.setNome(sprint.getNome());
                dto.setDataInicio(new SimpleDateFormat("dd/MM/yyyy").format(sprint.getDataInicio()));
                dto.setDataFim(new SimpleDateFormat("dd/MM/yyyy").format(sprint.getDataFim()));
                dto.setProjetoId(sprint.getProjetoId());
                resultado.add(dto);
            }
            return resultado;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
