package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Tienda;

public interface ITiendaRepository extends JpaRepository<Tienda, Integer> {
}
