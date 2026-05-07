package com.example.game.controller;

import com.example.game.dto.JogadorRequestDTO;
import com.example.game.dto.JogadorResponseDTO;
import com.example.game.dto.PersonagemRequestDTO;
import com.example.game.dto.PersonagemResponseDTO;
import com.example.game.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrarJogador(@Valid @RequestBody JogadorRequestDTO jogadorDTO){
        service.cadastrarJogador(jogadorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem", "Jogador cadastrado com sucesso! ✅"));
    }

    @GetMapping
    public ResponseEntity<List<JogadorResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarJogador(@PathVariable Long id,
                                                                   @RequestBody JogadorRequestDTO jogadorDTO) {
        service.atualizarJogador(id, jogadorDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Jogador atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarJogador(@PathVariable Long id){
        service.deletarJogador(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Jogador deletado com sucesso! ✅🗑️"));
    }
}
