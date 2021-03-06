package br.itau.projetofinal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.itau.projetofinal.model.Cliente;
import br.itau.projetofinal.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepo;

    public Cliente inserirCliente(Cliente clienteNovo) {
        Cliente clienteInserido = clienteRepo.save(clienteNovo);
        return clienteInserido;
    }
}
