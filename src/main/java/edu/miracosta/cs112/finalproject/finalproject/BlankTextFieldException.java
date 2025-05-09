package edu.miracosta.cs112.finalproject.finalproject;

public class BlankTextFieldException extends Exception {
    public BlankTextFieldException() {
        super("No info was entered into the text field.");
    }
    public BlankTextFieldException(String message) {
        super(message);
    }
}
