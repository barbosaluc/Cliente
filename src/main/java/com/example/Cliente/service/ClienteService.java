package com.example.Cliente.service;


import com.example.Cliente.entities.Cliente;
import com.example.Cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(@RequestBody Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    public List<Cliente> listaCliente() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public void removerPorId(Long id) {
        clienteRepository.deleteById(id);
    }
}