package com.proyectofinaljava.proyectofinal.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofinaljava.proyectofinal.model.Factura;
import com.proyectofinaljava.proyectofinal.services.FacturaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/facturas")
public class FacturaController {
    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }
    @PostMapping
    public Factura createFactura(@RequestBody Factura factura) {
        return facturaService.createFactura(factura);
    }
    
    @GetMapping
    public List<Factura> getFacturas() {
        return facturaService.getFacturas();
    }

    
}
