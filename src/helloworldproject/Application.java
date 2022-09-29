/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject;

import helloworldproject.controller.Controller;
import helloworldproject.model.DBModelFactory;
import helloworldproject.model.FileModelFactory;
import helloworldproject.ui.TextViewFactory;
import java.util.ResourceBundle;
import helloworldproject.ui.View;
import helloworldproject.model.Model;
import helloworldproject.ui.FXViewFactory;

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
        
        Model model = getModel(storage);
        View cView = getView(view);
        
        Controller controller = new Controller();
        controller.run(cView,model);
    }
    
    public static View getView(String view) {
        View cView;
        if (view.equalsIgnoreCase("Text")) {
            cView = TextViewFactory.getView();
        } else {
            // Cambiar duplicado. Solo para pruebas
            cView = FXViewFactory.getView();
        }
        return cView;
    }
    
    public static Model getModel(String storage) {
        Model model;
        if (storage.equalsIgnoreCase("File")) {
            model = FileModelFactory.getModel();
        } else {
            // Cambiar duplicado. Solo para pruebas
            model = DBModelFactory.getModel();
        }
        return model;
    }
}