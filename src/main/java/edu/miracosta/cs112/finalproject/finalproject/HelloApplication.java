package edu.miracosta.cs112.finalproject.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static edu.miracosta.cs112.finalproject.finalproject.Constants.INTRO_VIEW_RESOURCE;
import static edu.miracosta.cs112.finalproject.finalproject.Constants.MAIN_PROGRAM_TITLE;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(INTRO_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle(MAIN_PROGRAM_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}