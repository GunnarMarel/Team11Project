package is.hi.Team11.controller;

import is.hi.Team11.model.Car;
import is.hi.Team11.model.Rental;
import is.hi.Team11.model.User;
import is.hi.Team11.services.CarService;
import is.hi.Team11.services.RentalService;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Óskar Gíslason
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Controller for a car rental web application. Controls rental car registration.
 */
@Controller
public class RentalController {
    
    @Autowired
    RentalService rentalService;
    @Autowired
    CarService carService;
    
    /**
     * Page where a user registers a car for rent
     * @return page with car registration forms
     */
    @RequestMapping(value = "page/carRegister")
    public String carRegister() {
        return "page/carRegister";
    } 
    
   /**
     * Registers a new car for rent
     * @param cartype
     * @param model
     * @param price
     * @param startDate
     * @param endDate
     * @return start page for logged in users
     */
    @RequestMapping(value = "page/carRegister", method = RequestMethod.POST)
    public String saveCar(@RequestParam(value = "cartype", required = false) String cartype, @RequestParam String model, 
            @RequestParam int price, @RequestParam String startDate, @RequestParam String endDate, HttpSession session) {
        
        User user = (User)session.getAttribute("loggedUser");
        Car car = new Car(user.getLogInName(), cartype, model);
        Rental rental = new Rental(user.getLogInName(), model, cartype, dateParser(startDate), dateParser(endDate), price);
                
        carService.save(car);
        rentalService.save(rental);
        return "page/loggedUser";
    }  
    
    /**
     * Displays all rentals
     *
     * @param model
     * @return page with all rentals
     */
    @RequestMapping("page/allRentals")
    public String allRentals(Model model) {
        model.addAttribute("carList", rentalService.allRentals());
        return "page/allRentals";  
    }

    /**
     * Displays users rental cars
     *
     * @param model
     * @return page with users rental cars
     */
    @RequestMapping("page/myRentals")
    public String myRentals(Model model, HttpSession session) {
        User user = (User)session.getAttribute("loggedUser");
        model.addAttribute("myCars", rentalService.allMyRentals(user.getLogInName()));
        return "page/myRentals";  
    }
    
    /**
     * Gets information about chosen car and sends user to new page with said information
     * @param model
     * @param rentalId
     * @return page with info on chosen car
     */
    @RequestMapping(value = "page/allRentals", method = RequestMethod.POST)
    public String moreInfo(Model model, @RequestParam int rentalId) {
        Long id = Long.valueOf(rentalId);
        model.addAttribute("rental", rentalService.findRental(id));
        return "page/moreInfo";  
    }   
    
    /**
     * Parses date from string and converts it to sql Date
     * @param stringDate
     * @return sql date
     */
    public Date dateParser(String stringDate){
        try {
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
            date.setTime(date.getTime() - (long) 1000 * 60 * 60 * 24);
            Date sqlDate = new Date(date.getTime());
            return sqlDate;
        } catch (ParseException ex) {
            return null;
        }
    }

/* 
    public List availableDates(String sd, String ed) {
        Date start = dateParser(sd);
        Date end = dateParser(ed);
        List dates = null;
        while(!start.equals(end)){
            //dates.add(start);
            System.out.println(start+" "+(start==null));
            start = new Date(start.getTime() + 24 * 60 * 60 * 1000);
            System.out.println(start);      
        }
        return dates;
    }

*/

}
