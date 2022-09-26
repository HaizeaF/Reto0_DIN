package helloworldproject;

import helloworldproject.controller.Controller;
import helloworldproject.model.ModelFactory;
import helloworldproject.ui.ViewFactory;
import java.util.ResourceBundle;
import helloworldproject.ui.View;
import helloworldproject.model.Model;
import helloworldproject.exception.ModelTypeException;
import helloworldproject.exception.ViewTypeException;

/**
 * This is the pilar of the proyect and where the program will run.
 * @author sendoa
 */
public class Application {

    /**
     * @param args the command line arguments
     * @throws helloworldproject.exception.ModelTypeException
     * @throws helloworldproject.exception.ViewTypeException
     */
    public static void main(String[] args) throws ModelTypeException, ViewTypeException {
        ResourceBundle bundle = ResourceBundle.getBundle("helloworldproject.config");
        String storage = bundle.getString("STORAGE_TYPE");
        String view = bundle.getString("VIEW_TYPE");
        
        Model model = ModelFactory.getModel(storage);
        View cView = ViewFactory.getView(view);
        
        Controller controller = new Controller();
        try {
            controller.run(cView,model);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}