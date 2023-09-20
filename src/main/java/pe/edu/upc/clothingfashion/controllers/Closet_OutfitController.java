package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.Closet_OutfitDTO;
import pe.edu.upc.clothingfashion.entities.Closet_Outfit;
import pe.edu.upc.clothingfashion.serviceinterfaces.ICloset_OutfitService;

@RestController
@RequestMapping("/closetsOutfits")
@PreAuthorize("hasAuthority('ADMIN')")
public class Closet_OutfitController {
    @Autowired
    private ICloset_OutfitService cuS;
    @PostMapping
    public void registrar(@RequestBody Closet_OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Closet_Outfit cu=m.map(dto, Closet_Outfit.class);
        cuS.insert(cu);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        cuS.delete(id);
    }
}
