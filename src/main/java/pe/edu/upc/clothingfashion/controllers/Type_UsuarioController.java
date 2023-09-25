package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.Type_UsuarioDTO;
import pe.edu.upc.clothingfashion.entities.Type_Usuario;
import pe.edu.upc.clothingfashion.serviceinterfaces.IType_UsuarioService;

@RestController
@RequestMapping("/types_usuarios")
public class Type_UsuarioController {
    @Autowired
    private IType_UsuarioService tuS;
    @PostMapping
    public void registrar(@RequestBody Type_UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Type_Usuario tu=m.map(dto,Type_Usuario.class);
        tuS.insert(tu);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        tuS.delete(id);
    }
}
