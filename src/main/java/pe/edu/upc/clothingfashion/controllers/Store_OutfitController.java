package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.Store_OutfitDTO;
import pe.edu.upc.clothingfashion.entities.Store_Outfit;
import pe.edu.upc.clothingfashion.serviceinterfaces.IStore_OutfitService;

@RestController
@RequestMapping("/stores_outfits")
@PreAuthorize("hasAuthority('ADMIN')")
public class Store_OutfitController {
    @Autowired
    private IStore_OutfitService toS;
    @PostMapping
    public void registrar(@RequestBody Store_OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Store_Outfit to=m.map(dto,Store_Outfit.class);
        toS.insert(to);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        toS.delete(id);
    }
}
