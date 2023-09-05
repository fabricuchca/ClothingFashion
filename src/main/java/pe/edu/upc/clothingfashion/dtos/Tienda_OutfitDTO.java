package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Outfit;
import pe.edu.upc.clothingfashion.entities.Tienda;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class Tienda_OutfitDTO {
    private int idTienda_Outfit;
    private LocalDate fechaDisponibilidad;
    private Tienda tienda;
    private Outfit outfit;

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
