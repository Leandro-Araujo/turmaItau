package br.banco.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.banco.projeto.model.Conta;

// CRUD = Create(criar), Read(ler), Update(atualizar), Delete(apagar)
public interface ContaRepository extends CrudRepository<Conta, Long> {
    
}
