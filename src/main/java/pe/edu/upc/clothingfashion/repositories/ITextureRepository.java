package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Texture;

public interface ITextureRepository extends JpaRepository<Texture, Integer> {
}
