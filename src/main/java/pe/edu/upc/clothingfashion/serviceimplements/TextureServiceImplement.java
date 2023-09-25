package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Texture;
import pe.edu.upc.clothingfashion.repositories.ITextureRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITextureService;

@Service
public class TextureServiceImplement implements ITextureService {
    @Autowired
    private ITextureRepository tR;
    @Override
    public void insert(Texture texture) {
        tR.save(texture);
    }

    @Override
    public void delete(int idTexture) {
        tR.deleteById(idTexture);
    }
}
