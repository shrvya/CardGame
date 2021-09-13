package deckofcards;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Random;

class CardsinHand {
	ArrayList<Cards> hand;

	/*
	 * constructor to assign cards for players
	 */
	CardsinHand() {
		hand = new ArrayList<Cards>(9);
	}

	/*
	 * gets the value in hand
	 */
	public ArrayList<Cards> getHand() {
		return this.hand;
	}

	/*
	 * set the value of hand
	 */
	public void setHand(Cards a) {
		this.hand.add(a);
	}
}

/*
 * class has method to enter the number of players
 */
public class Players {
	ArrayList<Integer> sequence;
	ArrayList<CardsinHand> players;
	int noofplayers;

	/*
	 * constructor to initialize the players
	 */
	public Players(int noofplayers) {
		// TODO Auto-generated constructor stub
		this.noofplayers = noofplayers;
		DeckofCards deck = new DeckofCards();
		ArrayList<CardsinHand> players = new ArrayList<CardsinHand>(noofplayers);
		for (int i = 0; i < noofplayers; i++)
			players.add(i, new CardsinHand());

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

	/*
	 * method distributes cards to players tempCards is an arraylist to hold the
	 * cards for a players random cards are assigned and later that card is removed
	 * so that there is no repetion of cards
	 */
	public void cardDistribution() {
		ArrayList<Cards> tempCards = DeckofCards.getCards();
		Random random = new Random();
		for (int cardcount = 0; cardcount < 9; cardcount++) {
			for (int playernum = 0; playernum < noofplayers; playernum++) {
				CardsinHand playerHand = players.get(sequence.get(playernum));
				int x = random.nextInt(tempCards.size());
				playerHand.setHand(tempCards.get(x));
				tempCards.remove(x);
			}
		}
	}

}
