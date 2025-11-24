package cl.SaborGourmet.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.SaborGourmet.demo.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
