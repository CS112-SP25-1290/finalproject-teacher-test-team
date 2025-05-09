//UML and Wireframe Link: https://docs.google.com/presentation/d/10_Xnzbg1E8QiCMgOdU1wT2dW8AVvZGlc1dPDdKulsDM/edit?usp=sharing

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
    Label programName;
    @FXML
    ImageView earthImage;

    public void initialize() {
        programName.setText("World Brain Test");
        Image image = new Image(EARTH_IMAGE_PATH);
        earthImage.setImage(image);
    }

    @FXML
    public void handleExitButton() {
        System.exit(0);
    }

    @FXML
    public void handleTakeQuizButton() throws IOException {
        Stage stage = (Stage) programName.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(YOUR_NAME_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(MAIN_PROGRAM_TITLE);
        stage.show();
    }
}