package pe.edu.upc.clothingfashion.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.MarcaDTO;
import pe.edu.upc.clothingfashion.entities.Marca;
import pe.edu.upc.clothingfashion.serviceinterfaces.IMarcaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/marcas")
@PreAuthorize("hasAuthority('ADMIN')")
public class MarcaController {
    @Autowired
    private IMarcaService mS;

    @PostMapping
    public void registrar(@RequestBody MarcaDTO dto){
        ModelMapper m=new ModelMapper();
        Marca ma=m.map(dto,Marca.class);
        mS.insert(ma);
    }
    @GetMapping
    public List<MarcaDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MarcaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){mS.delete(id);}

    @GetMapping("/{id}")
    public MarcaDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        MarcaDTO dto=m.map(mS.listId(id),MarcaDTO.class);
        return dto;
    }

}
