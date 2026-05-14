package com.example.atividade.service;

import com.example.atividade.dto.alunodto.AlunoRequestDTO;
import com.example.atividade.dto.alunodto.AlunoResponseDTO;
import com.example.atividade.model.AlunoModel;
import com.example.atividade.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public AlunoModel cadastrarAluno(AlunoRequestDTO alunoDTO){
        if(repository.findByMatricula(alunoDTO.getMatricula()).isPresent()){
            throw new RuntimeException("Aluno já cadastrado! ❌");
        }

        AlunoModel aluno = new AlunoModel();
        aluno.setNome(alunoDTO.getNome());
        aluno.setIdade(alunoDTO.getIdade());
        aluno.setSexo(alunoDTO.getSexo());
        aluno.setMatricula(alunoDTO.getMatricula());
        aluno.setSenha(bCryptPasswordEncoder.encode(alunoDTO.getSenha()));

        return repository.save(aluno);
    }

    public List<AlunoResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(a -> new AlunoResponseDTO(a.getId(), a.getNome(), a.getIdade(), a.getSexo(), a.getMatricula()))
                .toList();
    }

    public AlunoModel atualizarAluno(Long id, AlunoRequestDTO alunoDTO){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Aluno não encontrado! 🔍");
        }

        AlunoModel novoAluno = new AlunoModel();
        novoAluno.setId(id);

        novoAluno.setNome(alunoDTO.getNome());
        novoAluno.setIdade(alunoDTO.getIdade());
        novoAluno.setSexo(alunoDTO.getSexo());
        novoAluno.setMatricula(alunoDTO.getMatricula());
        novoAluno.setSenha(bCryptPasswordEncoder.encode(alunoDTO.getSenha()));

        return repository.save(novoAluno);
    }

    public void deletarAluno(Long id){
         if(!repository.existsById(id)){
             throw new IllegalArgumentException("Aluno não encontrado! 🔍");
         }

         repository.deleteById(id);
    }

}
