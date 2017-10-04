
package is.hi.Team11.services;

import is.hi.Team11.model.Rental;
import is.hi.Team11.model.User;
import is.hi.Team11.repository.RentalRepository;
import is.hi.Team11.repository.UserRepository;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RentalServiceImp implements RentalService{

    // Tenging yfir í safn af kennurum 
    @Autowired
    RentalRepository rentalRep;
    

    @Override
    public List<Rental> allRentals() {
        return rentalRep.findAll();    // Notum findAll í staðinn fyrir getAll
    }
    
    @Override
    public Rental save(Rental rental) {
        return rentalRep.save(rental);
    }




    
}
