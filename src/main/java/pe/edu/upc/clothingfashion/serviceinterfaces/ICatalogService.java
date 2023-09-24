package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.entities.Color;

public interface ICatalogService {
    public void insert(Catalog catalog);
    public void delete(int idCatalog);
}
