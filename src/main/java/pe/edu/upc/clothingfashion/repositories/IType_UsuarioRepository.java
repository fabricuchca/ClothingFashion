package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Type_Usuario;

public interface IType_UsuarioRepository extends JpaRepository<Type_Usuario, Integer> {
}
