/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject;

import helloworldproject.controller.Controller;
import helloworldproject.model.DBModelDF;
import helloworldproject.model.FileModelDF;
import helloworldproject.model.InterfaceModel;
import helloworldproject.ui.InterfaceUI;
import helloworldproject.ui.TextViewDF;
import java.util.ResourceBundle;

/**
 *
 * @author haize
 */
public class HelloWorldProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("helloworldproject.config");
        String storage = bundle.getString("STORAGE_TYPE");
        String view = bundle.getString("VIEW_TYPE");
        
        InterfaceModel model = getModel(storage);
        InterfaceUI cView = getView(view);
        
        Controller controller = new Controller();
        controller.run(cView,model);
    }
    
    public static InterfaceUI getView(String view) {
        InterfaceUI cView;
        if (view.equalsIgnoreCase("Text")) {
            cView = TextViewDF.getView();
        } else {
            // Cambiar duplicado. Solo para pruebas
            cView = TextViewDF.getView();
        }
        return cView;
    }
    
    public static InterfaceModel getModel(String storage) {
        InterfaceModel model;
        if (storage.equalsIgnoreCase("File")) {
            model = FileModelDF.getModel();
        } else {
            // Cambiar duplicado. Solo para pruebas
            model = DBModelDF.getModel();
        }
        return model;
    }
}