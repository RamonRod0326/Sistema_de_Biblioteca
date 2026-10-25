package mx.edu.utez.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import mx.edu.utez.biblioteca.enums.CondicionEjemplar;
import mx.edu.utez.biblioteca.enums.EstadoEjemplar;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ejemplar")
public class Ejemplar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ejemplar")
    private Integer idEjemplar;

    @ManyToOne
    @JoinColumn(name = "id_titulo", nullable = false)
    private Titulo titulo;

    @Column(name = "folio", length = 20, nullable = false, unique = true)
    private String folio;

    @Column(name = "ubicacion", length = 60)
    private String ubicacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "condicion", nullable = false)
    private CondicionEjemplar condicion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoEjemplar estado = EstadoEjemplar.disponible;

    @Column(name = "fecha_alta", nullable = false)
    private LocalDateTime fechaAlta;

    @JsonIgnore
    @OneToMany(mappedBy = "ejemplar")
    private List<Prestamo> prestamos;

    @JsonIgnore
    @OneToMany(mappedBy = "ejemplar")
    private List<Reserva> reservas;

    public Ejemplar() {
    }

    public Integer getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(Integer idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public CondicionEjemplar getCondicion() {
        return condicion;
    }

    public void setCondicion(CondicionEjemplar condicion) {
        this.condicion = condicion;
    }

    public EstadoEjemplar getEstado() {
        return estado;
    }

    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
