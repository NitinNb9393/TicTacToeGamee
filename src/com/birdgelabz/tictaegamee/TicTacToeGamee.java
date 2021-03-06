package com.birdgelabz.tictaegamee;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGamee {
	public static char[] element;
	static char userMark, computerMark;
	static Scanner scan = new Scanner(System.in);
	static final Random random = new Random();
	static int userNumber, computerNumber;
	static int turn = 1, flag = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Gamee");
		boardCreation();
		choosingXorO();
		currentBoard();
		userCall();
		userMove();
		tossCoin();
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

	public static void currentBoard() {
		for (int i = 1; i < 10; i++) {
			if (element[i] != 'X' && element[i] != 'O') {
				element[i] = (char) (i + '0');
			}
		}
		displayingBoard();
	}

	public static void displayingBoard() {
		System.out.println("\n  " + element[1] + " | " + element[2] + " | " + element[3] + " ");
		System.out.println(" ----------- ");
		System.out.println("  " + element[4] + " | " + element[5] + " | " + element[6] + " ");
		System.out.println(" ----------- ");
		System.out.println("  " + element[7] + " | " + element[8] + " | " + element[9] + " \n");
	}

	public static void userCall() {
		System.out.println("\nEnter a number from board to make the mark:\n");
		userNumber = scan.nextInt();
		if (userNumber < 1 || userNumber > 9) {
			currentBoard();
			System.out.println("Your input is Invalid");
			userCall();
		}
	}

	public static void userMove() {
		if (element[userNumber] == 'X' || element[userNumber] == 'O') {
			currentBoard();
			System.out.println("Number which is selected is not free");
			userCall();
			userMove();
		} else {
			element[userNumber] = userMark;
			System.out.println(userMark + " user is marked " + userNumber);
		}
	}

	public static void tossCoin() {
		System.out.println("\nMaking a toss to check who plays first\nChoose 1 for Head or 2 for Tail");
		int option = scan.nextInt();
		if (option == 1 || option == 2) {
			int flip = random.nextInt(2) + 1;
			if (flip == 1) {
				System.out.println("\nBy tossing Coin it shows HEAD\n");
			} else {
				System.out.println("\nBy tossing Coin it shows TAIL\n");
			}
			if (flip == option) {
				System.out.println("User will start the game\n");
			} else {
				System.out.println("Computer will start the game\n");
				computerFirstTurn();
			}
		} else {
			System.out.println("\nInvalid input Again");
			tossCoin();
		}
	}

	public static void computerFirstTurn() {
		computerNumber = random.nextInt(9) + 1;
		element[computerNumber] = computerMark;
		System.out.println("Computer choses '" + computerNumber + "' now user turn");
	}
}
