package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.repositories.IEventRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IEventService;

@Service
public class EventServiceImplement implements IEventService {
    private IEventRepository eR;
    @Override
    public void insert(Event event) {
        eR.save(event);
    }

    @Override
    public void delete(int idEvent) {
        eR.deleteById(idEvent);
    }
}
