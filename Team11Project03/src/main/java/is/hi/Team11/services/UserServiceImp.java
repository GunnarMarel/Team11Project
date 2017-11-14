package is.hi.Team11.services;

import is.hi.Team11.model.User;
import is.hi.Team11.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * Service class for user repository 
 * 
 * @author Óskar Gíslason & Gunnar Marel
 * @date October 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 */
@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRep;

    @Override
    public List<User> allUsers() {
        return userRep.findAll();
    }
    
    @Override
    public User save(User user) {
        return userRep.save(user);
    }

    @Override
    public User userLogin(String logInName, String logInPass) {
        User user = this.findUser(logInName);
        if (user != null && user.getLogInPass().equals(logInPass)) {
            return user;
        }
        return null;
    }

    @Override
    public User findUser(String logInName) {
        if(userRep.findByLogInName(logInName) != null)
            return userRep.findByLogInName(logInName);
        else
            return null;
    }   

    @Override
    public Boolean usernameTaken(String username) {
        return userRep.findByLogInName(username) != null;
    }

    @Override
    public User updateUser(String logInName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean erALifi() {
        return true;
    }
}
