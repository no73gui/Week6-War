package com.promineotech.student.war;
import java.util.*;
public class Player extends App{
	
	private String name;
	private int score;
	private List<Card> hand;
	
	// Constructor for Player
	public Player(String name) {
		this.name = name;
		this.score = 0;
		// new empty AL is instantiated for each new Player
		this.hand = new ArrayList<>();
	}

	
	public void describe() {
		System.out.println(name + "'s hand : ");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	
	public Card flip() {
		return hand.remove(0);
	}
	
	
	public void draw(Deck deck) {
		
		Card card = deck.draw();
		hand.add(card);
	}


	public void addToHand(Card card) {
		// TODO Auto-generated method stub
		hand.add(card);
	}
	
	public List<Card> getHand(){
		return hand;
		
	}
	
	public int getScore() {
		return score;
	}
	
	
	public void incrementScore() {
		score++;
	}
	
	public String getName() {
		return name;
	}
	
	
}
