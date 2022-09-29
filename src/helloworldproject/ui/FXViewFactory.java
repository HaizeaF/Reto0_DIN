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
public class FXViewFactory {
        private static FXViewImplementation fxUI;
    public static View getView() {
        if (fxUI == null) {
            fxUI = new FXViewImplementation();
        }
        return fxUI;
    }
}
