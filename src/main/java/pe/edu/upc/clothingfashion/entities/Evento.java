package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;

@Entity
@Table(name = "Evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvento;
    @Column(name = "tematica",nullable = false,length = 50)
    private String tematica;
    @Column(name = "descripcionEvento",nullable = false,length = 50)
    private String descripcionEvento;
    public Evento() {
    }
    public Evento(int idEvento, String tematica, String descripcionEvento) {
        this.idEvento = idEvento;
        this.tematica = tematica;
        this.descripcionEvento = descripcionEvento;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }
}
