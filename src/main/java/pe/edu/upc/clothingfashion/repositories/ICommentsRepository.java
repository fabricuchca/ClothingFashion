package pe.edu.upc.clothingfashion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.clothingfashion.entities.Comments;
import pe.edu.upc.clothingfashion.entities.Outfit;

import java.time.LocalDate;
import java.util.List;

public interface ICommentsRepository extends JpaRepository<Comments, Integer> {
    List<Comments> findByDateComment(LocalDate dateComment);

}
