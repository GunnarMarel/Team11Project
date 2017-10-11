package is.hi.Team11.repository;

import is.hi.Team11.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Repository for users
 * @author Óskar Gíslason & Gunnar Marel
 * @date  September 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
    /**
     * Fetches all users
     * @return list of users
     */
    List<User> findAll();
    
    /**
     * Saves a user
     * @param User 
     */
    User save (User user);

    /**
    * Finds a user by his login name
    * @param logInName
    * @return user
    */
    User findByLogInName(String logInName);
}