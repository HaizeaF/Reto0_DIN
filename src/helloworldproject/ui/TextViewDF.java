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
public class TextViewDF {
        private static InterfaceUI tUI;
    public static InterfaceUI getView() {
        if (tUI == null) {
            tUI = new TextViewImp();
        }
        return tUI;
    }
}
