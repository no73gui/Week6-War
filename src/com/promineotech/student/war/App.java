package com.promineotech.student.war;
public class App {

    public static void main(String[] args) {
        // Instantiate a Deck and two Players
        Deck deck = new Deck();
        Player player1 = new Player("Jeremy");
        Player player2 = new Player("Halie");

        // Shuffle the deck
        deck.shuffle();

        // Draw cards for each player 52 times
        for (int i = 0; i < 52; i++) {
            player1.addToHand(deck.draw());
            player2.addToHand(deck.draw());
        }

        // Compare and increment scores
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.getHand().get(i);
            Card card2 = player2.getHand().get(i);

            System.out.println(player1.getName() + " drew: " + card1);
            System.out.println(player2.getName() + " drew: " + card2);

            // Compare the cards and increment scores
            if (card1.getCardValue() > card2.getCardValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (card1.getCardValue() < card2.getCardValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Current Scores: " + player1.getName() + ": " + player1.getScore() +
                    ", " + player2.getName() + ": " + player2.getScore());
        }

        // Compare final scores
        System.out.println("\nFinal Scores: " + player1.getName() + ": " + player1.getScore() +
                ", " + player2.getName() + ": " + player2.getScore());

        // Determine the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
