package pe.edu.upc.clothingfashion.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.clothingfashion.dtos.ClosetDTO;
import pe.edu.upc.clothingfashion.dtos.UsersDTO;
import pe.edu.upc.clothingfashion.dtos.UsersClaseDTO;
import pe.edu.upc.clothingfashion.entities.Closet;
import pe.edu.upc.clothingfashion.entities.Users;
import pe.edu.upc.clothingfashion.serviceinterfaces.IUsersService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService uS;
    @Autowired
    private PasswordEncoder bcrypt;
    @PostMapping
    public void registrar(@RequestBody UsersDTO dto){
        ModelMapper m=new ModelMapper();
        Users u=m.map(dto, Users.class);
        uS.insert(u);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int idUser)
    {
        uS.delete(idUser);
    }
    @GetMapping("/{id}")
    public UsersDTO listarId(@PathVariable("id")int idUser){
        ModelMapper m=new ModelMapper();
        UsersDTO dto=m.map(uS.listId(idUser),UsersDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u=m.map(dto,Users.class);
        uS.insert(u);
    }
    @PostMapping("/buscar")
    public List<UsersDTO> buscar(@RequestParam String nameUser, String lastNameUser){

        return uS.findByNameUserAndLastNameUser(nameUser, lastNameUser).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
    @GetMapping("/armarios")
    public List<UsersClaseDTO> getCountClosetByUser() {
        List<String[]> countClosetByUser = uS.getCountClosetByUser();
        List<UsersClaseDTO> closetUsersDTOList = new ArrayList<>();

        for (String[] data : countClosetByUser) {
            if (data.length >= 2) {
                UsersClaseDTO usersClaseDTO = new UsersClaseDTO();
                usersClaseDTO.setNameUsers(data[0]);
                usersClaseDTO.setQuantityCloset(Integer.parseInt(data[1]));
                closetUsersDTOList.add(usersClaseDTO);
            }
        }

        return closetUsersDTOList;
    }
    @GetMapping
    public List<UsersDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/save")
    public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            String bcryptPassword = bcrypt.encode(user.getPassword());
            user.setPassword(bcryptPassword);
            int rpta = uS.insert(user);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usersecurity/user";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", uS.list());

        return "usersecurity/listUser";
    }
}
