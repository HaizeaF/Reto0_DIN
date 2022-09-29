/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.model;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author SailenGliese
 */
public class DBModelImplementationTest {
    
    private static DBModelImplementation instance;
    
    @BeforeClass
    public static void setUpClass() {
        instance = new DBModelImplementation();
        instance.openConnection();
    }
    
    @AfterClass
    public static void tearDownClass() {
        instance.closeConnection();
    }
    /**
     * Test of getGreeting method, of class DBModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        String expResult = "Hello World!!! DB";
        String notResult = "Hello World!!! File";
        String result = instance.getGreeting();
        assertNotNull("Null result",result);
        assertEquals("Not DB result",expResult, result);
        assertNotEquals("File result",notResult, result);
    }
    
}
