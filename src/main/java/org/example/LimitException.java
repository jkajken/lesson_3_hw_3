package org.example;

public class LimitException extends Exception {
    private String message ;
    private Double remainingAmount;


    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;


    }
}