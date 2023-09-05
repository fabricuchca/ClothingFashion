package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Temporada;
import pe.edu.upc.clothingfashion.repositories.ITemporadaRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITemporadaService;
@Service
public class TemporadaServiceImplement implements ITemporadaService {
    @Autowired
    private ITemporadaRepository temR;
    @Override
    public void insert(Temporada temporada) {
        temR.save(temporada);
    }

    @Override
    public void delete(int idTemporada) {
        temR.deleteById(idTemporada);
    }
}
