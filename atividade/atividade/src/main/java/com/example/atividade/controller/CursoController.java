package com.example.atividade.controller;

import com.example.atividade.dto.cursodto.CursoRequestDTO;
import com.example.atividade.dto.cursodto.CursoResponseDTO;
import com.example.atividade.dto.professordto.ProfessorRequestDTO;
import com.example.atividade.dto.professordto.ProfessorResponseDTO;
import com.example.atividade.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrarCurso(@Valid @RequestBody CursoRequestDTO cursoDTO){
        service.cadastrarCurso(cursoDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Curso cadastrado com sucesso! ✅"));
    }

    @GetMapping
    public ResponseEntity<List<CursoResponseDTO>> listarTodos(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarCurso(@PathVariable Long id,
                                                              @RequestBody CursoRequestDTO cursoDTO){
        service.atualizarCurso(id, cursoDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Curso atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarCurso(@PathVariable Long id){
        service.deletarCurso(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Curso deletado com sucesso! ✅"));
    }
}
