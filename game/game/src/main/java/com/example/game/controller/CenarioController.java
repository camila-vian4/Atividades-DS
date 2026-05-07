package com.example.game.controller;

import com.example.game.dto.CenarioRequestDTO;
import com.example.game.dto.CenarioResponseDTO;
import com.example.game.service.CenarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cenarios")
public class CenarioController {

    @Autowired
    private CenarioService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrar(@Valid @RequestBody CenarioRequestDTO cenarioDTO){
        service.cadastrarCenario(cenarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem", "Cenário cadastrado com sucesso! ✅"));
    }

    @GetMapping
    public ResponseEntity<List<CenarioResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarCenario(@PathVariable Long id,
                                                                   @RequestBody CenarioRequestDTO cenarioDTO) {
        service.atualizarCenario(id, cenarioDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Cenário atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarCenario(@PathVariable Long id){
        service.deletarCenario(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Cenário deletado com sucesso! ✅🗑️"));
    }
}
