package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Tipo_Usuario;

public interface ITipo_UsuarioService {
    public void insert(Tipo_Usuario tipoUsuario);
    public void delete(int idTipo_Usuario);
}
