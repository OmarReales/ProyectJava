package com.proyectofinaljava.proyectofinal.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectofinaljava.proyectofinal.repository.ClienteRepository;
import com.proyectofinaljava.proyectofinal.model.Cliente;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    
}
