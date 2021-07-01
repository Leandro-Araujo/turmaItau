package br.banco.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.banco.projeto.model.Conta;

// CRUD = Create(criar), Read(ler), Update(atualizar), Delete(apagar)
// interface parecido com class abstrata = não pode criar objetos

public interface ContaRepository extends CrudRepository<Conta, Long> {
    
}
