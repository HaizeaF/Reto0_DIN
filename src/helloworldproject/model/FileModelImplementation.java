package helloworldproject.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is the implementation of the model with a file. This class implements the model interface.
 * @author haize
 */
public class FileModelImplementation implements Model {
     ResourceBundle bundle = ResourceBundle.getBundle("helloworldproject.config");
     /**
     * This method gets the greeting from the file using BufferedReader.
     * @return greeting obtained from the file.
     */
    @Override
    public String getGreeting() {
       return bundle.getString("GREET");
    }
    
}
