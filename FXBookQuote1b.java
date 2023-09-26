// ------------------------------------------------------------------
// FXBookQuote1b - Displays a label and a button to a frame. When the
// use clicks the button, display the title of the book that contains
// the opening sentence or two from your favorite book in the label.
//         Naomi Nash - Saint Leo University - 25 June 2021
// ------------------------------------------------------------------
// Imports neccessary JavaFX libraries
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
// This class below contains values which state the
//   horizontal and vertical positioning or alignment
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
// This class below helps create the border layout
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class FXBookQuote2 extends Application 
{    
    @Override
    public void start(Stage stage) throws Exception 
    {
        // Sets the book quote label
        Label label = new Label();
        label.setText("Winter's Orbit by Everina Maxwell: " +
        "'Well, someone has to marry the man,' the Emperor said.'");
        label.setVisible(false);
        label.setTextFill(Paint.valueof("black"));

        // Sets the "Click for book!" button
        Button btn = new Button();
        btn.setText("Click for book!");
        btn.setOnAction(
            new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent event)
                {
                    // Adds a counter
                    clickCount++
                    // Makes label visible after button is pressed
                    if(clickCount >=1)
                    {
                        label.setVisible(true);
                    }
                }
            });
            
            // Creates the VBox border layout
            VBox content = new VBox();
            content.setAlignment(Pos.CENTER);
            content.setSpacing(20);
            content.getChildren().addAll(label, bnt);

            StackPane root = new StackPane();
            root.getChildren().add(content);

            // Creates the scene
            Scene scene = new Scene(root, 400, 400);

            // Sets the created scene
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
