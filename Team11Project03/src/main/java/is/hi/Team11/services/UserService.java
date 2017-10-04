package is.hi.Team11.services;

import is.hi.Team11.model.User;
import java.util.List;

/**
 *
 * @author Ebba Þóra Hvannberg
 * @date september 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Þjónusta sem athugar hvort nafn er á réttu formi, bætir við kennara og námskeiði
 * á kennara 
 *
 */
public interface UserService {

    /**
     * Athugar hvort nafn er á réttu formi, þ.e. verða að vera a.m.k. tvö orð.
     *
     * @param firstName
     * @return skilar satt ef nafn er á réttu formi annars ósatt
     */
    public boolean erNafnRett(String firstName);

    /**
     * Skilar öllum kennurum í kennariRep
     *
     * @return listi af kennurum
     */
    public List<User> allUsers();
    
    /**
     * Vistar kennari í kennarasafnið
     * @param user
     * @return 
     */
     public User save(User user);
          
    

             
}
