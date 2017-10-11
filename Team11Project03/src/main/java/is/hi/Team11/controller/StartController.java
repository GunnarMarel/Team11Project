package is.hi.Team11.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("page/welcome")
    public String welcomePage(){
        return "page/welcome";                           
    }
}