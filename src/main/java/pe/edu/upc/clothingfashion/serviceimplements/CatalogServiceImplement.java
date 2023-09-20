package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.repositories.ICatalogRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICatalogService;
@Service
public class CatalogServiceImplement implements ICatalogService {
    @Autowired
    private ICatalogRepository catR;
    @Override
    public void insert(Catalog catalog) {
        catR.save(catalog);
    }

    @Override
    public void delete(int idCatalog) {
        catR.deleteById(idCatalog);
    }
}
