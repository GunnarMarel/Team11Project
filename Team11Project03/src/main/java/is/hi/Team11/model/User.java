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

/**
 * User contains details of user accounts
 * 
 * @author Gunnar Marel
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 */
@Entity
@Table (name="users")
public class User {
     
    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    @NotNull(message = "Input first name")
    @Size(min=1, max=20, message="First name must be between 1 and 20 characters long")    
    private String firstName;
    
    @NotNull(message = "Input last name")
    @Size(min=1, max=20, message="Last name must be between 1 and 20 characters long")    
    private String lastName;
    
    private Date birthday;
    
    @NotNull(message = "Input username")
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters long")    
    private String logInName;
    
    @NotNull(message = "Input password")
    @Size(min=5, max=15, message="Password must be between 5 and 15 characters long")    
    private String logInPass;

    public User(String fn, String ln, String id, String pass) {
        this.firstName = fn;
        this.lastName = ln;
        this.logInName = id;
        this.logInPass = pass;
    }
    
    public User() {
        
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getLogInName() {
        return logInName;
    }

    public String getLogInPass() {
        return logInPass;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setLogInName(String logInName) {
        this.logInName = logInName;
    }

    public void setLogInPass(String logInPass) {
        this.logInPass = logInPass;
    }
}