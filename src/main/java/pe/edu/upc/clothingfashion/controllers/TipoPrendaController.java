package pe.edu.upc.clothingfashion.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.TipoPrendaDTO;
import pe.edu.upc.clothingfashion.entities.Tipo_Prenda;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITipoPrendaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoPrendas")
@PreAuthorize("hasAuthority('ADMIN')")
public class TipoPrendaController {
    @Autowired
    private ITipoPrendaService tpS;

    @PostMapping
    public void registrar(@RequestBody TipoPrendaDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Prenda tp=m.map(dto,Tipo_Prenda.class);
        tpS.insert(tp);
    }
    @GetMapping
    public List<TipoPrendaDTO>listar(){
        return tpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoPrendaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){tpS.delete(id);}
    @GetMapping("/{id}")
    public TipoPrendaDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        TipoPrendaDTO dto=m.map(tpS.listId(id),TipoPrendaDTO.class);
        return dto;
    }
}
