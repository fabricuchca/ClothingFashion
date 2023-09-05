package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Comentarios;
import pe.edu.upc.clothingfashion.entities.Usuario;
import pe.edu.upc.clothingfashion.repositories.IUsuarioRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IUsuarioService;

import java.util.List;
@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Usuario listId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    @Override
    public List<Usuario> findByUsuarioTag(String usuarioTag) {
        return uR.findByUsuarioTag(usuarioTag);
    }
}
