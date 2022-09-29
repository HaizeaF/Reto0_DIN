/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject.controller;

import helloworldproject.ui.View;
import helloworldproject.model.Model;

/**
 *
 * @author haize
 */
public class Controller {
    public void run(View cView,Model model) {
        cView.showGreeting(model.getGreeting());
    }
}
