/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject;

import helloworldproject.model.FileModelImp;
import helloworldproject.model.InterfaceModel;

/**
 *
 * @author haize
 */
public class HelloWorldProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceModel interMod = new FileModelImp();
        System.out.println(interMod.getGreeting());
    }
    
}
