package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.Multa;
import mx.edu.utez.biblioteca.enums.EstadoMulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MultaRepository extends JpaRepository<Multa, Integer> {

    List<Multa> findByEstado(EstadoMulta estado);
}
