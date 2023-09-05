package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Temporada;

public interface ITemporadaRepository extends JpaRepository<Temporada, Integer> {
}
