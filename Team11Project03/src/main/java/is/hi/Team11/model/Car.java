/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.model;

import java.awt.Image;
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
@Table (name="User")
public class Car {
     
    // Skilgreini id sem auðkenni (e. identity)  hlutarins 
    @Id
    @Column(name="carId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;
    
    
    public Long getUSerId() {
        return carId;
    }

    public void setUserId(Long userId) {
        this.carId = carId;
    }
    private int ownerId;
    private String carType;
    private Image Pictures;
    private String model;

    // Smiður til að búa til tóman hlut. Hefur enga parametra
    public Car() {
        
    }

    public Long getCarId() {
        return carId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getCarType() {
        return carType;
    }

    public Image getPictures() {
        return Pictures;
    }

    public String getModel() {
        return model;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setPictures(Image Pictures) {
        this.Pictures = Pictures;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    
}


