/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.ui;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SailenGliese
 */
public class TextViewImplementationTest {
    
    public TextViewImplementationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of showGreeting method, of class TextViewImplementation.
     */
    @Test
    public void testShowGreeting() {
        System.out.println("showGreeting");
        String greeting = "";
        TextViewImplementation instance = new TextViewImplementation();
        instance.showGreeting(greeting);
        fail("The test case is a prototype.");
    }
    
}
