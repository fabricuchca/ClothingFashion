package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.TexturaDTO;
import pe.edu.upc.clothingfashion.entities.Textura;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITexturaService;

@RestController
@RequestMapping("/texturas")
@PreAuthorize("hasAuthority('ADMIN')")
public class TexturaController {
    @Autowired
    private ITexturaService tS;
    @PostMapping
    public void registrar(@RequestBody TexturaDTO dto){
        ModelMapper m=new ModelMapper();
        Textura t=m.map(dto,Textura.class);
        tS.insert(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        tS.delete(id);
    }
}
