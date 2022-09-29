/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.ui;

/**
 *
 * @author haize
 */
public class ViewFactory {
        private static View ui;
    public static View getView(String view) {
        if (ui == null) {
            if (view.equalsIgnoreCase("Text")) {
                ui = new TextViewImplementation();
            } else {
                ui = new FXViewImplementation();
            }
            
        }
        return ui;
    }
}
