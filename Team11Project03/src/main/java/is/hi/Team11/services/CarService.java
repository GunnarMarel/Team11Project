package is.hi.Team11.services;

import is.hi.Team11.model.Car;
import java.util.List;

/**
 *
 * @author Óskar Gíslason & Gunnar Marel
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Service that saves cars, finds cars by carId and lists all cars.
 *
 */
public interface CarService {

    /**
     * Returns all cars in carRep
     *
     * @return list of all the cars in the repository
     */
    public List<Car> allCars();
    
    /**
     * Saves a car to repository
     * @param car
     * @return 
     */
     public Car save(Car car);
     
    /**
     * Finds a single car that matches given id
     * @param carId
     * @return Car that matches id
     */
    public Car findCar(Long carId);
             
}
