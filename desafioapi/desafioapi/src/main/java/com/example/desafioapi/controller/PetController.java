package com.example.desafioapi.controller;

import com.example.desafioapi.model.PetModel;
import com.example.desafioapi.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetRepository repository;

    @GetMapping
    public List<PetModel> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<PetModel> salvar(@RequestBody PetModel pet) {
        repository.save(pet);
        return ResponseEntity.status(HttpStatus.CREATED).body(pet);
    }

}
