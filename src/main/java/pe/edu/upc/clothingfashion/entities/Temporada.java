package pe.edu.upc.clothingfashion.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Temporada")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTemporada;
    @Column(name = "nombreTemporada",nullable = false,length = 20)
    private String nombreTemporada;
    @Column(name = "fechaInicio",nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fechaFin",nullable = false)
    private LocalDate fechaFin;
    @Column(name = "descripcionTemporada",nullable = false,length = 50)
    private String descripcionTemporada;
    public Temporada() {
    }
    public Temporada(int idTemporada, String nombreTemporada, LocalDate fechaInicio, LocalDate fechaFin, String descripcionTemporada) {
        this.idTemporada = idTemporada;
        this.nombreTemporada = nombreTemporada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcionTemporada = descripcionTemporada;
    }

    public int getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(int idTemporada) {
        this.idTemporada = idTemporada;
    }

    public String getNombreTemporada() {
        return nombreTemporada;
    }

    public void setNombreTemporada(String nombreTemporada) {
        this.nombreTemporada = nombreTemporada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcionTemporada() {
        return descripcionTemporada;
    }

    public void setDescripcionTemporada(String descripcionTemporada) {
        this.descripcionTemporada = descripcionTemporada;
    }
}
