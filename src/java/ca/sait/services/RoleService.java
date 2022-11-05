package ca.sait.services;

import ca.sait.dataaccess.RoleDB;
import ca.sait.models.Role;
import java.util.List;

/**
 *
 * @author Dylan
 */
public class RoleService {
    private final RoleDB roleDB = new RoleDB();
    
    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }
}
