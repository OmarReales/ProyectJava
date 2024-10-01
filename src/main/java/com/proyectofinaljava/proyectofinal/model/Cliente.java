package com.proyectofinaljava.proyectofinal.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false, unique = true)
    private String dni;
    private String email;
    private String telefono;
    private String direccion;

    @Override
    public String toString(){
        return "Cliente{" +
                "id: " + id +
                ", nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", dni: '" + dni + '\'' +
                ", email: '" + email + '\'' +
                ", telefono: '" + telefono + '\'' +
                ", direccion: '" + direccion + '\'' +
                '}';
    }
}
