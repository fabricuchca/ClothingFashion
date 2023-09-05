package pe.edu.upc.clothingfashion.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Tipo_Prenda;
import pe.edu.upc.clothingfashion.repositories.ITipoPrendaRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITipoPrendaService;

import java.util.List;

@Service
public class TipoPrendaServiceImplement implements ITipoPrendaService {
    @Autowired
    private ITipoPrendaRepository tpR;

    @Override
    public void insert(Tipo_Prenda tipoPrenda) {
        tpR.save(tipoPrenda);
    }

    @Override
    public List<Tipo_Prenda> list() {
        return tpR.findAll();
    }

    @Override
    public void delete(int idTipoPrenda) {
        tpR.deleteById(idTipoPrenda);
    }

    @Override
    public Tipo_Prenda listId(int idTipoPrenda) {
        return tpR.findById(idTipoPrenda).orElse(new Tipo_Prenda());
    }
}
