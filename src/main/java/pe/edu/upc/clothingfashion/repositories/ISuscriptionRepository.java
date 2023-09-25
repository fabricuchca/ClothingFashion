package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Suscription;

public interface ISuscriptionRepository extends JpaRepository<Suscription, Integer> {
}
