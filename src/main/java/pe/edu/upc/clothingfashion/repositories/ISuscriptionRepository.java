package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Suscription;
@Repository
public interface ISuscriptionRepository extends JpaRepository<Suscription, Integer> {
}
