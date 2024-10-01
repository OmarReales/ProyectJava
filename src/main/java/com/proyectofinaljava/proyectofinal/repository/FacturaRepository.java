package com.proyectofinaljava.proyectofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectofinaljava.proyectofinal.model.Cliente;
import com.proyectofinaljava.proyectofinal.model.Factura;
// import com.proyectofinaljava.proyectofinal.model.Producto;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
    // Factura findByFecha(String fecha);
    Factura findByTotal(Double total);
    Factura findByCliente(Cliente cliente);
    // Factura findByProducto(Producto producto);
    // Factura findByCantidad(Integer cantidad);
    // Factura findByPrecio(Double precio);
    // Factura findBySubtotal(Double subtotal);

}
