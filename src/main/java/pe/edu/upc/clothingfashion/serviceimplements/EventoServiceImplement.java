package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Evento;
import pe.edu.upc.clothingfashion.repositories.IEventoRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IEventoService;

@Service
public class EventoServiceImplement implements IEventoService {
    private IEventoRepository eR;
    @Override
    public void insert(Evento evento) {
        eR.save(evento);
    }

    @Override
    public void delete(int idEvento) {
        eR.deleteById(idEvento);
    }
}
