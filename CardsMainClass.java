package deckofcards;

import java.util.Scanner;

public class CardsMainClass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of players ");
		int players = sc.nextInt();
		if (players < 2 || players > 4) {
			System.out.println("Invalid!!!");
			players = sc.nextInt();
		}
		Players noplayers = new Players(players);

	}

}
