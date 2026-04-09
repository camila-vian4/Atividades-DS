package com.example.projeto.service;

import com.example.projeto.model.FuncionarioModel;
import com.example.projeto.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired

    private FuncionarioRepository repository;

    public List<FuncionarioModel> listarTodos() {
        return repository.findAll();
    }

    public FuncionarioModel salvarFuncionario(FuncionarioModel funcionario) {

        if (repository.findByEmail(funcionario.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Funcionário já cadastrado!");
        }
        return repository.save(funcionario);
    }
}
