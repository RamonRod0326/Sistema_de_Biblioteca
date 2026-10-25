package mx.edu.utez.biblioteca.repositories;

import mx.edu.utez.biblioteca.entities.Reserva;
import mx.edu.utez.biblioteca.enums.EstadoReserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    // cola de reservas de un titulo, la mas vieja primero
    List<Reserva> findByTitulo_IdTituloAndEstadoOrderByFechaSolicitudAsc(Integer idTitulo, EstadoReserva estado);
}
