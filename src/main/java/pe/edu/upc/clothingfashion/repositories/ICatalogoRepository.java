package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Catalogo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Calendar;

public interface ICatalogoRepository extends JpaRepository<Catalogo, Integer> {
}
