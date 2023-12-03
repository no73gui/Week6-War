package com.promineotech.student.war;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Deck {

	
	// declare unpopulated List of type Card called cards for the cards in the Deck.
	private List<Card> cards;
	
	// Deck constructor
	public Deck() {
		// private cards list of Cards is initialized as an empty ArrayList
		// new ArrayList housed in List<Card>
		cards = new ArrayList<>();
		
		for (int i = 2;   i <= 14 ; i++) {
			for (String suit : new String[] {"Hearts" , "Diamonds" , "Clubs" , "Spades"}) {
				cards.add(new Card(i, suit));
			}
			
		}
		
		
	}
	
	public void shuffle() {
		// shuffle (collection of cards)..... List<Card> cards......
		Collections.shuffle(cards);
	}
	
	
	// return Card object from Draw()
	public Card draw() {
		// if cards list is not empty, return card at index 0 (top card)
		if (!cards.isEmpty()) {
			// return the first card of the cards list. 
		return cards.remove(0);
		// else, if the card collection is empty, return null.
		} else {
			// no more Card to return, cards List is empty.
			return null;
		}
	}
}
