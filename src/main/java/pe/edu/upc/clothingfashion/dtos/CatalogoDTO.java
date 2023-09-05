package pe.edu.upc.clothingfashion.dtos;

import pe.edu.upc.clothingfashion.entities.Recomendaciones;
import java.util.List;

public class CatalogoDTO {
    private int idCatalogo;
    private List<Recomendaciones> recomendaciones;

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public List<Recomendaciones> getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(List<Recomendaciones> recomendaciones) {
        this.recomendaciones = recomendaciones;
    }
}
