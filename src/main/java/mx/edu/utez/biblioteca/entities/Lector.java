package mx.edu.utez.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import mx.edu.utez.biblioteca.enums.EstadoLector;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "lector")
public class Lector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lector")
    private Integer idLector;

    @ManyToOne
    @JoinColumn(name = "id_tipo_lector", nullable = false)
    private TipoLector tipoLector;

    @Column(name = "folio", length = 20, nullable = false, unique = true)
    private String folio;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;

    @Column(name = "apellidos", length = 80, nullable = false)
    private String apellidos;

    @Column(name = "correo", length = 120)
    private String correo;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoLector estado = EstadoLector.activo;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    @JsonIgnore
    @OneToMany(mappedBy = "lector")
    private List<Prestamo> prestamos;

    @JsonIgnore
    @OneToMany(mappedBy = "lector")
    private List<Reserva> reservas;

    public Lector() {
    }

    public Integer getIdLector() {
        return idLector;
    }

    public void setIdLector(Integer idLector) {
        this.idLector = idLector;
    }

    public TipoLector getTipoLector() {
        return tipoLector;
    }

    public void setTipoLector(TipoLector tipoLector) {
        this.tipoLector = tipoLector;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EstadoLector getEstado() {
        return estado;
    }

    public void setEstado(EstadoLector estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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
