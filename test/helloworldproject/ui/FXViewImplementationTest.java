/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.ui;

import javafx.stage.Stage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SailenGliese
 */
public class FXViewImplementationTest {
    
    public FXViewImplementationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of start method, of class FXViewImplementation.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Stage primaryStage = null;
        FXViewImplementation instance = new FXViewImplementation();
        instance.start(primaryStage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showGreeting method, of class FXViewImplementation.
     */
    @Test
    public void testShowGreeting() {
        System.out.println("showGreeting");
        String greeting = "";
        FXViewImplementation instance = new FXViewImplementation();
        instance.showGreeting(greeting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
