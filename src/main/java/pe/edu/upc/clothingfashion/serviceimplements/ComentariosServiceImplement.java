package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Comentarios;
import pe.edu.upc.clothingfashion.entities.Recomendaciones;
import pe.edu.upc.clothingfashion.repositories.IComentariosRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IComentarioService;

import java.time.LocalDate;
import java.util.List;
@Service
public class ComentariosServiceImplement implements IComentarioService {
    @Autowired
    private IComentariosRepository comR;
    @Override
    public void insert(Comentarios comentarios) {
        comR.save(comentarios);
    }

    @Override
    public void delete(int idComentarios) {
        comR.deleteById(idComentarios);
    }

    @Override
    public Comentarios listId(int idComentarios) {
        return comR.findById(idComentarios).orElse(new Comentarios());
    }

    @Override
    public List<Comentarios> findByFechaComentario(LocalDate fechaComentario) {
        return comR.findByFechaComentario(fechaComentario);
    }
}
