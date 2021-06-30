package br.banco.projeto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // indica que está classe é um controller REST
@CrossOrigin("*") // aceita requisições crossOrigin, de outras origens
@RequestMapping("/exemplo") // "/exemplo" é o nome deste 'recurso', o que aciona esta classe
public class HelloController {
    
    @GetMapping("/hello")
    public String ola() {
        return "Boa tarde!";
    }

}
