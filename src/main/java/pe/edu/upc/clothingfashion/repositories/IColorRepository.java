package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Color;

public interface IColorRepository  extends JpaRepository<Color, Integer> {

}
