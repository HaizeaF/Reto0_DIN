package helloworldproject.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * This class implements the method "showGreeting" from the View class and creates the UI.
 * @author Julen
 */
public class FXViewImplementation extends Application implements View {
 
    /**
     * This method creates the User Interface.
     * @param primaryStage The Stage is the space where the elements like Buttons,Labels are placed
     */
    
    @Override
    public void start(Stage primaryStage) {
        String param = getParameters().getRaw().get(0);
        StackPane root = new StackPane();
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            /**
             * This Overrided method is a method that produce an event that 
             * set Visible a button and when its clicked a Label is shown.
             * @param event An event
             */
            
            @Override
            public void handle(ActionEvent event) {
                btn.setVisible(false);
                Label greetingLabel = new Label(param);
                root.getChildren().add(greetingLabel);
            }
        });
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * This is an implemented method from View class and show the greeting.
     * @param greeting String with the greeting.
     */

    @Override
    public void showGreeting(String greeting) {
       launch(greeting);
    }
    
}
