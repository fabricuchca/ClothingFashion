package pe.edu.upc.clothingfashion.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Clothing;

import java.util.List;

public interface IClothingRepository extends JpaRepository<Clothing, Integer> {
    List<Clothing> findByColor(int color);
    List<Clothing> findBySeason(int season);
    List<Clothing> findByTexture(int texture);
    List<Clothing> findByBrand(int brand);
    List<Clothing> findByEvent(int event);
}
