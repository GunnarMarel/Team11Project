
package is.hi.Team11.services;

import is.hi.Team11.model.Car;
import is.hi.Team11.repository.CarRepository;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImp implements CarService{

    // Tenging yfir í safn af kennurum 
    @Autowired
    CarRepository carRep;
    

    @Override
    public List<Car> allCars() {
        return carRep.findAll();    // Notum findAll í staðinn fyrir getAll
    }
    
    @Override
    public Car save(Car car) {
        return carRep.save(car);
    }




    
}
