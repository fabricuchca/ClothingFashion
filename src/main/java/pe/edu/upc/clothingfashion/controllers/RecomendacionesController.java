package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.RecomendacionesDTO;
import pe.edu.upc.clothingfashion.entities.Recomendaciones;
import pe.edu.upc.clothingfashion.serviceinterfaces.IRecomendacionesService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recomendaciones")
@PreAuthorize("hasAuthority('ADMIN')")
public class RecomendacionesController {
    @Autowired
    private IRecomendacionesService rS;

    @PostMapping
    public void registrar(@RequestBody RecomendacionesDTO dto){
        ModelMapper m=new ModelMapper();
        Recomendaciones r=m.map(dto, Recomendaciones.class);
        rS.insert(r);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RecomendacionesDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        RecomendacionesDTO dto=m.map(rS.listId(id),RecomendacionesDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody RecomendacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Recomendaciones r=m.map(dto,Recomendaciones.class);
        rS.insert(r);
    }
    @PostMapping("/buscar")
    public List<RecomendacionesDTO> buscar(@RequestBody String etiquetaCategoria){

        return rS.findByEtiquetaCategoria(etiquetaCategoria).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RecomendacionesDTO.class);
        }).collect(Collectors.toList());
    }
}
