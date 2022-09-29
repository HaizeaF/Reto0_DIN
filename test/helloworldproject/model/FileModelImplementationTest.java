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
    
    private static FileModelImplementation instance;
    
    @BeforeClass
    public static void setUpClass() {
        instance = new FileModelImplementation();
    }
    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        String expResult = "Hello World!!! File";
        String notResult = "Hello World!!! DB";
        String result = instance.getGreeting();
        assertNotNull("Null result",result);
        assertEquals("Not file result",expResult, result);
        assertNotEquals("DB result",notResult, result);
    }
    
}
