package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Circl extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane
        Pane pane = new Pane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        // Create a circle
        Circle circle = new Circle(20, 20, 20);
        pane.getChildren().add(circle);

        // Create and register the handle
        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP : circle.setCenterY(circle.getCenterY() >
                        circle.getRadius() ? circle.getCenterY() - 40 :
                        circle.getCenterY());
                    break;
                case DOWN : circle.setCenterY(circle.getCenterY() <
                        pane.getHeight() - circle.getRadius() ?
                        circle.getCenterY() + 40 : circle.getCenterY());
                    break;
                case LEFT : circle.setCenterX(circle.getCenterX() >
                        circle.getRadius() ? circle.getCenterX() - 40 :
                        circle.getCenterX());
                    break;
                case RIGHT : circle.setCenterX(circle.getCenterX() <
                        pane.getWidth() - circle.getRadius() ?
                        circle.getCenterX() + 40: circle.getCenterX());
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Move the Circle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        pane.requestFocus();
    }

}