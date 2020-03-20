
package sample;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 2:
 *
 * (Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as
 * shown in Figure 14.43b. A cell may be X, O, or empty. What to display at each
 * cell is randomly decided. The X and O are images in the files x.gif and
 * o.gif.
 *
 * Created by Luiz Arantes Sa on 9/13/14.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int random = (int) (Math.random() * 3);
                if (random != 2) {
                    String image;
                    if(random>0){
                        image = "file:///C:/Users/skeva/Desktop/OOPJ/clg/5/src/sample/o.gif";
                    }
                    else{
                        image = "file:///C:/Users/skeva/Desktop/OOPJ/clg/5/src/sample/x.gif";
                    }
                    pane.add(new ImageView(new Image(image)), j, i);
                }
            }
        }
        Scene scene = new Scene(pane, 150, 150);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);

    }

}