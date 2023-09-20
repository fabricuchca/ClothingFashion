package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ColorDTO;
import pe.edu.upc.clothingfashion.entities.Color;
import pe.edu.upc.clothingfashion.serviceinterfaces.IColorService;

@RestController
@RequestMapping("/colores")
@PreAuthorize("hasAuthority('ADMIN')")
public class ColorController {
    @Autowired
    private IColorService cS;
    @PostMapping
    public void registrar(@RequestBody ColorDTO dto){
        ModelMapper m=new ModelMapper();
        Color c=m.map(dto,Color.class);
        cS.insert(c);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        cS.delete(id);
    }
}
