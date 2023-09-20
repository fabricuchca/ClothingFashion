package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.EventDTO;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.serviceinterfaces.IEventService;

@RestController
@RequestMapping("/events")
@PreAuthorize("hasAuthority('ADMIN')")
public class EventController {
    @Autowired
    private IEventService eS;
    @PostMapping
    public void registrar(@RequestBody EventDTO dto){
        ModelMapper m=new ModelMapper();
        Event e=m.map(dto, Event.class);
        eS.insert(e);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        eS.delete(id);
    }
}
