package com.example.atividade.repository;

import com.example.atividade.model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
    Optional<AlunoModel> findByMatricula (String matricula);
}
