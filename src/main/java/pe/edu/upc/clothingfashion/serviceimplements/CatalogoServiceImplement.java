package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Catalogo;
import pe.edu.upc.clothingfashion.repositories.ICatalogoRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICatalogoService;
@Service
public class CatalogoServiceImplement implements ICatalogoService {
    @Autowired
    private ICatalogoRepository catR;
    @Override
    public void insert(Catalogo catalogo) {
        catR.save(catalogo);
    }

    @Override
    public void delete(int idCatalogo) {
        catR.deleteById(idCatalogo);
    }
}
