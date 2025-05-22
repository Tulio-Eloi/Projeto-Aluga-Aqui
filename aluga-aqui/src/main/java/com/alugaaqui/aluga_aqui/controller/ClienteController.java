package com.alugaaqui.aluga_aqui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @GetMapping //escuta as requisições GET (verificar)
    public String helloWorld(){
        return "hello";
    }
}
