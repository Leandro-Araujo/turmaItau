package br.banco.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.banco.projeto.model.Conta;
import br.banco.projeto.repository.ContaRepository;

// as classes de Service é onde implementamos as regras de negócio

@Service // indica que esta classe será um serviço (intermediário entre o modelo e o controller)
public class ContaService {
    
    // interface --> classe --> objeto (repo) == Autowired
    @Autowired // injeção de dependênia = criar um objeto do tipo ContaRepository
    private ContaRepository repo;

    public Conta criarNovaConta() {
        Conta novaConta = new Conta(); // cria um novo objeto Conta
        Conta contaCriada = repo.save(novaConta); // insere o novo objeto no BD
        return contaCriada; // retorna a conta que foi inserida no BD
    }

}
