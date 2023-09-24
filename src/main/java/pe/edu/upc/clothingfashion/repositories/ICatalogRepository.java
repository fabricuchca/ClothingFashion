package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Catalog;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Calendar;
@Repository
public interface ICatalogRepository extends JpaRepository<Catalog, Integer> {
}
