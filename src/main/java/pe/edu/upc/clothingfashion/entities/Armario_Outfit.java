package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Armario_Outfit {
    @Id
    @GeneratedValue
    private int idArmario_Outfit;
    @Column(name = "fechaAgregacion", nullable = false)
    private LocalDate fechaAgregacion;
    @ManyToOne
    @JoinColumn
    private Outfit outfit;
    @ManyToOne
    @JoinColumn
    private Armario armario;

    public Armario_Outfit() {
    }

    public Armario_Outfit(int idArmario_Outfit, LocalDate fechaAgregacion, Outfit outfit, Armario armario) {
        this.idArmario_Outfit = idArmario_Outfit;
        this.fechaAgregacion = fechaAgregacion;
        this.outfit = outfit;
        this.armario = armario;
    }

    public int getIdArmario_Outfit() {
        return idArmario_Outfit;
    }

    public void setIdArmario_Outfit(int idArmario_Outfit) {
        this.idArmario_Outfit = idArmario_Outfit;
    }

    public LocalDate getFechaAgregacion() {
        return fechaAgregacion;
    }

    public void setFechaAgregacion(LocalDate fechaAgregacion) {
        this.fechaAgregacion = fechaAgregacion;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }
}

