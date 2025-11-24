package cl.SaborGourmet.demo.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

// Representa una reserva de mesa hecha por un cliente
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único de la reserva

    private LocalDateTime fecha; // Fecha y hora de la reserva

    @ManyToOne
    private Cliente cliente; // Cliente que realiza la reserva

    @ManyToOne
    private Mesa mesa; // Mesa asignada a la reserva

    // Constructor vacío requerido por JPA
    public Reserva() {
    }

    // Constructor para crear una reserva con fecha, cliente y mesa
    public Reserva(LocalDateTime fecha, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}
