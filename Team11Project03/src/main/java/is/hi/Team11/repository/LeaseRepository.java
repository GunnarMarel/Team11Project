/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.repository;

import is.hi.Team11.model.Lease;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Óskar Gíslason <osg1@hi.is>
 */
public interface LeaseRepository extends JpaRepository<Lease, Long> {
    
    List<Lease> findAll();
    
    Lease findOne(Long id);
    
    Lease save(Lease lease);
    
    @Query(value = "SELECT l FROM Lease l where l.owner = :owner ")
    List<Lease> searchOwner(@Param("owner") String owner);
    
    @Query(value = "SELECT l FROM Lease l where l.renter = :renter ")
    List<Lease> searchRenter(@Param("renter") String renter);
}
