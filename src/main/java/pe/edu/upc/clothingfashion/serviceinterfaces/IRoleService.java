package pe.edu.upc.clothingfashion.serviceinterfaces;

import pe.edu.upc.clothingfashion.entities.Role;

public interface IRoleService {
    public void insert(Role role);
    public void delete(Long id);
}
