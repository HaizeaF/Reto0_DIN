/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject;

import helloworldproject.controller.Controller;
import helloworldproject.model.ModelFactory;
import helloworldproject.ui.ViewFactory;
import java.util.ResourceBundle;
import helloworldproject.ui.View;
import helloworldproject.model.Model;

/**
 *
 * @author haize
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("helloworldproject.config");
        String storage = bundle.getString("STORAGE_TYPE");
        String view = bundle.getString("VIEW_TYPE");
        
        Model model = ModelFactory.getModel(storage);
        View cView = ViewFactory.getView(view);
        
        Controller controller = new Controller();
        controller.run(cView,model);
    }
}