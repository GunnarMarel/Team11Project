package is.hi.Team11.services;

import is.hi.Team11.model.Rental;
import java.util.List;


public interface RentalService {


    /**
     * Skilar öllum kennurum í kennariRep
     *
     * @return listi af kennurum
     */
    public List<Rental> allRentals();
    
    /**
     * Vistar rental
     * @param rental
     * @return 
     */
     public Rental save(Rental rental);
          
    

             
}
