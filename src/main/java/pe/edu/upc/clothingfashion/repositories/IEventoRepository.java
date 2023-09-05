package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Evento;

public interface IEventoRepository extends JpaRepository<Evento, Integer> {
}
