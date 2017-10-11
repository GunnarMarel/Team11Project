package is.hi.Team11.repository;

import is.hi.Team11.model.Car;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for cars
 * @author Óskar Gíslason & Gunnar Marel
 * @date  September 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
public interface CarRepository extends JpaRepository<Car, Long>{
    
    /**
     * Fetches all cars
     * @return list of cars
     */
    List<Car> findAll();
    
    /**
     * Saves a car
     * @param car 
     */
    Car save (Car car);

    /**
     * Finds a specific car from id
     * @param id
     * @return car
     */
    Car findOne(Long id);
    
}