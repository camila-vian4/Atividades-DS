package com.example.revisaoprova.service;


import com.example.revisaoprova.dto.FuncionarioRequestDTO;
import com.example.revisaoprova.dto.FuncionarioResponseDTO;
import com.example.revisaoprova.dto.endereco.EnderecoRequestDTO;
import com.example.revisaoprova.dto.endereco.EnderecoResponseDTO;
import com.example.revisaoprova.model.EnderecoModel;
import com.example.revisaoprova.model.FuncionarioModel;
import com.example.revisaoprova.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public FuncionarioModel cadastrar(FuncionarioRequestDTO funcionarioDTO){
        if(repository.findByEmail(funcionarioDTO.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado! ❌");
        }

        FuncionarioModel funcionario =  new FuncionarioModel();
        funcionario.setNome(funcionarioDTO.getNome());
        funcionario.setMatricula(funcionarioDTO.getMatricula());
        funcionario.setDataNascimento(funcionarioDTO.getDataNascimento());
        funcionario.setSalario(funcionarioDTO.getSalario());
        funcionario.setEmail(funcionarioDTO.getEmail());
        funcionario.setEndereco(funcionarioDTO.getEndereco());

        return repository.save(funcionario);
    }

    public List<FuncionarioResponseDTO> listar(){
        return repository
                .findAll()
                .stream()
                .map(f -> new FuncionarioResponseDTO(f.getId(), f.getNome(), f.getMatricula(), f.getDataNascimento(), f.getSalario(), f.getEmail(), f.getEndereco()))
                .toList();
    }

    public FuncionarioModel atualizar(Long id, FuncionarioRequestDTO funcionarioDTO) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Funcionário não encontrado! 🔍");
        }

        FuncionarioModel novoFuncionario =  new FuncionarioModel();
        novoFuncionario.setId(id);
        novoFuncionario.setNome(funcionarioDTO.getNome());
        novoFuncionario.setMatricula(funcionarioDTO.getNome());
        novoFuncionario.setDataNascimento(funcionarioDTO.getDataNascimento());
        novoFuncionario.setSalario(funcionarioDTO.getSalario());
        novoFuncionario.setEmail(funcionarioDTO.getEmail());
        novoFuncionario.setEndereco(funcionarioDTO.getEndereco());

        return repository.save(novoFuncionario);
    }

    public void deletar(Long id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado! 🔍");
        }

        repository.deleteById(id);
    }
}
