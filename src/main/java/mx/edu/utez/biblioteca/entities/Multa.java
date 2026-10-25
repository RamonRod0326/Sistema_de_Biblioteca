package mx.edu.utez.biblioteca.entities;

import jakarta.persistence.*;
import mx.edu.utez.biblioteca.enums.EstadoMulta;
import mx.edu.utez.biblioteca.enums.TipoMulta;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "multa")
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_multa")
    private Integer idMulta;

    @ManyToOne
    @JoinColumn(name = "id_prestamo", nullable = false)
    private Prestamo prestamo;

    // usuario que registro la multa
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoMulta tipo;

    @Column(name = "dias_atraso")
    private Integer diasAtraso;

    @Column(name = "monto", precision = 10, scale = 2, nullable = false)
    private BigDecimal monto;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoMulta estado = EstadoMulta.pendiente;

    @Column(name = "fecha_generacion", nullable = false)
    private LocalDateTime fechaGeneracion;

    @Column(name = "fecha_resolucion")
    private LocalDateTime fechaResolucion;

    @Column(name = "observaciones", length = 255)
    private String observaciones;

    public Multa() {
    }

    public Integer getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(Integer idMulta) {
        this.idMulta = idMulta;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoMulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoMulta tipo) {
        this.tipo = tipo;
    }

    public Integer getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public EstadoMulta getEstado() {
        return estado;
    }

    public void setEstado(EstadoMulta estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
