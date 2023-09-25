package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Store;

public interface IStoreRepository extends JpaRepository<Store, Integer> {
}
