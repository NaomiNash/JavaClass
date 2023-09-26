// ---------------------------------------------------------
// FXFrameDisableButton2b - Disables the button contained in 
// the application after the user has clicked it at least 8 
// times and displays a label saying "That's enough!"
//     Naomi Nash - Saint Leo University - 24 June 2021
// ---------------------------------------------------------
// Imports neccessary javax methods
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

public class FXFrameDisableButtone2b extends Application
{
    // Declares the click count
    int clickCount = 0;

    @Override
    public void start(Stage primaryStage)
    {
        // Sets the "Thats enough!" label
        Label label = new Label();
        label.setText("Thats enough!");
        label.setVisible(false);
        label.setTextFill(Paint.valueof("red"));

        // Sets the "Click me!" button
        Button btn = new Button();
        btn.setText("Click me!");
        btn.setOnAction(
            new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent event)
                {
                    // Adds a counter
                    clickCount++
                    // Disables the button whent he user clicks
                    //   the button 8 times
                    if(clickCount >=8)
                    {
                        btn.setDisable(true);
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
}
