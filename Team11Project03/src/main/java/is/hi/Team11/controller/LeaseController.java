package is.hi.Team11.controller;

import is.hi.Team11.model.Car;
import is.hi.Team11.model.Lease;
import is.hi.Team11.model.Rental;
import is.hi.Team11.model.User;
import is.hi.Team11.services.CarService;
import is.hi.Team11.services.LeaseService;
import is.hi.Team11.services.RentalService;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class LeaseController {
    
    @Autowired
    RentalService rentalService;
    @Autowired
    LeaseService leaseService;
    
    
     /**
     * Gets information about chosen car and sends user to new page with said information
     * @param model
     * @param rentalId
     * @return page with info on chosen car
     */
    @RequestMapping(value = "/move", method = RequestMethod.POST)
    public String leaseCar(Model model, @RequestParam int rental) {
    Long id = Long.valueOf(rental);
        model.addAttribute("rental", rentalService.findRental(id));
        return "leaseCar";  
    }

    /**
     * Registers a new car for rent
     * @param rentalId
     * @param owner
     * @param price
     * @param startDate
     * @param endDate
     * @return start page for logged in users
     */
    @RequestMapping(value = "/leaseCar", method = RequestMethod.POST)
    public String saveLease(@RequestParam int rentalId,@RequestParam String owner,@RequestParam int price,@RequestParam String startDate, 
            @RequestParam String endDate,HttpSession session) {
        
        User user = (User)session.getAttribute("loggedUser");
        Lease lease = new Lease(Long.valueOf(rentalId),owner, user.getLogInName(), ((int) getTotalPrice(dateParser(startDate),dateParser(endDate))*price), dateParser(startDate), dateParser(endDate));
                //(int) getTotalPrice(dateParser(startDate),dateParser(endDate),price)
        leaseService.save(lease);
        return "loggedUser";
    }
    

    /**
     * Displays users rental cars
     *
     * @param model
     * @return page with users rental cars
     */
    @RequestMapping("/myLeases")
    public String myLeases(Model model, HttpSession session) {
        User user = (User)session.getAttribute("loggedUser");
        model.addAttribute("myLeases", leaseService.findRenter(user.getLogInName()));
        return "myLeases";  
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
    
    public long getTotalPrice(Date d1, Date d2) {
    long diff = d2.getTime() - d1.getTime();
    return ((TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)));
    }


}
