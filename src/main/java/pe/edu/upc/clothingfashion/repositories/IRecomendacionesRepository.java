package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Recomendaciones;

import java.util.List;

public interface IRecomendacionesRepository extends JpaRepository<Recomendaciones, Integer> {
    List<Recomendaciones>findByEtiquetaCategoria(String etiquetaCategoria);
}
