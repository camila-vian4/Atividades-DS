package com.example.game.service;

import com.example.game.dto.PersonagemRequestDTO;
import com.example.game.dto.PersonagemResponseDTO;
import com.example.game.model.PersonagemModel;
import com.example.game.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;

    public List<PersonagemResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(p -> new PersonagemResponseDTO(p.getNome(), p.getIdade(), p.getHabilidade(), p.getPersonalidade()))
                .toList();
    }

    public PersonagemModel cadastrarPersonagem(PersonagemRequestDTO personagemDTO) {
        if (repository.findByNome(personagemDTO.getNome()).isPresent()) {
            throw new RuntimeException("Personagem já cadastrado! ❌");
        }

        PersonagemModel novoPersonagem = new PersonagemModel();
        novoPersonagem.setNome(personagemDTO.getNome());
        novoPersonagem.setIdade(personagemDTO.getIdade());
        novoPersonagem.setHabilidade(personagemDTO.getHabilidade());
        novoPersonagem.setPersonalidade(personagemDTO.getPersonalidade());

        return repository.save(novoPersonagem);
    }
}
