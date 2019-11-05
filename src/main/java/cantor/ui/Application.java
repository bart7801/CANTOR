package cantor.ui;

/*  "CANTOR" - currency exchange is a small application that converts
    the Polish currency PLN to other currencies from different days */

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public void start(Stage primaryStage) {
        VBox root = new MainView();
        primaryStage.setTitle("CANTOR");
        primaryStage.setScene(new Scene(root, 300, 150));
        primaryStage.show();
    }
}