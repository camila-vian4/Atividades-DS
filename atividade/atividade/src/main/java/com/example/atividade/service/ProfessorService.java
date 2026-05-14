package com.example.atividade.service;

import com.example.atividade.dto.professordto.ProfessorRequestDTO;
import com.example.atividade.dto.professordto.ProfessorResponseDTO;
import com.example.atividade.model.ProfessorModel;
import com.example.atividade.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public ProfessorModel cadastrarProfessor(ProfessorRequestDTO professorDTO){
        if(repository.findByRegistroFuncional(professorDTO.getRegistroFuncional()).isPresent()){
            throw new RuntimeException("Professor já cadastrado! ❌");
        }

        ProfessorModel professor = new ProfessorModel();
        professor.setNome(professorDTO.getNome());
        professor.setIdade(professorDTO.getIdade());
        professor.setSexo(professorDTO.getSexo());
        professor.setRegistroFuncional(professorDTO.getRegistroFuncional());
        professor.setSenha(bCryptPasswordEncoder.encode(professorDTO.getSenha()));

        return repository.save(professor);
    }

    public List<ProfessorResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(p -> new ProfessorResponseDTO(p.getId(), p.getNome(), p.getIdade(), p.getSexo(), p.getRegistroFuncional()))
                .toList();
    }

    public ProfessorModel atualizarProfessor(Long id, ProfessorRequestDTO professorDTO){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Professor não encontrado! 🔍");
        }

        ProfessorModel novoProfessor = new ProfessorModel();
        novoProfessor.setId(id);

        novoProfessor.setNome(professorDTO.getNome());
        novoProfessor.setIdade(professorDTO.getIdade());
        novoProfessor.setSexo(professorDTO.getSexo());
        novoProfessor.setRegistroFuncional(professorDTO.getRegistroFuncional());
        novoProfessor.setSenha(bCryptPasswordEncoder.encode(professorDTO.getSenha()));

        return repository.save(novoProfessor);
    }

    public void deletarProfessor(Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Professor não encontrado! 🔍");
        }
        repository.deleteById(id);
    }
}
