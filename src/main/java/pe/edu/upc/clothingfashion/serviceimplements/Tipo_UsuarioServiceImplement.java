package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Tipo_Usuario;
import pe.edu.upc.clothingfashion.repositories.ITipo_UsuarioRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITipo_UsuarioService;
@Service
public class Tipo_UsuarioServiceImplement implements ITipo_UsuarioService {
    @Autowired
    private ITipo_UsuarioRepository tuR;
    @Override
    public void insert(Tipo_Usuario tipoUsuario) {
        tuR.save(tipoUsuario);
    }

    @Override
    public void delete(int idTipo_Usuario) {
        tuR.deleteById(idTipo_Usuario);
    }
}
