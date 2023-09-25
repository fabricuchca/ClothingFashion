package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.SuscriptionDTO;
import pe.edu.upc.clothingfashion.entities.Suscription;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISuscriptionService;

@RestController
@RequestMapping("/suscriptiones")
public class SuscriptionController {
    @Autowired
    private ISuscriptionService sS;
    @PostMapping
    public void registrar(@RequestBody SuscriptionDTO dto){
        ModelMapper m=new ModelMapper();
        Suscription s=m.map(dto,Suscription.class);
        sS.insert(s);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        sS.delete(id);
    }
}
