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
	public List<Cards> getHand() {
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
	DeckofCards deck;
	int noofplayers;

	/*
	 * constructor to initialize the players
	 */
	public Players(int noofplayers) {
		// TODO Auto-generated constructor stub
		this.noofplayers = noofplayers;
		deck = new DeckofCards();
		players = new ArrayList<CardsinHand>(noofplayers);
		for (int i = 0; i < noofplayers; i++)
			players.add(i, new CardsinHand());

	}

	/*
	 * method to sequence the order in which player plays sequence is an arraylist
	 */
	public void orderPlayers() {
		sequence = new ArrayList<Integer>(noofplayers);
		for (int order = 0; order < noofplayers; order++)
			sequence.add(order);
		Collections.shuffle(sequence);
	}

	/*
	 * method distributes cards to players tempCards is an arraylist to hold the
	 * cards for a players random cards are assigned and later that card is removed
	 * so that there is no repetition of cards
	 */
	public void cardDistribution() {
		deck.shuffleCards();
		ArrayList<Cards> tempCards = deck.getCards();
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
	/*
	 * this method is used to how many cards of different types the player has got
	 * cards in players hand are considered variables spade,hearts,diamond,clubs are
	 * used
	 */

	public void verify() {
		for (CardsinHand player : players) {
			List<Cards> verifylist = player.getHand();
			int spade = 0, hearts = 0, diamond = 0, clubs = 0;
			for (Cards playercard : verifylist) {
				String type = playercard.getSuit();
				switch (type) {
				case "Spades":
					spade++;
					break;
				case "Diamonds":
					diamond++;
					break;
				case "Hearts":
					hearts++;
					break;
				case "Clubs":
					clubs++;
					break;
				}
			}
			System.out.println("Player " + (players.indexOf(player) + 1) + " has :");
			System.out.println("Clubs:" + clubs);
			System.out.println("Diamonds:" + diamond);
			System.out.println("Hearts:" + hearts);
			System.out.println("Spades:" + spade);
		}
		System.out.println("------------------------------");
	}

	/*
	 * method to sort cards in increasing of rank compare method of Deckofcards is
	 * used
	 */
	public void sort() {
		// to get each players card
		for (CardsinHand player : players) {
			// hand of the player
			List<Cards> play = player.getHand();
			// to sort the cards
			for (int i = 0; i < play.size(); i++) {
				for (int j = 0; j < play.size() - i - 1; j++) {
					// get the card
					Cards rank1 = play.get(j);
					Cards rank2 = play.get(j + 1);
					// to compare which card has highest rank
					if (deck.compare(rank1, rank2) == rank2) {
						// replace the cards
						play.set(j, rank2);
						play.set(j + 1, rank1);
					}
				}
			}
		}
	}

	/*
	 * method to print every card of player
	 */
	public void print() {
		// to get each player
		for (CardsinHand player : players) {
			System.out.println("------------------------------");
			System.out.println("player:" + (players.indexOf(player) + 1));
			// returns set of cards in players hand
			List<Cards> set = player.getHand();
			// to print each card
			for (Cards index : set)
				System.out.println(index.getRank() + " of " + index.getSuit());

		}
	}

}
