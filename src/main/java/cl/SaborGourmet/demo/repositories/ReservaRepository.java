package cl.SaborGourmet.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.SaborGourmet.demo.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
