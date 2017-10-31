package is.hi.Team11.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Lease contains details of a rental car lease between owner and renter
 * 
 * @author Óskar Gíslason
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 */
@Entity
@Table (name="lease")
public class Lease {

    @Id
    @Column(name="leaseId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long leaseId;
    
    private Long rentalId;
    private String owner;
    private String renter;
    private int fullPrice;
    private Date startDate;
    private Date endDate;

    
    public Lease(Long rentalId, String owner, String renter, int fullPrice, Date startDate, Date endDate) {
        this.rentalId = rentalId;
        this.owner = owner;
        this.renter = renter;
        this.fullPrice = fullPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public Lease(){
        
    }

    public Long getRentalId() {
        return rentalId;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(Long leaseId) {
        this.leaseId = leaseId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }
    
    
}