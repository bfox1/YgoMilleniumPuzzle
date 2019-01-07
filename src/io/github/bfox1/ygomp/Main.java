package io.github.bfox1.ygomp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ygomp_main_menu.fxml"));
        primaryStage.setTitle("Ygo Millennium Puzzle");
        primaryStage.setScene(new Scene(root, 1278, 1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
