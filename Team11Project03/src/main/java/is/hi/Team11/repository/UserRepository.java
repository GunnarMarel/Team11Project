
package is.hi.Team11.repository;

import is.hi.Team11.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Safn af kennurum 
 * @author Ebba ��ra Hvannberg
 * @date september 2017
 * HBV501G Hugb�na�arverkefni 1 
 */

public interface UserRepository extends JpaRepository<User, Long>{
    /**
     * N�r � alla Users
     * @return listi af Users
     */
    List<User> findAll();
    
    /**
     * B�tir vi� User � safni� 
     * @param kennari 
     */
    User save (User user);


   List<User> findAllByOrderByIdDesc();

   /**
    * Finnur kennara me� au�kenni id 
    * @param id au�kenni 
    * @return kennari me� au�kenni id
    */
   @Override
   User findOne(Long id);
   
   /**
    * Finna kennara me� nafni nafn. Skilar t�mum lista ef ekkert finnst
    * @param nafn
    * @return listi af kennurum sem heita nafn 
    */
   List<User> findByNafn(String nafn);
}
