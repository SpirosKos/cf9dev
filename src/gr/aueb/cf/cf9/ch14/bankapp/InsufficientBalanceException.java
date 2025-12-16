package gr.aueb.cf.cf9.ch14.bankapp;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
