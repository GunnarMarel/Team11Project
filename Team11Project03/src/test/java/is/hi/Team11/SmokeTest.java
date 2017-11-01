package is.hi.Team11;

import is.hi.Team11.controller.UserController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 *
 * @author Óskar
 * @author Gunnar
 * @date October 2017 
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * Test class that checks whether UserController runs
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {
    
        @Autowired 
        UserController userController;

        /**
         * Checks whether userController object has been instantiated
         */
	@Test
	public void contextLoads() {
                   assertThat(userController).isNotNull();
	}

}
