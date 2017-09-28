/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;


import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.*;
import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.CarType;
import java.util.ArrayList;

/**
 * Contains testdata for cars
 * @author ulfur
 */
public class CarRepo {

    ArrayList<Car> cars = new ArrayList<Car>();

    /**
     *
     * @return
     */
    static public ArrayList<Car> carList() {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("aa123", "Ford 1", CarType.Sedan, 5, null));
        cars.add(new Car("bb234", "Ford 2", CarType.Hatchback, 5, null));
        cars.add(new Car("cc123", "Ford 3", CarType.SUV, 5, null));
        cars.add(new Car("dd123", "Ford 4", CarType.Sedan, 5, null));
        cars.add(new Car("ee", "Ford 5", CarType.Convertible, 2, null));
        cars.add(new Car("ff", "Ford 6", CarType.Hatchback, 5, null));
        cars.add(new Car("gg", "Ford 7", CarType.Hatchback, 5, null));
        cars.add(new Car("hh", "Ford 8", CarType.Sedan, 3, null));
        cars.add(new Car("ii", "Ford 9", CarType.Convertible, 5, null));
        cars.add(new Car("jj", "Ford 10", CarType.SUV, 2, null));
        return cars;
    }
    
    static public Cars cars(){
        Cars c = new Cars();
        for (Car car : carList()) {
            c.add(car);
        }
        return c;
    }

}
