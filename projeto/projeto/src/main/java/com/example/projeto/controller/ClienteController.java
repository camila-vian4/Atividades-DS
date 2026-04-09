package com.example.projeto.controller;

import com.example.projeto.model.ClienteModel;
import com.example.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteModel> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ClienteModel cliente) {
        service.salvarCliente(cliente);
        return ResponseEntity
                .status(HttpStatus
                        .CREATED).body(Map.of("mensagem", "Cliente cadastrado com sucesso!"));
    }
}
