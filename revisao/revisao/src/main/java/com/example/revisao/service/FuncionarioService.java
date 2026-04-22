package com.example.revisao.service;

import com.example.revisao.model.FuncionarioModel;
import com.example.revisao.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel> listarFuncionarios(){
        return repository.findAll();
    }

    public FuncionarioModel addFuncionario(FuncionarioModel funcionario){
        if (repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado com esse e-mail! ❌");
        }
        return repository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionario){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado! 🔍");
        }

        // Mantém o ID do funcionário para garantir que o registro existente seja atualizado
        // ao invés de criar um novo objeto. Atualiza o existente
        // e altera todos os outros dados.

        funcionario.setId(id);
        return repository.save(funcionario);
    }

    public void excluir (Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado! Deletando... 🗑️");
        }
        repository.deleteById(id);
    }
}
