package cl.SaborGourmet.demo.controllers;

import cl.SaborGourmet.demo.models.Cliente;
import cl.SaborGourmet.demo.models.Mesa;
import cl.SaborGourmet.demo.models.Reserva;
import cl.SaborGourmet.demo.repositories.ClienteRepository;
import cl.SaborGourmet.demo.repositories.MesaRepository;
import cl.SaborGourmet.demo.services.ReservaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService reservaService;
    private final ClienteRepository clienteRepo;
    private final MesaRepository mesaRepo;

    // Constructor para inyección de dependencias
    public ReservaController(ReservaService reservaService, ClienteRepository clienteRepo, MesaRepository mesaRepo) {
        this.reservaService = reservaService;
        this.clienteRepo = clienteRepo;
        this.mesaRepo = mesaRepo;
    }

    // Muestra todas las reservas
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("reservas", reservaService.listarReservas());
        return "reservas/lista";
    }

    // Muestra formulario para nueva reserva
    @GetMapping("/nueva")
    public String nuevaReserva(Model model) {
        model.addAttribute("clientes", clienteRepo.findAll());
        model.addAttribute("mesas", mesaRepo.findAll());
        return "reservas/nueva";
    }

    // Guarda una nueva reserva
    @PostMapping("/guardar")
    public String guardarReserva(
            @RequestParam Long clienteId,
            @RequestParam Long mesaId,
            @RequestParam String fecha) {

        Cliente cliente = clienteRepo.findById(clienteId).orElse(null);
        Mesa mesa = mesaRepo.findById(mesaId).orElse(null);
        LocalDateTime fechaRes = LocalDateTime.parse(fecha);

        Reserva reserva = new Reserva(fechaRes, cliente, mesa);
        reservaService.guardar(reserva);

        return "redirect:/reservas";
    }

    // Elimina una reserva
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        reservaService.eliminar(id);
        return "redirect:/reservas";
    }
}
