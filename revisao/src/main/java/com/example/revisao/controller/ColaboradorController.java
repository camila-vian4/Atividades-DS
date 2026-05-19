package com.example.revisao.controller;

import com.example.revisao.dto.ColaboradorRequestDTO;
import com.example.revisao.dto.cliente.ClienteRequestDTO;
import com.example.revisao.dto.cliente.ClienteResponseDTO;
import com.example.revisao.model.ColaboradorModel;
import com.example.revisao.service.ColaboradorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService service;

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrar(@Valid @RequestBody ColaboradorRequestDTO colaboradorDTO){
        service.cadastrar(colaboradorDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Colaborador cadastrado com sucesso! ✅"));

    }
    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listar());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(@PathVariable Long id,
                                                         @RequestBody ColaboradorRequestDTO colaboradorDTO){
        service.atualizar(id,colaboradorDTO);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Colaborador atualizado com sucesso! ✅"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletar(@PathVariable Long id){
        service.deletar(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Colaborador deletado com sucesso! 🗑️"));
    }

}
