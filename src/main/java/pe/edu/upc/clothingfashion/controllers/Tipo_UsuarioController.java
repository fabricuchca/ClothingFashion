package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.Tipo_UsuarioDTO;
import pe.edu.upc.clothingfashion.entities.Tipo_Usuario;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITipo_UsuarioService;

@RestController
@RequestMapping("/tipos_usuarios")
@PreAuthorize("hasAuthority('ADMIN')")
public class Tipo_UsuarioController {
    @Autowired
    private ITipo_UsuarioService tuS;
    @PostMapping
    public void registrar(@RequestBody Tipo_UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Tipo_Usuario tu=m.map(dto,Tipo_Usuario.class);
        tuS.insert(tu);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        tuS.delete(id);
    }
}
