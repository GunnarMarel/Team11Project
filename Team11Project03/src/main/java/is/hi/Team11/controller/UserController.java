package is.hi.Team11.controller;

import is.hi.Team11.model.User;
import is.hi.Team11.services.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Óskar Gíslason
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Controller for a car rental web application. Controls user registration, 
 * user information and user login/logout.
 */
@Controller
public class UserController {
    
    @Autowired
    UserService userService;

    /**
     * Page where users input their user information
     * @return page with registration forms
     */
    @RequestMapping(value = "/register")
    public String userRegister() {
        return "register";
    }  
    
    /**
     * Creates a new user
     * @param firstName
     * @param lastName
     * @param logInName
     * @param logInPass
     * @return login page
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveUser(@RequestParam String firstName, @RequestParam String lastName, 
            @RequestParam String logInName, @RequestParam String logInPass, Model model) { 
        
        if (userService.usernameTaken(logInName) == true) {
            model.addAttribute("registerError", "error: Username is already taken.");
            return "register";
        }
        else {
            User user = new User(firstName, lastName, logInName, logInPass);
            userService.save(user);
            return "login";
        }
    } 
    
    /**
     * Login page where users input their username and password 
     * @return page with login forms
     */
    @RequestMapping("/login")
    public String loginPage(){
        return "login";                           
    }
    
    /**
     * Start page for users that are logged in
     * @return page for logged in users
     */
    @RequestMapping("/loggedUser")
    public String loggedPage(Model model, HttpSession session){
        model.addAttribute("user", (User)session.getAttribute("loggedUser"));
        return "loggedUser";                            
    }      
    
    /**
     * Verifies username and password and welcomes logged in users
     * @param logInName
     * @param logInPass
     * @param model
     * @return page where user is logged in
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String verifyUser(@RequestParam String logInName, 
            @RequestParam String logInPass, Model model, HttpSession session) {
        User user = userService.userLogin(logInName, logInPass);
        if (user == null) {
            model.addAttribute("logInError", "attempt failed, please try again.");
            return "login";
        }
        model.addAttribute("user", user);
        session.setAttribute("loggedUser", user);
        return "loggedUser";
    }
    
    /**
     * Logs a user out of user session
     * @param session
     * @return welcome page
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.removeAttribute("loggedUser");
        return "welcome";
    }
    
    /**
     * Displays all users
     * @param model
     * @return page with all users
     */
    @RequestMapping(value = "/listUsers", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("users", userService.allUsers());
        return "allUsers";
    }    
    
    /**
     * Displays user edit page with user information
     * @param model
     * @param session
     * @return page with user info
     */
    @RequestMapping(value = "/editUser")
    public String editUser(Model model, HttpSession session) {
        User user = (User)session.getAttribute("loggedUser"); 
        model.addAttribute("user", userService.findUser(user.getLogInName()));
        return "editUser";
    }
    
    /**
     * Saves changes to user information
     * @param firstName
     * @param lastName
     * @param session
     * @return page for logged in users
     */
    @RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public String saveChanges(@RequestParam String firstName, 
            @RequestParam String lastName, HttpSession session, Model model) {
        User user = (User)session.getAttribute("loggedUser");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        userService.save(user);
        model.addAttribute("user", user);
        return "loggedUser";    
    }
}
