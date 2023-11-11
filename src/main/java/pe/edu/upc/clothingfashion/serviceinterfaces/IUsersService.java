package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Brand;
import pe.edu.upc.clothingfashion.entities.Users;
import java.util.List;

public interface IUsersService {
    public Integer insert(Users users);
    public void delete(int idUser);
    public Users listId(int idUser);
    List<Users> findByNameUserAndLastNameUser(String nameUser, String lastNameUser);
    List<String[]> getCountClosetByUser();
    public List<Users>list();
}
