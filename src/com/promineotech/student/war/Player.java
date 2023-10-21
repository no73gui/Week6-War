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
	
	public void addToHand(Card card) {
		// add a Card to hand List.	
		hand.add(card);
	}
	
	public List<Card> getHand(){
		// return hand List.
		return hand;
	}
	// Identify Player from main()
	public String getName() {
		return name;
	}
	
	// get player score
	public int getScore() {
		return score;
	}
	
}
