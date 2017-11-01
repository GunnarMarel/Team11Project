package is.hi.Team11;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
/**
 *
 * @author Óskar
 * @author Gunnar
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * Test class that checks URL via a test web client
*/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {
    
        @LocalServerPort
         private int port;
                 
        @Autowired
        private TestRestTemplate restTemplate;
         
        /**
         * Sends a HttpRequest to the home page URL and 
         * returns a site containing the string "Rent cars"
         * @throws java.lang.Exception
         */
	@Test
        public void welcomeReturns() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/welcome/",
                String.class)).contains("Rent cars");
    }

}
