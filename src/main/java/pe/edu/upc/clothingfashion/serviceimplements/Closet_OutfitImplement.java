package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Closet_Outfit;
import pe.edu.upc.clothingfashion.repositories.ICloset_OutfitRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICloset_OutfitService;
@Service
public class Closet_OutfitImplement implements ICloset_OutfitService {
    @Autowired
    private ICloset_OutfitRepository aoR;
    @Override
    public void insert(Closet_Outfit closet_outfit) {
        aoR.save(closet_outfit);
    }

    @Override
    public void delete(int idCloset_Outfit) {
        aoR.deleteById(idCloset_Outfit);
    }
}
