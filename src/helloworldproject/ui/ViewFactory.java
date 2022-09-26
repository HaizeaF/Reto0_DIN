package helloworldproject.ui;

import helloworldproject.exception.ViewTypeException;

/**
 *
 * @author Julen
 */
public class ViewFactory {
        private static View ui;
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
