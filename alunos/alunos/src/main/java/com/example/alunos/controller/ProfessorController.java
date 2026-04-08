package com.example.alunos.controller;

import com.example.alunos.model.AlunoModel;
import com.example.alunos.model.ProfessorModel;
import com.example.alunos.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository repository;

    @GetMapping
    public List<ProfessorModel> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<ProfessorModel> salvar(@RequestBody ProfessorModel professores) {
        repository.save(professores);
        return ResponseEntity.status(HttpStatus.CREATED).body(professores);
    }
}
