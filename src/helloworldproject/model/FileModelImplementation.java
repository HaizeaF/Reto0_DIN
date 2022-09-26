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
 * This class is the implementation of the model with a file. This class implements the model interface.
 * @author haize
 */
public class FileModelImplementation implements Model {
    File file = new File("src/helloworldproject/model/greeting.obj");
    BufferedReader br = null;
    String greeting = null;
    
     /**
     * This method gets the greeting from the file using BufferedReader.
     * @return greeting obtained from the file.
     */
    @Override
    public String getGreeting() {
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file),StandardCharsets.UTF_8));
            greeting = br.readLine();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
       return greeting;
    }
    
}
