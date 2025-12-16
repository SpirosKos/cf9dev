package gr.aueb.cf.cf9.ch14.bankapp;

public class SsnNotValidException extends Exception{
    public SsnNotValidException(String message) {
        super(message);
    }
}
