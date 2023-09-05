package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Evento;
public interface IEventoService {
    public void insert(Evento evento);
    public void delete(int idEvento);
}
