/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.*;
import java.util.Date;

/**
 * Data for rental
 *
 * @author ulfur
 */
public class Rental {

    private User renter;
    private Date startDate;
    private Date endDate;
    private Car car;

    public Rental() {

        renter = null;
        startDate = null;
        endDate = null;
        car = null;
    }

    public Rental(User renter, Car car, Date startDate, Date enddate) {
        this.renter = renter;
        this.car = car;
        this.startDate = startDate;
        this.endDate = enddate;
    }

    public User getRenter() {
        return renter;
    }

    public void setRenter(User renter) {
        this.renter = renter;
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

    /**
     * returns a formated html string for a rental
     *
     * @return
     */
    public String toHTML() {
        return "Renter:[" + this.renter.toHTML() + "], Car:[" + this.car.toHTML() + "], StartDate:" + this.startDate.toString() + ", EndDate:" + this.endDate.toString();
    }

    public Car getCar() {
        return car;
    }
}
