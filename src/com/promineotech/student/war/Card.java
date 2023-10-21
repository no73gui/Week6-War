package com.promineotech.student.war;

public class Card {
	
	// declare instance variables. Each instance will be different number or suit.
	private String suit;
	private int cardNum;
	
	public Card(Integer num, String suit) {
		this.cardNum = num;
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	// override the default Object method to return the string using this classes variables as part of the return.
	@Override
	public String toString() {
		return cardNum + " of " + suit;
	}

}
