
package is.hi.Team11.repository;

import is.hi.Team11.model.Car;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CarRepository extends JpaRepository<Car, Long>{
    
    List<Car> findAll();
    
    /**
     * @param Car 
     */
    Car save (Car car);


   List<Car> findAllByOrderByIdDesc();

}