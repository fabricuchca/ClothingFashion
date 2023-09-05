package pe.edu.upc.clothingfashion.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Tipo_Prenda;

@Repository
public interface ITipoPrendaRepository extends JpaRepository<Tipo_Prenda,Integer> {
}
