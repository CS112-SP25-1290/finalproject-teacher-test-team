package edu.miracosta.cs112.finalproject.finalproject;

import javafx.scene.image.Image;

public class QuizQuestions {
    //Constant Variables
    public static final String DEFAULT_IMAGE_NAME = "Image";
    public static final String DEFAULT_QUESTION = "What is the program about?";
    public static final String DEFAULT_ANSWER = "E";
    //Instance Variables
    private String imageName;
    private String questionText;
    private String answerText;
    //Full Constructor
    public QuizQuestions(String imageName, String questionText, String answerText) {
        if(!this.setAll(imageName, questionText, answerText)) {
            System.out.println("ERROR: bad data given to full QuizQuestions constructor.");
            System.exit(0);
        }
    }
    //Default Constructor
    public QuizQuestions() {
        this(DEFAULT_IMAGE_NAME, DEFAULT_QUESTION, DEFAULT_ANSWER);
    }
    //Copy Constructor
    public QuizQuestions(QuizQuestions original) {
        if(original != null) {
            this.setAll(original.imageName, original.questionText, original.answerText);
        }
        else {
            System.out.println("ERROR: null data given to copy QuizQuestions constructor.");
            System.exit(0);
        }
    }
    //Mutators or Setters
    public boolean setImageName() {
        if(imageName != null) {
            this.imageName = imageName;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setQuestionText() {
        if(questionText != null) {
            this.questionText = questionText;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean setAnswerText() {
        if(answerText != null) {
            this.answerText = answerText;
            return true;
        }
        else {
            return false;
        }
    }

    public Image getImage() {
        return new Image(this.imageName);
    }
    //Accessors or Getters
    public String getImageName() {
        return this.imageName;
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public String getAnswerText() {
        return this.answerText;
    }
    public boolean setAll(String imageName, String questionText, String answerText)
}
