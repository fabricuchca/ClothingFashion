package pe.edu.upc.clothingfashion.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Closet;
import java.util.List;

public interface IClosetRepository extends JpaRepository<Closet, Integer>
{
    List<Closet> findBystyleCloset(String styleCloset);

}
