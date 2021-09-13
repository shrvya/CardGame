package deckofcards;

import java.util.ArrayList;

import java.util.Collections;

class CardsinHand {
	/*
	 * constructor to assign cards for players
	 */
	CardsinHand() {
		ArrayList<DeckofCards> hand = new ArrayList<DeckofCards>(9);
	}
}

/*
 * class has method to enter the number of players
 */
public class Players {

	int noofplayers;

	/*
	 * constructor to initialize the players
	 */
	public Players(int noofplayers) {
		// TODO Auto-generated constructor stub
		this.noofplayers = noofplayers;
		DeckofCards deck = new DeckofCards();
		ArrayList<CardsinHand> hand = new ArrayList<CardsinHand>();

	}

	/*
	 * method to sequence the order in which player plays sequence is an arraylist
	 */
	public void orderPlayers(int noofplayers) {
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		for (int order = 0; order < noofplayers; order++)
			sequence.add(order);
		Collections.shuffle(sequence);
	}

}
