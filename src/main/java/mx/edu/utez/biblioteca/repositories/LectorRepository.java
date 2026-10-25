package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LectorRepository extends JpaRepository<Lector, Integer> {

    Optional<Lector> findByFolio(String folio);
}
