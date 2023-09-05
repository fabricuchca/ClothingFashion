package pe.edu.upc.clothingfashion.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tienda_Outfit")
public class Tienda_Outfit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTienda_Outfit;
    @Column(name = "fechaDisponibilidad", nullable = false)
    private LocalDate fechaDisponibilidad;
    @ManyToOne
    @JoinColumn
    private Tienda tienda;
    @ManyToOne
    @JoinColumn
    private Outfit outfit;

    public Tienda_Outfit() {
    }

    public Tienda_Outfit(int idTienda_Outfit, LocalDate fechaDisponibilidad, Tienda tienda, Outfit outfit) {
        this.idTienda_Outfit = idTienda_Outfit;
        this.fechaDisponibilidad = fechaDisponibilidad;
        this.tienda = tienda;
        this.outfit = outfit;
    }

    public int getIdTienda_Outfit() {
        return idTienda_Outfit;
    }

    public void setIdTienda_Outfit(int idTienda_Outfit) {
        this.idTienda_Outfit = idTienda_Outfit;
    }

    public LocalDate getFechaDisponibilidad() {
        return fechaDisponibilidad;
    }

    public void setFechaDisponibilidad(LocalDate fechaDisponibilidad) {
        this.fechaDisponibilidad = fechaDisponibilidad;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
