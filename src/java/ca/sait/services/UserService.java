package ca.sait.services;
import ca.sait.dataaccess.UserDB;
import ca.sait.models.Role;
import ca.sait.models.User;
import java.util.*;

/**
 *
 * @author Dylan
 */
public class UserService {
    private final UserDB userDB = new UserDB(); 
    
    public User get(String email) throws Exception {
        User user = this.userDB.get(email);
        return user;
    }
    
    public List<User> getAll() throws Exception {
        List<User> users = this.userDB.getAll();
        return users;
    }
    
    public boolean insert(String email, boolean active, String firstName, String lastName, String password, Role role) throws Exception {
        User user = new User(email, firstName, lastName, password, role, active);
        return this.userDB.insert(user);
    }
    
    public boolean update(String email, boolean active, String firstName, String lastName, String password, Role role) throws Exception {
        User user = new User(email, firstName, lastName, password, role, active);
        return this.userDB.update(user);
    }
    
    public boolean delete(String email) throws Exception {
        User user = new User();
        user.setEmailAddress(email);
        return this.userDB.delete(user);
    }
}