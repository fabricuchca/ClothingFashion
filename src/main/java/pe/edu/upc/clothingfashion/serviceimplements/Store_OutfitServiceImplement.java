package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Store_Outfit;
import pe.edu.upc.clothingfashion.repositories.IStore_OutfitRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IStore_OutfitService;
@Service
public class Store_OutfitServiceImplement implements IStore_OutfitService {
    @Autowired
    private IStore_OutfitRepository toR;
    @Override
    public void insert(Store_Outfit store_outfit) {
        toR.save(store_outfit);
    }

    @Override
    public void delete(int idStore_Outfit) {
        toR.deleteById(idStore_Outfit);
    }
}
