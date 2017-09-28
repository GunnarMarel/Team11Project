/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.rentalData;

import is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData.Car;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ulfur
 */
public class RentalOfferTest {
    
    public RentalOfferTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCar method, of class RentalOffer.
     */
    @Test
    public void testGetCar() {
        System.out.println("getCar");
        RentalOffer instance = new RentalOffer();
        Car expResult = null;
        Car result = instance.getCar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCar method, of class RentalOffer.
     */
    @Test
    public void testSetCar() {
        System.out.println("setCar");
        Car car = null;
        RentalOffer instance = new RentalOffer();
        instance.setCar(car);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class RentalOffer.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        RentalOffer instance = new RentalOffer();
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class RentalOffer.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        Date startDate = null;
        RentalOffer instance = new RentalOffer();
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class RentalOffer.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        RentalOffer instance = new RentalOffer();
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class RentalOffer.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        Date endDate = null;
        RentalOffer instance = new RentalOffer();
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
