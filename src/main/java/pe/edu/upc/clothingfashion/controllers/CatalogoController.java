package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.CatalogoDTO;
import pe.edu.upc.clothingfashion.entities.Catalogo;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICatalogoService;

@RestController
@RequestMapping("/catalogos")
public class CatalogoController {
    @Autowired
    private ICatalogoService catS;
    @PostMapping
    public void registrar(@RequestBody CatalogoDTO dto){
        ModelMapper m=new ModelMapper();
        Catalogo cat=m.map(dto,Catalogo.class);
        catS.insert(cat);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        catS.delete(id);
    }
}
