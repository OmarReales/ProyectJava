package com.proyectofinaljava.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectofinaljava.proyectofinal.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Producto findByNombre(String nombre);
    Producto findByPrecio(Double precio);
    // Producto findByStock(Integer stock);
}
