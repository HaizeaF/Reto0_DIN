/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.controller;

import helloworldproject.model.Model;
import helloworldproject.ui.View;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SailenGliese
 */
public class ControllerTest {
    
    public ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        View cView = null;
        Model model = null;
        Controller instance = new Controller();
        instance.run(cView, model);
        fail("The test case is a prototype.");
    }
    
}
