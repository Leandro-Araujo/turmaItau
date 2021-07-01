package br.banco.projeto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é um Controller REST
@CrossOrigin("*") // aceita requisições de outros servidores
@RequestMapping("/conta") // nomo usado no "recurso" da URL
public class ContaController {

    
}
