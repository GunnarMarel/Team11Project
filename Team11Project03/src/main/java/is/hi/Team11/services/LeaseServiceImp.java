package is.hi.Team11.services;

import is.hi.Team11.model.Lease;
import is.hi.Team11.model.Rental;
import is.hi.Team11.repository.LeaseRepository;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * Service class for lease repository 
 * 
 * @author Óskar Gíslason & Gunnar Marel
 * @date October 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class LeaseServiceImp implements LeaseService{

    @Autowired
    LeaseRepository leaseRepo;
    @Autowired
    RentalService rentalService;
    
    @Override
    public List<Lease> allLeases() {
        return leaseRepo.findAll();
    }

    @Override
    public Lease save(Lease lease) {
        return leaseRepo.save(lease);
    }

    @Override
    public Lease findLease(Long id) {
        return leaseRepo.findOne(id);
    }

    @Override
    public List<Lease> findOwner(String owner) {
        return leaseRepo.searchOwner(owner);
    }

    @Override
    public List<Lease> findRenter(String renter) {
        return leaseRepo.searchRenter(renter);
    }
    
    @Override
    public List<Lease> findRenterId(Long renterId) {
        return leaseRepo.searchRenterId(renterId);
    }
    
    @Override
    public Boolean dateAvailable(Date startDate,Date endDate,Long renterId) {
        List<Lease> rentalList = leaseRepo.searchRenterId(renterId);
        Rental rental = rentalService.findRental(renterId);
        for(Lease l:rentalList){
            if((l.getStartDate().before(endDate) && startDate.before(l.getEndDate()))
                    || !startDate.before(endDate) 
                    || !rental.getStartDate().before(startDate) 
                    || !rental.getEndDate().after(endDate)){
                return false;
            }
        }
        return true;
    }
}
