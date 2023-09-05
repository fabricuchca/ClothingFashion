package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Suscripcion;
import pe.edu.upc.clothingfashion.repositories.ISuscripcionRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISuscripcionService;
@Service
public class SuscripcionServiceImplement implements ISuscripcionService {
    @Autowired
    private ISuscripcionRepository sR;

    @Override
    public void insert(Suscripcion suscripcion) {
        sR.save(suscripcion);
    }

    @Override
    public void delete(int idSuscripcion) {
        sR.deleteById(idSuscripcion);
    }
}
