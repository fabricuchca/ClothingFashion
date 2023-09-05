package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Armario;
import java.util.List;

public interface IArmarioService {
    public void insert(Armario armario);
    public void delete(int idArmario);
    public Armario listId(int idArmario);
    List<Armario> findByEstiloArmario(String estiloArmario);

}
