package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Catalogo;
import pe.edu.upc.clothingfashion.entities.Color;

public interface ICatalogoService {
    public void insert(Catalogo catalogo);
    public void delete(int idCatalogo);
}
