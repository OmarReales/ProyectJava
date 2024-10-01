package com.proyectofinaljava.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectofinaljava.proyectofinal.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByDni(String dni);
    Cliente findByEmail(String email);
    Cliente findByTelefono(String telefono);

}
