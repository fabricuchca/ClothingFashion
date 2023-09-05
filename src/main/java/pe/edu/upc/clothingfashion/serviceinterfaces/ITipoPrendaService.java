package pe.edu.upc.clothingfashion.serviceinterfaces;


import pe.edu.upc.clothingfashion.entities.Tipo_Prenda;

import java.util.List;

public interface ITipoPrendaService {
    public void insert(Tipo_Prenda tipoPrenda);
    public List<Tipo_Prenda>list();
    public void delete(int idTipoPrenda);
    public Tipo_Prenda listId(int idTipoPrenda);
}
