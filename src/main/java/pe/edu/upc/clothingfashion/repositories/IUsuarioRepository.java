package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Comments;
import pe.edu.upc.clothingfashion.entities.Usuario;

import java.time.LocalDate;
import java.util.List;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    List<Usuario> findByUsuarioTag(String usuarioTag);

}
