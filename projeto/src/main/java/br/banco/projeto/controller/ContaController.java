package br.banco.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.banco.projeto.model.Conta;
import br.banco.projeto.services.ContaService;

@RestController // indica que esta classe é um Controller REST
@CrossOrigin("*") // aceita requisições de outros servidores
@RequestMapping("/conta") // nomo usado no "recurso" da URL
public class ContaController {

    @Autowired
    private ContaService service;

    @PostMapping("/nova")
    public ResponseEntity<Conta> criarConta() {
        Conta novaConta = service.criarNovaConta();
        return ResponseEntity.ok(novaConta);
    }

}
