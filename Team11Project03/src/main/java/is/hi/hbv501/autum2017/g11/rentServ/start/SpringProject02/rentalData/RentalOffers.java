/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ulfur
 */
public class RentalOffers {

    ArrayList<RentalOffer> rentals;

    public RentalOffers() {
        rentals = new ArrayList<RentalOffer>();
    }

    List<RentalOffer> GetAllOffers() {
        return rentals;
    }

    void add(RentalOffer offer) {
        rentals.add(offer);
    }

    @Override
    public String toString() {
        String toString = "";
        for (RentalOffer rental : rentals) {
            toString+=rental.toString()+":";
        }
        return toString;
    }
}
