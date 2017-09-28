/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.Car;
import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.CarType;
import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.User;
import java.util.ArrayList;
import java.util.Date;

/**
 * contains testdata for rentals
 * @author ulfur
 */
public class RentalRepo {

    /**
     *
     * @return
     */
    static public ArrayList<Rental> rentalList() {
        ArrayList<Rental> r = new ArrayList<Rental>();

        User u = new User("01", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("01", "xxx", CarType.Convertible, 2, new User(u)),
                dc(2017, 9, 1), dc(2018, 9, 1)
        ));

        u = new User("02", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("02", "xxx", CarType.Hatchback, 2, new User(u)),
                dc(2017, 9, 1), dc(2018, 9, 1)
        ));

        u = new User("03", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("03", "xxx", CarType.SUV, 2, new User(u)),
                dc(2017, 9, 1), dc(2018, 9, 1)
        ));

        u = new User("04", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("04", "xxx", CarType.Sedan, 2, new User(u)),
                dc(2017, 9, 1), dc(2018, 9, 1)
        ));

        u = new User("05", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("05", "xxx", CarType.Convertible, 2, new User(u)),
                dc(2017, 1, 1), dc(2018, 1, 1)
        ));

        u = new User("06", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("06", "xxx", CarType.Hatchback, 2, new User(u)),
                dc(2017, 1, 1), dc(2018, 1, 1)
        ));

        u = new User("07", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("07", "xxx", CarType.SUV, 2, new User(u)),
                dc(2017, 1, 1), dc(2018, 1, 1)
        ));

        u = new User("08", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("08", "xxx", CarType.Sedan, 2, new User(u)),
                dc(2017, 1, 1), dc(2018, 1, 1)
        ));

        u = new User("09", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("09", "xxx", CarType.Convertible, 2, new User(u)),
                dc(2016, 1, 1), dc(2018, 12, 1)
        ));

        u = new User("10", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("10", "xxx", CarType.Hatchback, 2, new User(u)),
                dc(2016, 1, 1), dc(2018, 12, 1)
        ));

        u = new User("11", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("11", "xxx", CarType.SUV, 2, new User(u)),
                dc(2016, 1, 1), dc(2018, 12, 1)
        ));

        u = new User("12", "Bob", "Smith", dc(1990, 07, 02));
        r.add(new Rental(
                new User(u),
                new Car("12", "xxx", CarType.Sedan, 2, new User(u)),
                dc(2016, 1, 1), dc(2018, 12, 1)
        ));

        return r;
    }

    private static Date dc(int year, int month, int day) {
        return new Date(year - 1900, month, day);
    }
}
