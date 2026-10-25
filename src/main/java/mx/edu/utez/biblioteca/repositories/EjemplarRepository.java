package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.Ejemplar;
import mx.edu.utez.biblioteca.enums.EstadoEjemplar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EjemplarRepository extends JpaRepository<Ejemplar, Integer> {

    Optional<Ejemplar> findByFolio(String folio);

    List<Ejemplar> findByTitulo_IdTituloAndEstado(Integer idTitulo, EstadoEjemplar estado);
}
