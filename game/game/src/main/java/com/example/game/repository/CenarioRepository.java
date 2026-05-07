package com.example.game.repository;

import com.example.game.model.CenarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CenarioRepository extends JpaRepository<CenarioModel, Long> {
    Optional<CenarioModel> findBynomeCidade (String nomeCidade);
}
