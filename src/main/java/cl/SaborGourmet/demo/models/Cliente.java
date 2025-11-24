package cl.SaborGourmet.demo.models;

import jakarta.persistence.*;

// Representa un cliente en la base de datos
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único del cliente

    private String nombre; // Nombre del cliente
    private String telefono; // Teléfono de contacto

    // Constructor vacío requerido por JPA
    public Cliente() {
    }

    // Constructor para crear un cliente con nombre y teléfono
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
