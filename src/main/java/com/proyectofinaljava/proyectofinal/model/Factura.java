package com.proyectofinaljava.proyectofinal.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    @OneToMany(mappedBy = "factura",  cascade = CascadeType.ALL)
    private List<ItemFactura> items;
    private Double total;
}
