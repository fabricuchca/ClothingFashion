package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Tipo_Usuario;

public interface ITipo_UsuarioRepository extends JpaRepository<Tipo_Usuario, Integer> {
}
