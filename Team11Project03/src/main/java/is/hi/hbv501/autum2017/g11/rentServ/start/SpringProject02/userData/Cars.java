/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData.RentalOffer;
import java.util.ArrayList;

/**
 *
 * @author ulfur
 */
public class Cars {
    
    ArrayList<Car> cars;
    

    public Cars() {
        cars = new ArrayList<Car>();
        
    }

    public void add(Car car) {
        cars.add(car);
    }
    
}
