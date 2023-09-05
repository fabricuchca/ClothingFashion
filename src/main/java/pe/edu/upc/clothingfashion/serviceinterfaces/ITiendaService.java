package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Tienda;

import java.util.List;

public interface ITiendaService {
    public void insert(Tienda tienda);
    public void delete(int idTienda);
    public List<Tienda> list();
}
