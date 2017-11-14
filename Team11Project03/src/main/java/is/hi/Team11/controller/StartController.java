package is.hi.Team11.controller;

import is.hi.Team11.model.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Óskar Gíslason
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Controller for a car rental web application. Welcome page.
 */
@Controller
public class StartController {
     
    /**
     * Welcome page where users can register an account or log in 
     * @return welcome page
     */
    @RequestMapping("/welcome")
    public String welcomePage(){
        return "welcome";                           
    }
}