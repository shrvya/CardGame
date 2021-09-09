package deckofcards;

import java.util.ArrayList;
import java.util.Arrays;

public class DeckofCards {

	String[] SUIT = { "Clubs", "Diamonds", "Hearts", "Spades" };
	ArrayList<String> RANK = new ArrayList<String>(
			Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));
	ArrayList<Cards> cards = new ArrayList<Cards>(52);

	/*
	 * Constructor to construct Deck of cards
	 */
	public DeckofCards() {
		for (int suits = 0; suits < SUIT.length; suits++)
			for (int rank = 0; rank < RANK.size(); rank++) {
				cards.add(new Cards(SUIT[suits], RANK.get(rank)));

			}
	}

	public static void main(String args[]) {
		DeckofCards deck = new DeckofCards();

	}

}
