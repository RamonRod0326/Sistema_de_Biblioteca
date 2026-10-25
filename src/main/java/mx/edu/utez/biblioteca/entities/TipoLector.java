package mx.edu.utez.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tipo_lector")
public class TipoLector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_lector")
    private Integer idTipoLector;

    @Column(name = "nombre", length = 30, nullable = false, unique = true)
    private String nombre;

    @Column(name = "dias_prestamo", nullable = false)
    private Integer diasPrestamo;

    @Column(name = "max_prestamos", nullable = false)
    private Integer maxPrestamos;

    @Column(name = "max_renovaciones", nullable = false)
    private Integer maxRenovaciones;

    @Column(name = "multa_por_dia", precision = 8, scale = 2, nullable = false)
    private BigDecimal multaPorDia;

    @JsonIgnore
    @OneToMany(mappedBy = "tipoLector")
    private List<Lector> lectores;

    public TipoLector() {
    }

    public Integer getIdTipoLector() {
        return idTipoLector;
    }

    public void setIdTipoLector(Integer idTipoLector) {
        this.idTipoLector = idTipoLector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(Integer diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public Integer getMaxPrestamos() {
        return maxPrestamos;
    }

    public void setMaxPrestamos(Integer maxPrestamos) {
        this.maxPrestamos = maxPrestamos;
    }

    public Integer getMaxRenovaciones() {
        return maxRenovaciones;
    }

    public void setMaxRenovaciones(Integer maxRenovaciones) {
        this.maxRenovaciones = maxRenovaciones;
    }

    public BigDecimal getMultaPorDia() {
        return multaPorDia;
    }

    public void setMultaPorDia(BigDecimal multaPorDia) {
        this.multaPorDia = multaPorDia;
    }

    public List<Lector> getLectores() {
        return lectores;
    }

    public void setLectores(List<Lector> lectores) {
        this.lectores = lectores;
    }
}
