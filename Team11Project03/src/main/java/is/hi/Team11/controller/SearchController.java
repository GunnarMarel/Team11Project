package is.hi.Team11.controller;

import is.hi.Team11.repository.RentalRepository;
import is.hi.Team11.services.RentalService;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Óskar Gíslason
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Controller for a car rental web application. Controls the search page.
 */
@Controller
public class SearchController {
    
    @Autowired
    RentalRepository rentalRepository;
    @Autowired
    RentalService rentalService;
    
    /**
     * Returns a search page
     *
     * @return search page
     */
    @RequestMapping("/search")
    public String searchPage() {
        return "search";
    }    
     
    /**
     * Searches rentals by type, start date and end date
     *
     * @param carType
     * @param startDate
     * @param endDate
     * @param model
     * @return page with search results
     */
    @RequestMapping(value = "/searchResults", method = RequestMethod.POST)
    public String searchResults(
            @RequestParam(value = "cartype", required = false) String carType,
            @RequestParam(value = "startDate", required = false) String startDate,
            @RequestParam(value = "endDate", required = false) String endDate,
            ModelMap model) {
        model.addAttribute("resList", rentalService.rentalSearch(carType, dateParser(startDate), dateParser(endDate)));
        return "searchResults";
    } 
    
    /**
     * Parses date from string and converts it to sql Date
     * @param stringDate
     * @return sql date
     */
    public java.sql.Date dateParser(String stringDate){
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
