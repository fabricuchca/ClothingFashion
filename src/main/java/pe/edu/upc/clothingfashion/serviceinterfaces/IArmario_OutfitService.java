package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Armario_Outfit;
import pe.edu.upc.clothingfashion.entities.Catalogo;

public interface IArmario_OutfitService {
    public void insert(Armario_Outfit armario_outfit);
    public void delete(int idArmario_Outfit);
}
