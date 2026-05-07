package com.example.game.service;

import com.example.game.dto.CenarioRequestDTO;
import com.example.game.dto.CenarioResponseDTO;
import com.example.game.model.CenarioModel;
import com.example.game.repository.CenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenarioService {

    @Autowired
    private CenarioRepository repository;

    public List<CenarioResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(c -> new CenarioResponseDTO(c.getNomeCidade(), c.getHemisferio(), c.getClima(), c.getLoot()))
                .toList();
    }

    public CenarioModel cadastrarCenario(CenarioRequestDTO cenarioDTO) {
        if (repository.findBynomeCidade(cenarioDTO.getNomeCidade()).isPresent()) {
            throw new RuntimeException("Cenário já cadastrado! ❌");
        }

        CenarioModel cenario = new CenarioModel();
        cenario.setNomeCidade(cenarioDTO.getNomeCidade());
        cenario.setHemisferio(cenarioDTO.getHemisferio());
        cenario.setClima(cenarioDTO.getClima());
        cenario.setLoot(cenarioDTO.getLoot());

        return repository.save(cenario);
    }

    public CenarioModel atualizarCenario(Long id, CenarioRequestDTO cenarioDTO){

        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Cenário não encontrado! 🔍");
        }

        CenarioModel novoCenario = new CenarioModel();
        novoCenario.setId(id);

        novoCenario.setNomeCidade(cenarioDTO.getNomeCidade());
        novoCenario.setHemisferio(cenarioDTO.getHemisferio());
        novoCenario.setClima(cenarioDTO.getClima());
        novoCenario.setLoot(cenarioDTO.getLoot());

        return repository.save(novoCenario);
    }

    public void deletarCenario(Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Cenário não encontrado! 🔍");
        }
        repository.deleteById(id);
    }
}
