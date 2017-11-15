package is.hi.Team11.controller;

import is.hi.Team11.model.Car;
import is.hi.Team11.model.Rental;
import is.hi.Team11.model.User;
import is.hi.Team11.services.CarService;
import is.hi.Team11.services.RentalService;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    @RequestMapping(value = "/carRegister")
    public String carRegister(Model model) {
        Rental rental = new Rental();
        model.addAttribute("rental", rental);
        return "carRegister";
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
    @RequestMapping(value = "/carRegister", method = RequestMethod.POST)
    public String saveCar(@RequestParam(value = "cartype", required = false) String cartype, @RequestParam String carModel, 
            @RequestParam int price, @RequestParam String startDate, @RequestParam String endDate, HttpSession session, @Valid @ModelAttribute(name="rental") 
            Rental rentals,
            BindingResult villur,
            ModelMap models) {
        if (villur.hasErrors()) {
            System.out.println(villur.getAllErrors().toString());
            return "carRegister";
        }
        else {
            User user = (User)session.getAttribute("loggedUser");
            Car car = new Car(user.getLogInName(), cartype, carModel);
            Rental rental = new Rental(user.getLogInName(), carModel, cartype, dateParser(startDate), dateParser(endDate), price);
                
            carService.save(car);
            rentalService.save(rental);
            return "loggedUser";
        }
    }

    
    /**
     * Displays all rentals
     *
     * @param model
     * @return page with all rentals
     */
    @RequestMapping("/allRentals")
    public String allRentals(Model model) {
        model.addAttribute("carList", rentalService.allRentals());
        return "allRentals";  
    }

    
    /**
     * Displays users rental cars
     *
     * @param model
     * @return page with users rental cars
     */
    @RequestMapping("/myRentals")
    public String myRentals(Model model, HttpSession session) {
        User user = (User)session.getAttribute("loggedUser");
        model.addAttribute("myCars", rentalService.allMyRentals(user.getLogInName()));
        return "myRentals";  
    }
    
    
    /**
     * Gets information about chosen car and sends user to new page with said information
     * @param model
     * @param rentalId
     * @return page with info on chosen car
     */
    @RequestMapping(value = "/allRentals", method = RequestMethod.POST)
    public String moreInfo(Model model, @RequestParam int car) {
        Long id = Long.valueOf(car);
        model.addAttribute("rental", rentalService.findRental(id));
        return "moreInfo";  
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
}
