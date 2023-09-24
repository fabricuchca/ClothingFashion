package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Closet_Outfit;
import pe.edu.upc.clothingfashion.entities.Catalog;

public interface ICloset_OutfitService {
    public void insert(Closet_Outfit closet_outfit);
    public void delete(int idCloset_Outfit);
}
