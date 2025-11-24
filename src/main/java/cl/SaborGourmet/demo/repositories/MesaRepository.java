package cl.SaborGourmet.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.SaborGourmet.demo.models.Mesa;

public interface MesaRepository extends JpaRepository<Mesa, Long> {
}
