package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.TipoLector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLectorRepository extends JpaRepository<TipoLector, Integer> {
}
