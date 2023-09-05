package pe.edu.upc.clothingfashion.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Armario;
import java.util.List;

public interface IArmarioRepository extends JpaRepository<Armario, Integer>
{
    List<Armario> findByEstiloArmario(String estiloArmario);

}
