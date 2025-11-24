package cl.SaborGourmet.demo.models;

import jakarta.persistence.*;

// Representa una mesa en el restaurante
@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único de la mesa

    private int numero; // Número de la mesa
    private int capacidad; // Cantidad de personas que puede acomodar
    private boolean disponible; // Indica si la mesa está disponible

    // Constructor vacío requerido por JPA
    public Mesa() {
    }

    // Constructor para crear una mesa con número, capacidad y disponibilidad
    public Mesa(int numero, int capacidad, boolean disponible) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
