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
    @PostConstruct
    public void adminlogin(){
        Users adminlogin = new Users();
        adminlogin.setIdUser(1);
        adminlogin.setPassword("$2a$12$tsqtQLxDg/amsNdH64GSWenrfD7BBFqK4z/y4VjDESmwzPSQrtP1G");
        adminlogin.setadressUser("Av. Lima");
        adminlogin.setCardUser("1234567890123456");
        adminlogin.setEnabled(true);
        adminlogin.setBirthDate(LocalDate.now());
        adminlogin.setLastNameUser("ADMIN");
        adminlogin.setMail("admin@gmail.com");
        adminlogin.setNameUser("admin");
        adminlogin.setTelephoneUser("987637891");
        adminlogin.setUsername("admin");
        uR.save(adminlogin);
    }
}
