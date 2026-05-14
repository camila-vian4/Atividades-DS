package com.example.atividade.controller;

import com.example.atividade.dto.alunodto.AlunoRequestDTO;
import com.example.atividade.dto.alunodto.AlunoResponseDTO;
import com.example.atividade.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrarAluno(@Valid @RequestBody AlunoRequestDTO alunoDTO){
        service.cadastrarAluno(alunoDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Aluno cadastrado com sucesso! ✅"));

    }

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> listarTodos(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarAluno(@PathVariable Long id,
                                                              @RequestBody AlunoRequestDTO alunoDTO){
        service.atualizarAluno(id, alunoDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Aluno atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarAluno(@PathVariable Long id){
        service.deletarAluno(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Aluno deletado com sucesso! 🗑️"));
    }
}
