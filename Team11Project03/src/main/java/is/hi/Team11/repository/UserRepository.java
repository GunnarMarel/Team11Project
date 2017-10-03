
package is.hi.Team11.repository;

import is.hi.Team11.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Safn af kennurum 
 * @author Ebba Þóra Hvannberg
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1 
 */

public interface UserRepository extends JpaRepository<User, Long>{
    /**
     * Nær í alla Users
     * @return listi af Users
     */
    List<User> findAll();
    
    /**
     * Bætir við User í safnið 
     * @param kennari 
     */
    User save (User user);


   List<User> findAllByOrderByIdDesc();

   /**
    * Finnur kennara með auðkenni id 
    * @param id auðkenni 
    * @return kennari með auðkenni id
    */
   @Override
   User findOne(Long id);
   
   /**
    * Finna kennara með nafni nafn. Skilar tómum lista ef ekkert finnst
    * @param nafn
    * @return listi af kennurum sem heita nafn 
    */
   List<User> findByNafn(String nafn);
}
