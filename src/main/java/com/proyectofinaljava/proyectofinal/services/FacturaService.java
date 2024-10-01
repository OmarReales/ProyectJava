package com.proyectofinaljava.proyectofinal.services;

import org.springframework.stereotype.Service;

import com.proyectofinaljava.proyectofinal.model.Factura;
import com.proyectofinaljava.proyectofinal.repository.FacturaRepository;
import java.util.List;

@Service
public class FacturaService {
    private final FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public Factura createFactura(Factura factura) {
        double total = factura.getItems().stream().mapToDouble(item -> item.getProducto().getPrecio() * item.getCantidad()).sum();
        factura.setTotal(total);
        return facturaRepository.save(factura);
    }

    public List<Factura> getFacturas() {
        return facturaRepository.findAll();
    }
}
