/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.controller;

import helloworldproject.model.InterfaceModel;
import helloworldproject.ui.InterfaceUI;

/**
 *
 * @author haize
 */
public class Controller {
    public static void run(InterfaceUI cView,InterfaceModel model) {
        cView.showGreeting(model.getGreeting());
    }
}
