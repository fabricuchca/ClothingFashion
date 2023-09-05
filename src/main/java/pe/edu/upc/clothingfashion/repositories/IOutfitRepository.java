package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Outfit;
import java.util.List;

public interface IOutfitRepository extends JpaRepository<Outfit, Integer> {
    List<Outfit> findByEstiloOutfit(String estiloOutfit);

}
