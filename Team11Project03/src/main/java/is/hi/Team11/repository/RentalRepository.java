package is.hi.Team11.repository;

import is.hi.Team11.model.Rental;
import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Repository for rentals
 * @author Óskar Gíslason & Gunnar Marel
 * @date  September 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
public interface RentalRepository extends JpaRepository<Rental, Long>{
    
    /**
     * Fetches all rentals
     * @return list of rentals
     */
    List<Rental> findAll();
    
    /**
     * Saves a rental
     * @param rental 
     */
    Rental save (Rental rental);
    
    /**
     * Finds a specific rental by id
     * @param rentalId
     * @return rental
     */
    Rental findOne(Long rentalId);
    
    /**
     * Finds all rentals owned by specific user
     * @param userName
     * @return list of cars owned by user
     */ 
    @Query(value = "SELECT r FROM Rental r where r.ownerName = :userName ")
    List<Rental> findAllOwnedByUser(@Param("userName") String userName);
    
    /**
     * Finds all rentals of a certain car type available between start date and end date
     * @param type
     * @param start
     * @param end
     * @return list of available rentals
     */
    @Query(value = "SELECT r FROM Rental r where r.carType = :type AND :start >= r.startDate AND :end <= r.endDate")
    List<Rental> findBySearch(@Param("type") String type, @Param("start") Date start, @Param("end") Date end);

}