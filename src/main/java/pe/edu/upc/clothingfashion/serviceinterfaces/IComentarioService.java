package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Comentarios;
import java.time.LocalDate;
import java.util.List;

public interface IComentarioService {
    public void insert(Comentarios comentarios);
    public void delete(int idComentarios);
    public Comentarios listId(int idComentarios);
    List<Comentarios> findByFechaComentario(LocalDate fechaComentario);

}
