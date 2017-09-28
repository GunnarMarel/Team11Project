package is.hi.byrjun.controller;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData.Rental;
import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData.*;
import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.CarType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * controller for assignment 02
 */
@Controller
@RequestMapping("/ass02") // Notice here that the Request Mapping is set at the Class level
public class ass02Controler {

    /**
     * returns a start page
     *
     * @return
     */
    @RequestMapping("/start")
    public String startPage() {
        System.out.println("test test");
        return "ass02/start";
    }

    /**
     * returns a search page
     *
     * @return
     */
    @RequestMapping("/search")
    public String searchPage() {
        return "ass02/search";
    }

    /**
     * diplays all rentals
     *
     * @param model
     * @return
     */
    @RequestMapping("/allRentals")
    public String allRentals(Model model) {

        ArrayList<Rental> rentals;
        rentals = RentalRepo.rentalList();
        ArrayList<String> s = new ArrayList<String>();

        for (Rental r : rentals) {
            s.add("<br>" + r.toHTML());
        }
        s.add("<br>");
        model.addAttribute("carList", s);

        return "ass02/allRentals";
    }

    /**
     * Searches rentals and serves up resault page
     *
     * @param carType
     * @param startDate
     * @param endDate
     * @param model
     * @return
     */
    @RequestMapping(value = "/searchResults", method = RequestMethod.POST)
    public String xx(
            @RequestParam(value = "cartype", required = false) String carType,
            @RequestParam(value = "startDate", required = false) String startDate,
            @RequestParam(value = "endDate", required = false) String endDate,
            ModelMap model) {

        try {

            Date sd = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            sd.setTime(sd.getTime() - (long) 1000 * 60 * 60 * 24);
            Date ed = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
            ed.setTime(ed.getTime() + (long) 1000 * 60 * 60 * 24);

            CarType type = CarType.valueOf(carType);
            ArrayList<Rental> rentals;
            rentals = RentalRepo.rentalList();
            ArrayList<Rental> offers;
            offers = RentalSearch.searchCar(sd, ed, type, rentals);
            ArrayList<String> s = new ArrayList<String>();
            for (Rental r : offers) {
                s.add("<br>" + r.toHTML());
            }
            s.add("<br>");
            model.addAttribute("resList", s);
            return "ass02/searchResults";

        } catch (ParseException ex) {
            return "ass02/error";
        }

    }

}
