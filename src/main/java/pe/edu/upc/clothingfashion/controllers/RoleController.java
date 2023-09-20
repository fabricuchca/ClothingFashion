package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.RoleDTO;
import pe.edu.upc.clothingfashion.entities.Role;
import pe.edu.upc.clothingfashion.serviceinterfaces.IRoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;
    @PostMapping
    public void registrar(@RequestBody RoleDTO dto){
        ModelMapper m=new ModelMapper();
        Role r=m.map(dto, Role.class);
        rS.insert(r);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void eliminar(@PathVariable("id") Long id)
    {
        rS.delete(id);
    }
}
