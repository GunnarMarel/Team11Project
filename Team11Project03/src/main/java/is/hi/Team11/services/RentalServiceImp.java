package is.hi.Team11.services;

import is.hi.Team11.model.Rental;
import is.hi.Team11.repository.RentalRepository;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * Service class for rental repository 
 * 
 * @author Óskar Gíslason & Gunnar Marel
 * @date October 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class RentalServiceImp implements RentalService{

    @Autowired
    RentalRepository rentalRep;
    
    @Override
    public List<Rental> allRentals() {
        return rentalRep.findAll();
    }
    
    @Override
    public Rental save(Rental rental) {
        return rentalRep.save(rental);
    }

    @Override
    public Rental findRental(Long rentalId) {
        return rentalRep.findOne(rentalId);
    }   

    @Override
    public List<Rental> allMyRentals(String logInName) {
        return rentalRep.findAllOwnedByUser(logInName);
    }

    @Override
    public List<Rental> rentalSearch(String type, Date startDate, Date endDate) {
        return rentalRep.findBySearch(type, startDate, endDate);
    }
}
