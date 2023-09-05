package pe.edu.upc.clothingfashion.serviceinterfaces;


import pe.edu.upc.clothingfashion.entities.Marca;

import java.util.List;

public interface IMarcaService {
    public void insert(Marca marca);
    public List<Marca>list();
    public void delete(int idMarca);
    public Marca listId(int idMarca);
}
