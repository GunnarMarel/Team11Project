package is.hi.Team11.services;

import is.hi.Team11.model.Car;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import is.hi.Team11.repository.CarRepository;

/**
 * 
 * Service class for car repository 
 * 
 * @author Óskar Gíslason & Gunnar Marel
 * @date October 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class CarServiceImp implements CarService{

    @Autowired
    CarRepository carRep;
    
    @Override
    public List<Car> allCars() {
        return carRep.findAll();    
    }
    
    @Override
    public Car save(Car car) {
        return carRep.save(car);
    }

    @Override
    public Car findCar(Long carId) {
        return carRep.findOne(carId);
    }
}
