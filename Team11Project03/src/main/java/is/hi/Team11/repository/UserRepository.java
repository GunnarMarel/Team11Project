
package is.hi.Team11.repository;

import is.hi.Team11.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long>{
    
    List<User> findAll();
    
    /**
     * @param User 
     */
    User save (User user);


   List<User> findAllByOrderByIdDesc();

}