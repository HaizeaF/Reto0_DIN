/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haize
 */
public class FileModelImp implements InterfaceModel {
    File file = new File("src/helloworldproject/model/greeting.obj");
    BufferedReader br = null;
    String greeting = null;

    @Override
    public String getGreeting() {
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file),StandardCharsets.UTF_8));
            greeting = br.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileModelImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileModelImp.class.getName()).log(Level.SEVERE, null, ex);
        }
       return greeting;
    }
    
}
