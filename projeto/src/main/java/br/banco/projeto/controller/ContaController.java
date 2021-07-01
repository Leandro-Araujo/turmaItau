package br.banco.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.banco.projeto.model.Conta;
import br.banco.projeto.services.ContaService;

@RestController // indica que esta classe é um Controller REST
@CrossOrigin("*") // aceita requisições de outros servidores
@RequestMapping("/conta") // nomo usado no "recurso" da URL
public class ContaController {

    @Autowired // vai 'injetar' um objeto do repository para usarmos nos métodos abaixo
    private ContaService service;

    @PostMapping("/nova") // indica que a chamada deste método será do tipo POST no recuro 'nova'
    public ResponseEntity<Conta> criarConta() {
        Conta novaConta = service.criarNovaConta();
        return ResponseEntity.ok(novaConta);
    }

    @GetMapping("/todas")
    public ResponseEntity<List<Conta>> listarTodasContas() {
        List<Conta> contas = service.listarContas();
        return ResponseEntity.ok(contas);
    }

    @GetMapping("/{numero}") // path = caminho, rota
    public ResponseEntity<Conta> buscarContaPorNumero(@PathVariable long numero) {
        Conta contaEncontrada = service.buscarPorNumero(numero);

        if(contaEncontrada != null) {
            return ResponseEntity.ok(contaEncontrada);
        }
        return ResponseEntity.notFound().build();
    }
    
}
