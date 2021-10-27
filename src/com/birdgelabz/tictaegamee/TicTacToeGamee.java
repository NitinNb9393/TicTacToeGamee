package com.birdgelabz.tictaegamee;

import java.util.Scanner;

public class TicTacToeGamee {
	public static char[] element;
	static char userMark, computerMark;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Gamee");
		boardCreation();
		choosingXorO();

	}

	public static void boardCreation() {
		element = new char[10];
		for (int i = 1; i < 10; i++) {
			element[i] = ' ';
		}
		System.out.println("Empty board created");
	}

	public static void choosingXorO() {
		System.out.println("Choose 1 for 'X' or Choose 2 for 'O' as your mark");
		int option = scan.nextInt();
		switch (option) {
		case 1:
			userMark = 'X';
			computerMark = 'O';
			break;
		case 2:
			userMark = 'O';
			computerMark = 'X';
			break;
		default:
			System.out.println("Your input is invalid");
			choosingXorO();
		}
	}
}
