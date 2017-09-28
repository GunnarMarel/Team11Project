/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.Car;
import java.util.Date;

/**
 *
 * @author ulfur
 */
public class RentalOffer {

    Car car;
    Date startDate;
    Date endDate;

    public RentalOffer() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String s = "";
        s += this.car.toString() + ",";
        s += this.startDate.toString() + ",";
        s += this.endDate.toString() + ";";
        
        return "";
    }

}
