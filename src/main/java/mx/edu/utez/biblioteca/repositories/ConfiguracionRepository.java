package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.Configuracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionRepository extends JpaRepository<Configuracion, Integer> {
}
