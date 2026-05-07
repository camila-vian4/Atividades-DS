package com.example.game.controller;

import com.example.game.dto.PersonagemRequestDTO;
import com.example.game.dto.PersonagemResponseDTO;
import com.example.game.service.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrar(@Valid @RequestBody PersonagemRequestDTO personagemDTO){
        service.cadastrarPersonagem(personagemDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem", "Personagem cadastrado com sucesso! ✅"));
    }

    @GetMapping
    public ResponseEntity<List<PersonagemResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarPersonagem(@PathVariable Long id,
                                                                    @RequestBody PersonagemRequestDTO personagemDTO) {
        service.atualizarPersonagem(id, personagemDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Personagem atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarPersonagem(@PathVariable Long id){
        service.deletarPersonagem(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Personagem deletado com sucesso! ✅🗑️"));
    }
}
