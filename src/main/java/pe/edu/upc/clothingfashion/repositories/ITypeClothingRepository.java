package pe.edu.upc.clothingfashion.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clothingfashion.entities.Type_Clothing;
@Repository
public interface ITypeClothingRepository extends JpaRepository<Type_Clothing,Integer> {
}
