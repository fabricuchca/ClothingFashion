package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.CatalogDTO;
import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICatalogService;

@RestController
@RequestMapping("/catalogs")
@PreAuthorize("hasAuthority('ADMIN')")
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
}
