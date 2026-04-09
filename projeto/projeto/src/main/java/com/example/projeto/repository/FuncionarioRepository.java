package com.example.projeto.repository;

import com.example.projeto.model.ClienteModel;
import com.example.projeto.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    // Consultar no banco de dados se o e-mail já existe,
    // antes de salvar o cliente.

    Optional<FuncionarioModel> findByEmail(String email);
}
