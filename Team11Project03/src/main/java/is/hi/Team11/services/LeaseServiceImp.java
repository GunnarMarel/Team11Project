/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.services;

import is.hi.Team11.model.Lease;
import is.hi.Team11.repository.LeaseRepository;
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
}
