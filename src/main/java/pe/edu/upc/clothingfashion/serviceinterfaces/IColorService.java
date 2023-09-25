package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Color;

public interface IColorService {
    public void insert(Color color);
    public void delete(int idColor);
}
