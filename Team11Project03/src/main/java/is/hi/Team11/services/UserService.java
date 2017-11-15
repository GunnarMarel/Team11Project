package is.hi.Team11.services;

import is.hi.Team11.model.User;
import java.util.List;

/**
 *
 * @author Óskar Gíslason & Gunnar Marel
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Service that saves users, finds users by username, lists all users 
 * and verifies login credentials.
 *
 */
public interface UserService {

    /**
     * Returns all users in userRep
     *
     * @return list of users
     */
    public List<User> allUsers();
    
    /**
     * Saves a user to userRep
     * @param user
     * @return 
     */
    public User save(User user);

    /**
     * Searches for a user by username
     * @param username
     * @return 
     */     
    public User findUser(String username);
    
    /**
     * Checks whether a username already exists in the database
     * @param username
     * @return 
     */
    public Boolean usernameTaken(String username);

    /**
     * Checks whether login and password match a registered user
     * @param logInName
     * @param logInPass
     * @return 
     */
    public User userLogin(String logInName, String logInPass);
     
    
}
