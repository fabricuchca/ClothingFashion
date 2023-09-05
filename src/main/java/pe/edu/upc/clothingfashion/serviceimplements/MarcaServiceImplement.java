package pe.edu.upc.clothingfashion.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Marca;
import pe.edu.upc.clothingfashion.repositories.IMarcaRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IMarcaService;

import java.util.List;

@Service
public class MarcaServiceImplement implements IMarcaService {
    @Autowired
    private IMarcaRepository mR;
    @Override
    public void insert(Marca marca) {
        mR.save(marca);
    }

    @Override
    public List<Marca> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMarca) {
        mR.deleteById(idMarca);
    }

    @Override
    public Marca listId(int idMarca) {
        return mR.findById(idMarca).orElse(new Marca());
    }
}
