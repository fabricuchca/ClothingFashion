package pe.edu.upc.clothingfashion.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class TemporadaDTO {
    private int idTemporada;
    private String nombreTemporada;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcionTemporada;

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
