/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.services;

import is.hi.Team11.model.Lease;
import java.util.List;

/**
 *
 * @author Óskar Gíslason
 * @date október 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
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
}
