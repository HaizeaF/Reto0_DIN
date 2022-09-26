package helloworldproject.ui;

/**
 * This class implements the method "showGreeting" from the View class and shows it in the console.
 * @author Julen
 */
public class TextViewImplementation implements View {

    /**
     * This method shows the greeting in the console.
     * @param greeting String with the greeting.
     */
    
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
