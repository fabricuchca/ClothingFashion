package pe.edu.upc.clothingfashion.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.clothingfashion.entities.Role;
import pe.edu.upc.clothingfashion.repositories.RoleRepository;
import pe.edu.upc.clothingfashion.serviceinterfaces.IRoleService;
@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private RoleRepository rR;
    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public void delete(Long id) {
        rR.deleteById(id);
    }
}
