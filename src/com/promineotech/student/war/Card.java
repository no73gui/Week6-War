package com.promineotech.student.war;

public class Card {

    // Instance variables with camelCase naming convention
    private String suit;
    private int cardNumber;

    // Constructor
    public Card(int number, String suit) {
        this.cardNumber = number;
        this.suit = suit;
    }

    // Method to describe the card
    public void describe() {
        System.out.println(suit);
    }

    // Getter for card value
    public int getCardValue() {
        return cardNumber;
    }

    // Override toString for better string representation
    @Override
    public String toString() {
        return cardNumber + " of " + suit;
    }
}
