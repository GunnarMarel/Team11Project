/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.Team11.model;

import java.sql.Date;
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
    private String firstName;
    private String lastName;
    private Date birthday;
    private String logInName;
    private String logInPass;

    public User(String fn, String ln, String id, String pass) {
        this.firstName = fn;
        this.lastName = ln;
        this.logInName = id;
        this.logInPass = pass;
    }
    
    
    
   
  // @OneToMany(mappedBy="kennari",fetch=FetchType.LAZY,
  //         cascade=CascadeType.ALL, orphanRemoval=true)
  //  private Set<Namskeid> kenndNamskeid = new HashSet<Namskeid>();
        


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