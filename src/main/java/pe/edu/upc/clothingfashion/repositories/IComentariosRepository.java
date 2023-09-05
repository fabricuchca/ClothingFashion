package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Comentarios;
import pe.edu.upc.clothingfashion.entities.Outfit;

import java.time.LocalDate;
import java.util.List;

public interface IComentariosRepository extends JpaRepository<Comentarios, Integer> {
    List<Comentarios> findByFechaComentario(LocalDate fechaComentario);

}
