package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.EventoDTO;
import pe.edu.upc.clothingfashion.entities.Evento;
import pe.edu.upc.clothingfashion.serviceinterfaces.IEventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private IEventoService eS;
    @PostMapping
    public void registrar(@RequestBody EventoDTO dto){
        ModelMapper m=new ModelMapper();
        Evento e=m.map(dto, Evento.class);
        eS.insert(e);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        eS.delete(id);
    }
}
