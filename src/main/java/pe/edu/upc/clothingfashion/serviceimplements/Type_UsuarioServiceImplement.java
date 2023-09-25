package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Type_Usuario;
import pe.edu.upc.clothingfashion.repositories.IType_UsuarioRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IType_UsuarioService;
@Service
public class Type_UsuarioServiceImplement implements IType_UsuarioService {
    @Autowired
    private IType_UsuarioRepository tuR;
    @Override
    public void insert(Type_Usuario typeUsuario) {
        tuR.save(typeUsuario);
    }

    @Override
    public void delete(int idType_Usuario) {
        tuR.deleteById(idType_Usuario);
    }
}
