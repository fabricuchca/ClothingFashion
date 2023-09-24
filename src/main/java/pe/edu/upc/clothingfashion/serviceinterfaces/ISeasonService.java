package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Season;

public interface ISeasonService {
    public void insert(Season season);
    public void delete(int idSeason);
}
