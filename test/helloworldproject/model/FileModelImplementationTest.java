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
public class FileModelImplementationTest {
    
    public FileModelImplementationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        FileModelImplementation instance = new FileModelImplementation();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
