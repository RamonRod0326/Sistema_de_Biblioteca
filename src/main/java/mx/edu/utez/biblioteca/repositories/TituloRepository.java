package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TituloRepository extends JpaRepository<Titulo, Integer> {

    Optional<Titulo> findByIsbn(String isbn);

    List<Titulo> findByTituloContainingIgnoreCase(String titulo);
}
