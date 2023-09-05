package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Suscipcion")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column(name = "monto",nullable = false,length = 6)
    private double monto;
    @Column(name = "fechaPago",nullable = false)
    private LocalDate fechaPago;
    @Column(name = "estado",nullable = false)
    private char estado;
    @Column(name = "inicioSuscripcion",nullable = false)
    private LocalDate inicioSuscripcion;
    @OneToOne
    @JoinColumn
    private Usuario usuario;

    public Suscripcion() {
    }

    public Suscripcion(int idSuscripcion, double monto, LocalDate fechaPago, char estado, LocalDate inicioSuscripcion, Usuario usuario) {
        this.idSuscripcion = idSuscripcion;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.estado = estado;
        this.inicioSuscripcion = inicioSuscripcion;
        this.usuario = usuario;
    }

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
