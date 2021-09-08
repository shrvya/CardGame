package deckofcards;

/*
 * this class has arrays suit,rank and deck
 * size is the size of deck
 * suit is initialized with  ( "Clubs", "Diamonds", "Hearts", "Spades" )
 * rank is initialized with  ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" )
 * it has a method to initialize the deck of cards and a method to print the deck
 */
public class Cards {

	String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	public int size = rank.length * suit.length;
	String[] deck = new String[size];
	int count = 0;

	/*
	 * method to initialize the array decks with content of rank and suit count will
	 * increment after every initialization
	 */
	public void initialize() {
		for (int k = 0; k < rank.length; k++) {
			for (int j = 0; j < suit.length; j++) {
				deck[count] = rank[k] + " of " + suit[j];
				count++;
			}
		}
	}

	/*
	 * this method will display the deck
	 */
	public void showCard() {
		for (int i = 0; i < size; i++) {
			System.out.println(deck[i]);
		}
	}

}