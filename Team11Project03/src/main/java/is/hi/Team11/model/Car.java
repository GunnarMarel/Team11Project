/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.model;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Car contains all details of cars owned by users
 * 
 * @author Gunnar Marel
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 */
@Entity
@Table (name="car")
public class Car {
     
    @Id
    @Column(name="carId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;
    
    private Long ownerId;
    private String carType;
    
    @NotNull(message = "Input car model")
    @Size(min=1, max=30, message="Input car model")
    private String model;
    
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Car() {
    }
    
    public Car(String ownerName, String carType, String model) {
        this.ownerName = ownerName;
        this.carType = carType;
        this.model = model;
    }

    public Long getCarId() {
        return carId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getCarType() {
        return carType;
    }

    public String getModel() {
        return model;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    public void setModel(String model) {
        this.model = model;
    }

}
