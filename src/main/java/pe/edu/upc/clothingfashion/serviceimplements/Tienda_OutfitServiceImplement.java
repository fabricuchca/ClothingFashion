package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Tienda_Outfit;
import pe.edu.upc.clothingfashion.repositories.ITienda_OutfitRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITienda_OutfitService;
@Service
public class Tienda_OutfitServiceImplement implements ITienda_OutfitService {
    @Autowired
    private ITienda_OutfitRepository toR;
    @Override
    public void insert(Tienda_Outfit tienda_outfit) {
        toR.save(tienda_outfit);
    }

    @Override
    public void delete(int idTienda_Outfit) {
        toR.deleteById(idTienda_Outfit);
    }
}
