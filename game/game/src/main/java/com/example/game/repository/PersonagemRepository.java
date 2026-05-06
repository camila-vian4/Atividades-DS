package com.example.game.repository;

import com.example.game.model.PersonagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemModel, Long> {
    Optional<PersonagemModel> findByNome(String nome);
}
