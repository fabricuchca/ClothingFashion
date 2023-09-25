package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
    List<Usuario> findByUsuarioTag(String usuarioTag);

}
