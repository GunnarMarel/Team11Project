/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.hi.hbv501.autum2017.g11.rentServ.start.SpringProject02.userData;

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
public class CarTest {
    
    public CarTest() {
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
     * Test of getId method, of class Car.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Car.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Car instance = new Car();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class Car.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        Car instance = new Car();
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class Car.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        Car instance = new Car();
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCarType method, of class Car.
     */
    @Test
    public void testGetCarType() {
        System.out.println("getCarType");
        Car instance = new Car();
        CarType expResult = null;
        CarType result = instance.getCarType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCarType method, of class Car.
     */
    @Test
    public void testSetCarType() {
        System.out.println("setCarType");
        CarType carType = null;
        Car instance = new Car();
        instance.setCarType(carType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfDoors method, of class Car.
     */
    @Test
    public void testGetNumberOfDoors() {
        System.out.println("getNumberOfDoors");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getNumberOfDoors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfDoors method, of class Car.
     */
    @Test
    public void testSetNumberOfDoors() {
        System.out.println("setNumberOfDoors");
        int numberOfDoors = 0;
        Car instance = new Car();
        instance.setNumberOfDoors(numberOfDoors);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Car.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Car instance = new Car();
        User expResult = null;
        User result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class Car.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        User owner = null;
        Car instance = new Car();
        instance.setOwner(owner);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
