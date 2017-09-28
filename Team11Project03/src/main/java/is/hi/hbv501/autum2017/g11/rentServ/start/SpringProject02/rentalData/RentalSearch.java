/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.CarType;
import java.util.ArrayList;
import java.util.Date;

/**
 * Handles searches in rentals
 * @author ulfur
 */
public class RentalSearch {


    /**
     * Searches inputed list of offers
     * @param startDate
     * @param endDate
     * @param carType
     * @param offers
     * @return 
     */
    public static ArrayList<Rental> searchCar(Date startDate, Date endDate, CarType carType, ArrayList<Rental> offers) {
        ArrayList<Rental> rentals = new ArrayList<Rental>();
        for (Rental offer : offers) {
            if (offer.getStartDate().after(startDate)
                    && offer.getEndDate().before(endDate)
                    && offer.getCar().getCarType() == carType) {
                rentals.add(offer);
            }
        }

        return rentals;
    }

}
