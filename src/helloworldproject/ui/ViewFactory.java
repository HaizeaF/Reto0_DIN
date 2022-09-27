package helloworldproject.ui;

import helloworldproject.exception.ViewTypeException;

/**
 * This class is the Factory that makes the decision of what View is gonna show, 
 * Text(Console) or JavaFX(UI) 
 * @author Julen
 */
public class ViewFactory {
        private static View ui;
        
        /**
         * This method takes the "View value" from the config.properties and makes 
         * the decision of  what View is gonna show asking with an "if".
         * @param view String that contains what view type is gonna use.
         * @return Returns the View type
         * @throws ViewTypeException The exception that is gonna catch if the value 
         * is not "Text" or "JavaFX"
         */
        
    public static View getView(String view)throws ViewTypeException {
        if (ui == null) {
            if (view.equalsIgnoreCase("Text")) {
                ui = new TextViewImplementation();
            } else if (view.equalsIgnoreCase("JavaFX")){
                ui = new FXViewImplementation();
            } else {
                throw new ViewTypeException("Invalid view type. Text/JavaFX please.");
            }
            
        }
        return ui;
    }
}
