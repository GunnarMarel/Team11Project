package is.hi.Team11;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.containsString;
/**
 *
 * @author Óskar
 * @author Gunnar
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * Test class that bypasses the server by using MockMvc 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc     
public class ApplicationTest {
    
        // Mockrun
        @Autowired
        private MockMvc mockMvc;
         
        /**
         * Checks whether HttpRequest to /allRentals works and
         * returns allRentals.html page with the string "All rentals:"
         */
	@Test 
        public void welcomeReturns() throws Exception {
        this.mockMvc.perform(get("/welcome"))                
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Stutt Leiga")));
    }

}
