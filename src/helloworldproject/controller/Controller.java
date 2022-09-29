package helloworldproject.controller;

import helloworldproject.ui.View;
import helloworldproject.model.Model;

/**
 *This class is the controler that takes the info from the model and sends it to the View.
 * @author Julen
 */
public class Controller {
    /**
     * This method takes the greeting from the model class and shows it in the View.
     * @param cView This is the View Class where is sent the greeting.
     * @param model This is the Model Class where takes the greeting.
     */
    
    public void run(View cView,Model model) {
        cView.showGreeting(model.getGreeting());
    }
}
