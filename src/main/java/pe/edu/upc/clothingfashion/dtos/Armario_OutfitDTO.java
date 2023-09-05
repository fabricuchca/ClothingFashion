package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Armario;
import pe.edu.upc.clothingfashion.entities.Outfit;
import java.time.LocalDate;

public class Armario_OutfitDTO {
    private int idArmario_Outfit;
    private LocalDate fechaAgregacion;
    private Outfit outfit;
    private Armario armario;

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
