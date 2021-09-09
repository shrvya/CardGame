package deckofcards;

import java.util.Scanner;

/*
 * class has method to enter the number of players
 */
public class Players {
	Scanner sc = new Scanner(System.in);

	/*
	 * method to enter the number of players playing the game if number of players
	 * is less than 2 or more than 4 method is called again;
	 */
	public void addPlayer() {
		System.out.println("Enter the number of players ");
		int players = sc.nextInt();
		if (players < 2 || players > 4) {
			System.out.println("Invalid!!!");
			addPlayer();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players players = new Players();
		players.addPlayer();
	}

}
