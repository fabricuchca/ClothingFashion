package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.Tienda_OutfitDTO;
import pe.edu.upc.clothingfashion.entities.Armario_Outfit;
import pe.edu.upc.clothingfashion.entities.Tienda_Outfit;
import pe.edu.upc.clothingfashion.serviceinterfaces.IArmario_OutfitService;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITienda_OutfitService;

@RestController
@RequestMapping("/armarios_outfits")
@PreAuthorize("hasAuthority('ADMIN')")
public class Armario_OutfitDTO {
    @Autowired
    private IArmario_OutfitService aoS;
    @PostMapping
    public void registrar(@RequestBody Armario_OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Armario_Outfit ao=m.map(dto,Armario_Outfit.class);
        aoS.insert(ao);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        aoS.delete(id);
    }
}
