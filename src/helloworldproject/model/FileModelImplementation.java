package helloworldproject.model;

import java.util.ResourceBundle;

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
