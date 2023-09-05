package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Armario_Outfit;
import pe.edu.upc.clothingfashion.repositories.IArmario_OutfitRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IArmario_OutfitService;
@Service
public class Armario_OutfitImplement implements IArmario_OutfitService {
    @Autowired
    private IArmario_OutfitRepository aoR;
    @Override
    public void insert(Armario_Outfit armario_outfit) {
        aoR.save(armario_outfit);
    }

    @Override
    public void delete(int idArmario_Outfit) {
        aoR.deleteById(idArmario_Outfit);
    }
}
