/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

/**
 * Rental contains all details of a rental unit
 * 
 * @author Gunnar Marel
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 */
@Entity
@Table (name="Rental")
public class Rental {
     
     
    @Id
    @Column(name="rentalId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rentalId;
    
    private Long ownerId;
    private Long carId;
    private Date startDate;
    private Date endDate;
    
    @Range(min=1, max=1000, message="Set price per day")
    private int price;
    
    private String ownerName;
    
    @NotNull(message = "Please input car model")
    @Size(min=1, max=20, message="Model must be between 1 and 20 characters long")
    private String carModel;
    
    private String carType;
    
    public Rental(String ownerName, String carModel,String carType, Date startDate, Date endDate, int price){
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carType = carType;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Rental() {
        
    }

    public Long getRentalId() {
        return rentalId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Long getCarId() {
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

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setCarId(Long carId) {
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