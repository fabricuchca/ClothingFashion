package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.CatalogDTO;
import pe.edu.upc.clothingfashion.dtos.CatalogRecommendationsDTO;
import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICatalogService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {
    @Autowired
    private ICatalogService catS;
    @PostMapping
    public void registrar(@RequestBody CatalogDTO dto){
        ModelMapper m=new ModelMapper();
        Catalog cat=m.map(dto,Catalog.class);
        catS.insert(cat);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        catS.delete(id);
    }
    @GetMapping("/maxcatalog")
    public List<CatalogRecommendationsDTO> getRecommendationsByCatalog() {
        List<String[]> countCatalogRecommendations = catS.getCountCatalogRecommendations();
        List<CatalogRecommendationsDTO> catalogRecommendationsDTOList = new ArrayList<>();

        for (String[] data : countCatalogRecommendations) {
            if (data.length >= 2) {
                CatalogRecommendationsDTO catalogRecommendationsDTO = new CatalogRecommendationsDTO();
                catalogRecommendationsDTO.setId_catalog(Integer.parseInt(data[1]));
                catalogRecommendationsDTO.setId_recommendations(Integer.parseInt(data[1]));
                catalogRecommendationsDTO.setRecommendation_title(data[0]);
                catalogRecommendationsDTO.setCalification(Integer.parseInt(data[1]));

                catalogRecommendationsDTOList.add(catalogRecommendationsDTO);
            }
        }

        return catalogRecommendationsDTOList;
    }
}
