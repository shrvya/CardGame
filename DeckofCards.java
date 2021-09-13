package deckofcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//class to create deck of cards
public class DeckofCards {

	String[] SUIT = { "Clubs", "Diamonds", "Hearts", "Spades" };
	ArrayList<String> RANK = new ArrayList<String>(
			Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"));
	static ArrayList<Cards> cards;

	/*
	 * Constructor to construct Deck of cards
	 */
	public DeckofCards() {
		cards = new ArrayList<Cards>(52);
		for (int suits = 0; suits < 3; suits++) {
			for (int rank = 0; rank < 13; rank++) {
				getCards().add(new Cards(SUIT[suits], RANK.get(rank)));

			}
		}
	}

	/*
	 * method to shuffle the cards
	 */
	public void shuffleCards() {
		Collections.shuffle(getCards());
	}

	/*
	 * method to get cards
	 */
	public ArrayList<Cards> getCards() {
		return cards;
	}
	
	 public Cards compare(Cards rank1,Cards rank2) {
	        if(RANK.indexOf(rank1.getRank())<RANK.indexOf(rank2.getRank()))
	            return rank1;   
	        else
	            return rank2;
	       }
}
