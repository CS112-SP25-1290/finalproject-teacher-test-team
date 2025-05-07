package edu.miracosta.cs112.finalproject.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static edu.miracosta.cs112.finalproject.finalproject.Constants.*;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    Label titleLabel;
    @FXML
    ImageView imageLabel;
    @FXML
    Button takeQuizButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void initialize() {
        titleLabel.setText("World Brain Test");
        Image image = new Image(EARTH_IMAGE_PATH);
        imageLabel.setImage(image);
    }

    @FXML
    public void handleExitButton() {
        System.exit(0);
    }

    @FXML
    public void handleTakeQuizButton() throws IOException {
        Stage stage = (Stage) titleLabel.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(FULL_NAME_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(MAIN_PROGRAM_TITLE);
        stage.show();
    }
}