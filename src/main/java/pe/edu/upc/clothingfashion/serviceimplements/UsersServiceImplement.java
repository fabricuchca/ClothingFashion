package pe.edu.upc.clothingfashion.serviceimplements;

import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Catalog;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.entities.Users;
import pe.edu.upc.clothingfashion.repositories.UserRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IUsersService;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService{
    @Autowired
    private UserRepository uR;
    @Autowired
    private PasswordEncoder pE;
    @Override
    public Integer insert(Users users) {
        String newpassword = pE.encode(users.getPassword());
        users.setPassword(newpassword);
        int rpta = uR.buscarUsername(users.getUsername());
        if (rpta == 0) {
            uR.save(users);
        }
        return rpta;
    }
    @Override
    public void delete(int idUser) {
        uR.deleteById(idUser);
    }

    @Override
    public Users listId(int idUser) {
        return uR.findById(idUser).orElse(new Users());
    }

    @Override
    public List<Users> findByNameUserAndLastNameUser(String nameUser, String lastNameUser) {
        return uR.findByNameUserAndLastNameUser(nameUser, lastNameUser);
    }
    @Override
    public List<String[]> getCountClosetByUser() {
        return uR.getCountClosetByUser();
    }
    @Override
    public List<Users> list() {
        return uR.findAll();
    }
}
