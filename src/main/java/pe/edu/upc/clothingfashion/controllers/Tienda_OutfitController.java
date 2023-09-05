package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.Tienda_OutfitDTO;
import pe.edu.upc.clothingfashion.entities.Tienda_Outfit;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITienda_OutfitService;

@RestController
@RequestMapping("/tiendas_outfits")
public class Tienda_OutfitController {
    @Autowired
    private ITienda_OutfitService toS;
    @PostMapping
    public void registrar(@RequestBody Tienda_OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Tienda_Outfit to=m.map(dto,Tienda_Outfit.class);
        toS.insert(to);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        toS.delete(id);
    }
}
