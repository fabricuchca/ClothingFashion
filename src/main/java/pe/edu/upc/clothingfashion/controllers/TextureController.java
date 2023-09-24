package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.TextureDTO;
import pe.edu.upc.clothingfashion.entities.Texture;
import pe.edu.upc.clothingfashion.serviceinterfaces.ITextureService;

@RestController
@RequestMapping("/textures")
@PreAuthorize("hasAuthority('ADMIN')")
public class TextureController {
    @Autowired
    private ITextureService tS;
    @PostMapping
    public void registrar(@RequestBody TextureDTO dto){
        ModelMapper m=new ModelMapper();
        Texture t=m.map(dto,Texture.class);
        tS.insert(t);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        tS.delete(id);
    }
}
