package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.ArmarioDTO;
import pe.edu.upc.clothingfashion.dtos.ComentariosDTO;
import pe.edu.upc.clothingfashion.entities.Armario;
import pe.edu.upc.clothingfashion.entities.Comentarios;
import pe.edu.upc.clothingfashion.serviceinterfaces.IArmarioService;
import pe.edu.upc.clothingfashion.serviceinterfaces.IComentarioService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/armarios")
public class ArmarioController {
    @Autowired
    private IArmarioService aS;

    @PostMapping
    public void registrar(@RequestBody ArmarioDTO dto){
        ModelMapper m=new ModelMapper();
        Armario a=m.map(dto, Armario.class);
        aS.insert(a);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public ArmarioDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ArmarioDTO dto=m.map(aS.listId(id),ArmarioDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody ArmarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Armario a=m.map(dto,Armario.class);
        aS.insert(a);
    }
    @PostMapping("/buscar")
    public List<ArmarioDTO> buscar(@RequestBody String estiloArmario){

        return aS.findByEstiloArmario(estiloArmario).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ArmarioDTO.class);
        }).collect(Collectors.toList());
    }
}
