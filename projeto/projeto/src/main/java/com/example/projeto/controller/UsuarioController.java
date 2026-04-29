package com.example.projeto.controller;

import com.example.projeto.dto.UsuarioRequestDTO;
import com.example.projeto.dto.UsuarioResponseDTO;
import com.example.projeto.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody UsuarioRequestDTO usuarioDTO){
        service.salvarUsuario(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem", "Usuário cadastrado com sucesso."));
    }
}
