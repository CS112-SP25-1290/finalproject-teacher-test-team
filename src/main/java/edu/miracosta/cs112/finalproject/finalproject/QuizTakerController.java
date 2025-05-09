package edu.miracosta.cs112.finalproject.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.InvalidParameterException;

import static edu.miracosta.cs112.finalproject.finalproject.Constants.*;

public class QuizTakerController {
    @FXML
    Label programName;
    @FXML
    Text yourNameText;
    @FXML
    TextField enterName;
    @FXML
    ImageView earthImage;

    public void initialize() {
        programName.setText("World Brain Test");
        yourNameText.setText("Your Name");
        Image image = new Image(EARTH_IMAGE_PATH);
        earthImage.setImage(image);
    }
    public void handleStartQuizButton() throws Exception {
        if(enterName.getText() == null) {
            throw new BlankTextFieldException("ERROR: Please enter your name.");
        }
        else {
            Stage stage = (Stage)programName.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource(INSTRUCTIONS_VIEW_RESOURCE));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle(MAIN_PROGRAM_TITLE);
            stage.show();
        }
    }
}
