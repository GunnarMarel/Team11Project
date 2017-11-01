package is.hi.Team11;

import is.hi.Team11.controller.UserController;
import is.hi.Team11.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 *
 * @author Óskar Gíslason <osg1@hi.is>
 * Test class that tests the web layer using WebMvcTest 
*/
@RunWith(SpringRunner.class)
@WebMvcTest (UserController.class)                                           
public class WebLayerTest {
    
        @Autowired
        private MockMvc mockMvc;
        
        @MockBean
        UserService userService;
        /**
         * Sends HttpRequest to register. 
         * Should return register.html page containing the string "Sign up"
         */
	@Test 
        public void registerReturns() throws Exception {
        this.mockMvc.perform(get("/register/"))                
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Sign up")));
    }

}
