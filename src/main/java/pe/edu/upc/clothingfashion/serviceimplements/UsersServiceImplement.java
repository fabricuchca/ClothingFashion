package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Event;
import pe.edu.upc.clothingfashion.entities.Users;
import pe.edu.upc.clothingfashion.repositories.UserRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IUsersService;

import java.util.List;

@Service
public class UsersServiceImplement implements IUsersService{
    @Autowired
    private UserRepository uR;
    @Override
    public Integer insert(Users users) {
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
