package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Armario;
import pe.edu.upc.clothingfashion.entities.Comentarios;
import pe.edu.upc.clothingfashion.repositories.IArmarioRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IArmarioService;

import java.util.List;

@Service
public class ArmarioServiceImplement implements IArmarioService {
    @Autowired
    private IArmarioRepository aR;
    @Override
    public void insert(Armario armario) {
        aR.save(armario);
    }

    @Override
    public void delete(int idArmario) {
        aR.deleteById(idArmario);
    }

    @Override
    public Armario listId(int idArmario) {
        return aR.findById(idArmario).orElse(new Armario());
    }

    @Override
    public List<Armario> findByEstiloArmario(String estiloArmario) {
        return aR.findByEstiloArmario(estiloArmario);
    }
}
