package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;

public class SuscripcionDTO {
    private int idSuscripcion;
    private double monto;
    private LocalDate fechaPago;
    private char estado;
    private LocalDate inicioSuscripcion;
    private Usuario usuario;

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public LocalDate getInicioSuscripcion() {
        return inicioSuscripcion;
    }

    public void setInicioSuscripcion(LocalDate inicioSuscripcion) {
        this.inicioSuscripcion = inicioSuscripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
