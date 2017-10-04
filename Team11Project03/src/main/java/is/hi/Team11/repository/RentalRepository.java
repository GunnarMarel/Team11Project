
package is.hi.Team11.repository;

import is.hi.Team11.model.Rental;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface RentalRepository extends JpaRepository<Rental, Long>{
    
    List<Rental> findAll();
    
    /**
     * @param User 
     */
    Rental save (Rental ental);


   List<Rental> findAllByOrderByIdDesc();

}