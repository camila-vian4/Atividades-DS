package com.example.spring_basico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public  String mensagem(){
        return "Seja Bem-vindo(a)!";
    }

    @GetMapping("/dev")
    public String nomeDev(){
        return "Feito por: mila.javacodes";
    }
}
