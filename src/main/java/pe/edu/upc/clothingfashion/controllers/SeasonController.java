package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.SeasonDTO;
import pe.edu.upc.clothingfashion.entities.Season;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISeasonService;
@RestController
@RequestMapping("/seasons")
@PreAuthorize("hasAuthority('ADMIN')")
public class SeasonController {
        @Autowired
        private ISeasonService temS;
        @PostMapping
        public void registrar(@RequestBody SeasonDTO dto){
            ModelMapper m=new ModelMapper();
            Season tem=m.map(dto, Season.class);
            temS.insert(tem);
        }
        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable("id") Integer id)
        {
            temS.delete(id);
        }
}
