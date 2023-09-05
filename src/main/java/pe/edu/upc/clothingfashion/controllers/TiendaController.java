package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.TiendaDTO;
import pe.edu.upc.clothingfashion.entities.Tienda;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITiendaService;

@RestController
@RequestMapping("/tiendas")
@PreAuthorize("hasAuthority('ADMIN')")
public class TiendaController {
    @Autowired
    private ITiendaService tiS;

    @PostMapping
    public void registrar(@RequestBody TiendaDTO dto){
        ModelMapper m=new ModelMapper();
        Tienda t=m.map(dto, Tienda.class);
        tiS.insert(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        tiS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TiendaDTO dto) {
        ModelMapper m = new ModelMapper();
        Tienda t=m.map(dto, Tienda.class);
        tiS.insert(t);
    }
}
