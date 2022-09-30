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
    
    private static FileModelImplementation model;
    
    @BeforeClass
    public static void setUpClass() {
        model = new FileModelImplementation();
    }
    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        String expResult = "Hello World!!! Lorea";
        String notResult = "Hello World!!! 2dam";
        String result = model.getGreeting();
        assertNotNull("Null result",result);
        assertEquals("Not file result",expResult, result);
        assertNotEquals("DB result",notResult, result);
    }
    
}
