package com.example.atividade.repository;

import com.example.atividade.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long> {
    Optional<ProfessorModel> findByRegistroFuncional (String registroFuncional);
}
