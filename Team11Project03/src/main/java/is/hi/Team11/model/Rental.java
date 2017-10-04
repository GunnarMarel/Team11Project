/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Notandi
 */
@Entity
@Table (name="Rental")
public class Rental {
     
    // Skilgreini id sem auðkenni (e. identity)  hlutarins 
    @Id
    @Column(name="rentalId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentalId;
    
    
    public Long getUSerId() {
        return rentalId;
    }

    public void setUserId(Long userId) {
        this.rentalId = userId;
    }
    private int ownerId;
    private int carId;
    private Date startDate;
    private Date endDate;
    private int price;


    // Smiður til að búa til tóman hlut. Hefur enga parametra
    public Rental() {
        
    }

    public Long getRentalId() {
        return rentalId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getCarId() {
        return carId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getPrice() {
        return price;
    }

    public void setRentalId(Long rentalId) {
        this.rentalId = rentalId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
}


