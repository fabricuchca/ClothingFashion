package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comentarios")
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentarios;
    @Column(name = "descripcionComentario",nullable = false,length = 500)
    private String descripcionComentario;
    @Column(name = "fechaComentario",nullable = false)
    private LocalDate fechaComentario;
    @Column(name = "puntaje",nullable = false,length = 1)
    private int puntaje;
    @ManyToOne
    @JoinColumn
    private Outfit outfit;

    public Comentarios() {
    }

    public Comentarios(int idComentarios, String descripcionComentario, LocalDate fechaComentario, int puntaje, Outfit outfit) {
        this.idComentarios = idComentarios;
        this.descripcionComentario = descripcionComentario;
        this.fechaComentario = fechaComentario;
        this.puntaje = puntaje;
        this.outfit = outfit;
    }

    public int getIdComentarios() {
        return idComentarios;
    }

    public void setIdComentarios(int idComentarios) {
        this.idComentarios = idComentarios;
    }

    public String getDescripcionComentario() {
        return descripcionComentario;
    }

    public void setDescripcionComentario(String descripcionComentario) {
        this.descripcionComentario = descripcionComentario;
    }

    public LocalDate getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDate fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
