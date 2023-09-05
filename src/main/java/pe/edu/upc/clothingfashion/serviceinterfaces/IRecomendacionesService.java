package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Recomendaciones;

import java.util.List;

public interface IRecomendacionesService {
    public void insert(Recomendaciones recomendaciones);
    public void delete(int idRecomendaciones);
    public Recomendaciones listId(int idRecomendaciones);
    List<Recomendaciones> findByEtiquetaCategoria(String etiquetaCategoria);

}
