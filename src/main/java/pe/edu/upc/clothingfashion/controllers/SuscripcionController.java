package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.SuscripcionDTO;
import pe.edu.upc.clothingfashion.entities.Suscripcion;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISuscripcionService;

@RestController
@RequestMapping("/suscripciones")
@PreAuthorize("hasAuthority('ADMIN')")
public class SuscripcionController {
    @Autowired
    private ISuscripcionService sS;
    @PostMapping
    public void registrar(@RequestBody SuscripcionDTO dto){
        ModelMapper m=new ModelMapper();
        Suscripcion s=m.map(dto,Suscripcion.class);
        sS.insert(s);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        sS.delete(id);
    }
}
