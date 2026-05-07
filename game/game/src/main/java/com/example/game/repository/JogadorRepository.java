package com.example.game.repository;

import com.example.game.model.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorModel, Long> {
    Optional<JogadorModel> findByEmail (String email);
}
