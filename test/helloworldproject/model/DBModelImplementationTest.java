/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SailenGliese
 */
public class DBModelImplementationTest {
    
    public DBModelImplementationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of openConnection method, of class DBModelImplementation.
     */
    @Test
    public void testOpenConnection() {
        System.out.println("openConnection");
        DBModelImplementation instance = new DBModelImplementation();
        instance.openConnection();
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class DBModelImplementation.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        DBModelImplementation instance = new DBModelImplementation();
        instance.closeConnection();
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGreeting method, of class DBModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        DBModelImplementation instance = new DBModelImplementation();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
