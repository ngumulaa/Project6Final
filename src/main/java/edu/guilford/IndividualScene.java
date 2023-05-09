package edu.guilford;

import java.io.IOException;

import edu.Individual;
import edu.IndividualPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class IndividualScene extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Instantiate a VBox root node
        VBox root = new VBox();
        // Add a label to the root node
       
        // Instantiate a defualt Individual object 
        // Individual individual = new Individual();

        // Instantiate an IndividualPane object and add it to the root node
        root.getChildren().add(new IndividualPane(new Individual()));
        scene = new Scene(root, 1000, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}