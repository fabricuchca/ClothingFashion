package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ComentariosDTO;
import pe.edu.upc.clothingfashion.entities.Comentarios;
import pe.edu.upc.clothingfashion.serviceinterfaces.IComentarioService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/comentarios")
public class ComentariosController {
    @Autowired
    private IComentarioService comS;

    @PostMapping
    public void registrar(@RequestBody ComentariosDTO dto){
        ModelMapper m=new ModelMapper();
        Comentarios com=m.map(dto, Comentarios.class);
        comS.insert(com);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        comS.delete(id);
    }
    @GetMapping("/{id}")
    public ComentariosDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ComentariosDTO dto=m.map(comS.listId(id),ComentariosDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody ComentariosDTO dto) {
        ModelMapper m = new ModelMapper();
        Comentarios com=m.map(dto,Comentarios.class);
        comS.insert(com);
    }
    @PostMapping("/buscar")
    public List<ComentariosDTO> buscar(@RequestBody LocalDate fechaComentario){

        return comS.findByFechaComentario(fechaComentario).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ComentariosDTO.class);
        }).collect(Collectors.toList());
    }
}
