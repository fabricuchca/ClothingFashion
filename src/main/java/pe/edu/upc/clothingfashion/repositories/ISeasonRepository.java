package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Season;

public interface ISeasonRepository extends JpaRepository<Season, Integer> {
}
