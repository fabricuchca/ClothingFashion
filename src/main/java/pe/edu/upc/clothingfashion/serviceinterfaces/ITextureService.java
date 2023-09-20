package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Texture;
public interface ITextureService {
    public void insert(Texture texture);
    public void delete(int idTexture);
}
