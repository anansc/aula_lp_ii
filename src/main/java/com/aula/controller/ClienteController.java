package com.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    @GetMapping("cliente/listar")
    public String listar(){
        return "modulos/cliente/listar";
    }

    @GetMapping("cliente/adicionar")
    public String adicionar(){
        return "modulos/cliente/adicionar";
    }

}