package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.TemporadaDTO;
import pe.edu.upc.clothingfashion.entities.Temporada;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITemporadaService;
@RestController
@RequestMapping("/temporadas")
public class TemporadaController {
        @Autowired
        private ITemporadaService temS;
        @PostMapping
        public void registrar(@RequestBody TemporadaDTO dto){
            ModelMapper m=new ModelMapper();
            Temporada tem=m.map(dto, Temporada.class);
            temS.insert(tem);
        }
        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable("id") Integer id)
        {
            temS.delete(id);
        }
}
