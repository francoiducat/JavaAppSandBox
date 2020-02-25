package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created on 02/13/2020.
 */
public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    Button btn = new Button();
    btn.setText("Print 'Hello World'");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        System.out.println("event = " + event.toString());
      }
    });

  }
}
