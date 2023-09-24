package pe.edu.upc.clothingfashion.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.clothingfashion.dtos.SuscriptionDTO;
import pe.edu.upc.clothingfashion.dtos.SuscriptionUsersDTO;
import pe.edu.upc.clothingfashion.entities.Suscription;
import pe.edu.upc.clothingfashion.serviceinterfaces.ISuscriptionService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/suscriptiones")
@PreAuthorize("hasAuthority('ADMIN')")
public class SuscriptionController {
    @Autowired
    private ISuscriptionService sS;
    @PostMapping
    public void registrar(@RequestBody SuscriptionDTO dto){
        ModelMapper m=new ModelMapper();
        Suscription s=m.map(dto,Suscription.class);
        sS.insert(s);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id)
    {
        sS.delete(id);
    }

    @GetMapping("/dates")
    public List<SuscriptionUsersDTO> getUserIdByPaymentDate(){
        List<String[]>countUserIdByPaymentDate=sS.getCountUserIdByPaymentDate();
        List<SuscriptionUsersDTO>suscriptionUsersDTOList=new ArrayList<>();

        for (String[] data:countUserIdByPaymentDate){
            if(data.length>=2){
                SuscriptionUsersDTO suscriptionUsersDTO=new SuscriptionUsersDTO();
                suscriptionUsersDTO.setPaymentDate(LocalDate.parse(data[0]));
                suscriptionUsersDTO.setQuantityUsers(Integer.parseInt(data[1]));
                suscriptionUsersDTOList.add(suscriptionUsersDTO);
            }
        }
        return suscriptionUsersDTOList;
    }
}
