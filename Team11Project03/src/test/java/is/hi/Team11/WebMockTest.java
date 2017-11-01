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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 *
 * @author Óskar
 * @author Gunnar
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * 
 * Test class that tests the web layer and a service class using WebMvcTest and Mockito
*/

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)                             
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    UserService userService;
     
    /**
     * Tests registration through UserController when usernameTaken() returns true
     * Should return registration.html
     * 
     */
    @Test
    public void testUsernameTakenTrueCorrectString() throws Exception {
        when(userService.usernameTaken("John")).thenReturn(true);
        this.mockMvc.perform(post("/register").param("firstName", "John").param("lastName", "John")
                .param("logInName", "John").param("logInPass", "John")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("User registration")));  
    }
    
    /**
     * Tests registration through UserController when usernameTaken() returns false
     * Should return login.html
     * 
     */
    @Test
    public void testUsernameTakenFalseCorrectString() throws Exception {
        
        when(userService.usernameTaken("John")).thenReturn(false);
        this.mockMvc.perform(post("/register").param("firstName", "John").param("lastName", "John")
                .param("logInName", "John").param("logInPass", "John")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("User login")));  
    }
    
    /**
     * Tests registration through UserController when usernameTaken() returns false
     * Expects a wrong string value so the test should fail
     * @throws Exception 
     * 
     */
    
    /*
    @Test
    public void testUserNameTakenFalseWrongString() throws Exception {
        
        when(userService.usernameTaken("John")).thenReturn(false);
        this.mockMvc.perform(post("/register").param("firstName", "John").param("lastName", "John")
                .param("logInName", "John").param("logInPass", "John")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("User registration"))); 
    }
    */
}
