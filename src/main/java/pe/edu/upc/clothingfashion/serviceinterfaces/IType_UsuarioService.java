package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Type_Usuario;

public interface IType_UsuarioService {
    public void insert(Type_Usuario typeUsuario);
    public void delete(int idType_Usuario);
}
