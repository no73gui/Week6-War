package com.promineotech.student.war;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Deck {
	private List<Card> cards;
	
	// Deck constructor
	public Deck() {
		// private cards list of Cards is initialized as an empty ArrayList
		cards = new ArrayList<>();
		
	}
	
	private void initializeDeck() {
		String[] suits = {"Hearts" , "Diamonds" , "Clubs" , "Spades"};
		for (String suit : suits) {
			for(int cardNum = 1 ; cardNum <= 13; cardNum++) {
				cards.add(new Card(cardNum , suit));
			}
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card deal() {
		if (!cards.isEmpty()) {
			// return the first card of the cards list. 
		return cards.remove(0);
		} else {
			// no more Card to return, cards List is empty.
			return null;
		}
	}
}
