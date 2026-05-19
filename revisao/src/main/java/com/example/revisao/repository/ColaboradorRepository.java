package com.example.revisao.repository;

import com.example.revisao.model.ColaboradorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColaboradorRepository extends JpaRepository<ColaboradorModel, Long> {
    Optional<ColaboradorModel> findByCpf (String cpf);
}
