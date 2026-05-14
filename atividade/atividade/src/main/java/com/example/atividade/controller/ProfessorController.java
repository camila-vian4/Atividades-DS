package com.example.atividade.controller;

import com.example.atividade.dto.professordto.ProfessorRequestDTO;
import com.example.atividade.dto.professordto.ProfessorResponseDTO;
import com.example.atividade.service.ProfessorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrarProfessor(@Valid @RequestBody ProfessorRequestDTO professorDTO){
        service.cadastrarProfessor(professorDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Professor cadastrado com sucesso! ✅"));
    }

    @GetMapping
    public ResponseEntity<List<ProfessorResponseDTO>> listarTodos(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarAluno(@PathVariable Long id,
                                                              @RequestBody ProfessorRequestDTO professorDTO){
        service.atualizarProfessor(id, professorDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Professor atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarProfessor(@PathVariable Long id){
        service.deletarProfessor(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Professor deletado com sucesso! ✅"));
    }
}
