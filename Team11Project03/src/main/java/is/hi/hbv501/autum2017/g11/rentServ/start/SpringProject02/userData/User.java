/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ulfur
 */
public class User {

    private String id;

    private String firstName;
    private String lastName;

    private Date birthday;

    public User() {

        this.id = "";
        this.firstName = "";
        this.lastName = "";

        this.birthday = null;

    }

    public User(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.birthday = user.getBirthday();
    }

    public User(String id, String firstName, String lastName, Date birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * returns formated html string for user
     * @return 
     */
    public String toHTML() {
        return "ID:" +this.id+", FirstName:" +this.firstName+", LastName: "+this.lastName;
    }

}
