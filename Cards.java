package deckofcards;

/*
 * this class has arrays suit,rank and deck
 * size is the size of deck
 * arrays suit and rank are initialized
 * it has a method to initialize the deck of cards and a method to print the deck
 */
public class Cards {

	private String suit;
	private String rank;

	/**
	 * Constructor of class Cards with parameters rank and suit this creates card
	 * with suit and rank
	 */
	public Cards(String suit, String rank) {
		// TODO Auto-generated constructor stub
		this.suit = suit;
		this.rank = rank;
	}

	/*
	 * getter method to get cards the rank
	 */
	public String getRank() {
		return this.rank;
	}

	/*
	 * getter method to get cards the suit
	 */
	public String getSuit() {
		return this.suit;
	}

}