package mx.edu.utez.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import mx.edu.utez.biblioteca.enums.EstadoReserva;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Integer idReserva;

    @ManyToOne
    @JoinColumn(name = "id_titulo", nullable = false)
    private Titulo titulo;

    @ManyToOne
    @JoinColumn(name = "id_lector", nullable = false)
    private Lector lector;

    // mientras la reserva esta en cola va en null, se asigna cuando se aparta un ejemplar
    @ManyToOne
    @JoinColumn(name = "id_ejemplar")
    private Ejemplar ejemplar;

    @Column(name = "fecha_solicitud", nullable = false)
    private LocalDateTime fechaSolicitud;

    @Column(name = "fecha_retencion")
    private LocalDateTime fechaRetencion;

    @Column(name = "fecha_limite_recoleccion")
    private LocalDate fechaLimiteRecoleccion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoReserva estado = EstadoReserva.en_cola;

    @Column(name = "fecha_cierre")
    private LocalDateTime fechaCierre;

    @JsonIgnore
    @OneToOne(mappedBy = "reserva")
    private Prestamo prestamo;

    public Reserva() {
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDateTime getFechaRetencion() {
        return fechaRetencion;
    }

    public void setFechaRetencion(LocalDateTime fechaRetencion) {
        this.fechaRetencion = fechaRetencion;
    }

    public LocalDate getFechaLimiteRecoleccion() {
        return fechaLimiteRecoleccion;
    }

    public void setFechaLimiteRecoleccion(LocalDate fechaLimiteRecoleccion) {
        this.fechaLimiteRecoleccion = fechaLimiteRecoleccion;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
}
