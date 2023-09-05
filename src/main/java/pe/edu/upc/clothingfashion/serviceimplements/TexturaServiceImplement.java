package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Textura;
import pe.edu.upc.clothingfashion.repositories.ITexturaRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITexturaService;

@Service
public class TexturaServiceImplement implements ITexturaService {
    @Autowired
    private ITexturaRepository tR;
    @Override
    public void insert(Textura textura) {
        tR.save(textura);
    }

    @Override
    public void delete(int idTextura) {
        tR.deleteById(idTextura);
    }
}
