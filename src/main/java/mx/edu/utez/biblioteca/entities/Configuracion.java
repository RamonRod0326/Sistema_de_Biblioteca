package mx.edu.utez.biblioteca.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

// parametros generales del sistema, la idea es que solo haya un registro
@Entity
@Table(name = "configuracion")
public class Configuracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_configuracion")
    private Integer idConfiguracion;

    @Column(name = "dias_retencion_reserva", nullable = false)
    private Integer diasRetencionReserva;

    @Column(name = "multa_por_dia_general", precision = 8, scale = 2, nullable = false)
    private BigDecimal multaPorDiaGeneral;

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    public Configuracion() {
    }

    public Integer getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public Integer getDiasRetencionReserva() {
        return diasRetencionReserva;
    }

    public void setDiasRetencionReserva(Integer diasRetencionReserva) {
        this.diasRetencionReserva = diasRetencionReserva;
    }

    public BigDecimal getMultaPorDiaGeneral() {
        return multaPorDiaGeneral;
    }

    public void setMultaPorDiaGeneral(BigDecimal multaPorDiaGeneral) {
        this.multaPorDiaGeneral = multaPorDiaGeneral;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
