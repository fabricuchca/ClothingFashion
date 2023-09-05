package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Recomendaciones;
import pe.edu.upc.clothingfashion.repositories.IRecomendacionesRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IRecomendacionesService;

import java.util.List;

@Service
public class RecomendacionesImplement implements IRecomendacionesService {
    private IRecomendacionesRepository rR;
    @Override
    public void insert(Recomendaciones recomendaciones) {
        rR.save(recomendaciones);
    }

    @Override
    public void delete(int idRecomendaciones) {
        rR.deleteById(idRecomendaciones);
    }

    @Override
    public Recomendaciones listId(int idRecomendaciones) {
        return rR.findById(idRecomendaciones).orElse(new Recomendaciones());
    }

    @Override
    public List<Recomendaciones> findByEtiquetaCategoria (String etiquetaCategoria){
        return rR.findByEtiquetaCategoria(etiquetaCategoria);
    }
}
