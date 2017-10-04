
package is.hi.Team11.services;

import is.hi.Team11.model.User;
import is.hi.Team11.repository.UserRepository;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * Þjónustu (e. service ) klasi fyrir kennara og námskeiðasöfnin 
 * 
 * @author Ebba Þóra Hvannberg 
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class UserServiceImp implements UserService{

    // Tenging yfir í safn af kennurum 
    @Autowired
    UserRepository userRep;
    
    
    @Override
    public boolean erNafnRett(String firstName) {
        return true;
    }

    @Override
    public List<User> allUsers() {
        return userRep.findAll();    // Notum findAll í staðinn fyrir getAll
    }
    
    @Override
    public User save(User user) {
        return userRep.save(user);
    }




    
}
