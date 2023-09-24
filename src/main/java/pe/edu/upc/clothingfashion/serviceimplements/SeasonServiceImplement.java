package pe.edu.upc.clothingfashion.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Season;
import pe.edu.upc.clothingfashion.repositories.ISeasonRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISeasonService;
@Service
public class SeasonServiceImplement implements ISeasonService {
    @Autowired
    private ISeasonRepository temR;
    @Override
    public void insert(Season season) {
        temR.save(season);
    }

    @Override
    public void delete(int idSeason) {
        temR.deleteById(idSeason);
    }
}
