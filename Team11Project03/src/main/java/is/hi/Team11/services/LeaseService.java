package is.hi.Team11.services;

import is.hi.Team11.model.Lease;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Óskar Gíslason & Gunnar Marel
 * @date October 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * 
 * Service that saves leases, finds leases by id, finds owner/renter and lists all leases.
 *
 */
public interface LeaseService {
        
    /**
     * Returns all leases in leaseRepository
     *
     * @return list of all the leases in the repository
     */
    public List<Lease> allLeases();
    
    /**
     * Saves a lease to repository
     * @param lease
     * @return 
     */
     public Lease save(Lease lease);
     
    /**
     * Finds a single lease agreement that matches given id
     * @param id
     * @return Lease that matches id
     */
    public Lease findLease(Long id);

    /**
     * Finds leases that match owners username
     * @param owner
     * @return Lease that matches owner
     */
    public List<Lease> findOwner(String owner);
    
    /**
     * Finds leases that match renters username
     * @param renter
     * @return Lease that matches renter
     */
    public List<Lease> findRenter(String renter);
    
    /**
     * Finds leases that match renters username
     * @param rentalId
     * @return Lease that matches renter
     */
    public List<Lease> findRenterId(Long rentalId);
    
    /**
     * Checks whether a date has already been booked
     * @param startDate
     * @param endDate
     * @param owner
     * @return 
     */
    public Boolean dateAvailable(Date startDate,Date endDate,Long renterId);
}
