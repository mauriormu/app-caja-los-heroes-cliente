package com.losheroes.app.cliente.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController {
    @GetMapping()
    public String inicio(){
        return "Hola esta funcionando";
    }
}