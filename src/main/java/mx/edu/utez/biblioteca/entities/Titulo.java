package mx.edu.utez.biblioteca.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import mx.edu.utez.biblioteca.enums.EstadoTitulo;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "titulo")
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_titulo")
    private Integer idTitulo;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @Column(name = "titulo", length = 200, nullable = false)
    private String titulo;

    @Column(name = "autores", length = 255, nullable = false)
    private String autores;

    @Column(name = "isbn", length = 17, unique = true)
    private String isbn;

    @Column(name = "editorial", length = 120)
    private String editorial;

    @Column(name = "anio_publicacion")
    private Short anioPublicacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoTitulo estado = EstadoTitulo.activo;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    @JsonIgnore
    @OneToMany(mappedBy = "titulo")
    private List<Ejemplar> ejemplares;

    @JsonIgnore
    @OneToMany(mappedBy = "titulo")
    private List<Reserva> reservas;

    public Titulo() {
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Short getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Short anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public EstadoTitulo getEstado() {
        return estado;
    }

    public void setEstado(EstadoTitulo estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
