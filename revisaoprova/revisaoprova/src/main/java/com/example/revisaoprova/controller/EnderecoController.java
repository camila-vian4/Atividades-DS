package com.example.revisaoprova.controller;

import com.example.revisaoprova.dto.endereco.EnderecoRequestDTO;
import com.example.revisaoprova.dto.endereco.EnderecoResponseDTO;
import com.example.revisaoprova.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrar(@Valid @RequestBody EnderecoRequestDTO enderecoDTO){
        service.cadastrar((enderecoDTO));
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Endereço cadastrado com sucesso! ✅"));

    }

    @GetMapping
    public ResponseEntity<List<EnderecoResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listar());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id,
                                                         @RequestBody EnderecoRequestDTO enderecoDTO){
        service.atualizar(id,enderecoDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Endereço atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id){
        service.deletar(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Endereço deletado com sucesso! 🗑️"));
    }
}
