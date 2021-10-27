package com.birdgelabz.tictaegamee;

public class TicTacToeGamee {
	public static char[] element;

	public static void main(String[] args) {
		boardCreation();
		System.out.println("Welcome to the Tic Tac Toe Gamee");
	}

	public static void boardCreation() {
		element = new char[10];
		for (int i = 1; i < 10; i++) {
			element[i] = ' ';
		}
		System.out.println("Empty board created");
	}
}
