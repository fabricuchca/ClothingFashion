package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Tienda;
import pe.edu.upc.clothingfashion.repositories.ITiendaRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITiendaService;

import java.util.List;

@Service
public class TiendaServiceImplement implements ITiendaService {
    @Autowired
    private ITiendaRepository tiR;
    @Override
    public void insert(Tienda tienda) {
        tiR.save(tienda);
    }

    @Override
    public void delete(int idTienda) {
        tiR.deleteById(idTienda);
    }

    @Override
    public List<Tienda> list() {
        return tiR.findAll();
    }
}
