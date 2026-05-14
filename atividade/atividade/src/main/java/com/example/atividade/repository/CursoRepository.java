package com.example.atividade.repository;

import com.example.atividade.model.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {
    Optional<CursoModel> findByCodigo (String codigo);
}
