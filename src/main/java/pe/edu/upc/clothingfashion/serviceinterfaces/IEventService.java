package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Event;
public interface IEventService {
    public void insert(Event event);
    public void delete(int idEvent);
}
