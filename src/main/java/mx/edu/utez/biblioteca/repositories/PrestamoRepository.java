package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.Prestamo;
import mx.edu.utez.biblioteca.enums.EstadoPrestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

    List<Prestamo> findByLector_IdLector(Integer idLector);

    // para validar el max_prestamos del tipo de lector
    long countByLector_IdLectorAndEstado(Integer idLector, EstadoPrestamo estado);
}
