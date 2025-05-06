package edu.miracosta.cs112.finalproject.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    Label titleLabel;
    @FXML
    ImageView imageLabel;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void initialize() {
        titleLabel.setText("World Brain Test");
        Image image = new Image(REDSUMMER_IMAGE_PATH);
        imageLabel.setImage(image);
    @FXML
    public void handleTakeQuizButton(ActionEvent event) {
        Stage stage = (Stage)titleLabel.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("full-name-view"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("World Brain Test");
        stage.show();
    }
    @FXML
    public void handleExitButton() {
        System.exit(0);
    }
}