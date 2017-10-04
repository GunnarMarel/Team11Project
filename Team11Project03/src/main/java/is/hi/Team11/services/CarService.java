package is.hi.Team11.services;

import is.hi.Team11.model.Car;
import is.hi.Team11.model.User;
import java.util.List;


public interface CarService {


    /**
     * Skilar öllum bílum í carRep
     *
     * @return listi af bílum
     */
    public List<Car> allCars();
    
    /**
     * Vistar bíl
     * @param car
     * @return 
     */
     public Car save(Car car);
          
    

             
}
