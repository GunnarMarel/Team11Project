package is.hi.Team11.services;

import is.hi.Team11.model.Rental;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Óskar Gíslason & Gunnar Marel
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Service that saves rentals, finds rentals by their id and lists all rentals.
 *
 */
public interface RentalService {

    /**
     * Returns all rentals in rentalRep
     *
     * @return list of rentals
     */
    public List<Rental> allRentals();
    
    /**
     * Saves a rental to rentalRep
     * @param rental
     * @return 
     */
    public Rental save(Rental rental);
     
    /**
     * Finds a single rental that matches given id
     * @param rentalId
     * @return Rental that matches id
     */
    public Rental findRental(Long rentalId);
    
    /**
     * Returns all of active users rentals from rentalRep
     * @param logInName
     * @return list of users rentals
     */
    public List<Rental> allMyRentals(String logInName);
    
    /**
     * Searches rentals for car type, start date and end date
     * @param type
     * @param startDate
     * @param endDate
     * @return list of available rentals that meet the criteria
     */
    public List<Rental> rentalSearch(String type, Date startDate, Date endDate);
                    
}