package org.whrhs.dlamson.csa.u8.l1;

import java.util.Scanner;

public class TicTacToe {
	
	// 3 x 3 Grid for playing tic tac toe
	private String[][] grid = new String[3][3];
	private String[][] gridAlternate = {
			{" ", " ", " "},
			{" ", " ", " "},
			{" ", " ", " "}
	};
	
	private Scanner scan = new Scanner(System.in);
	
	// play one game of tic-tac-toe
	// POST: Game is completed
	// DO NOT CHANGE THIS METHOD
	public void playGame() {
		printBoard();
		String symbol = determineWhoGoesFirst();
		while(!isWinner() && !isTie()) {
			playTurn(symbol);
			symbol = changeSymbol(symbol);
		}
		symbol = changeSymbol(symbol);
		if(isWinner()) {
			System.out.println(symbol + " won the game!");
		}
		else {
			System.out.println("Tie game");
		}
	}
	
	// if computer is playing ("O") - pick random square
	// if person is playing ("X")  - select square to mark
	// POST: Grid is updated to include symbol in chosen square
	public void playTurn(String symbol) {
		// TODO: Write this method

	}
	
	// Randomly returns whether X (Player) or O (Computer) goes first
	public String determineWhoGoesFirst() {
		// TODO: Write this method
		return "";
	}
	
	// Returns true is there is a winner
	public boolean isWinner() {
		// TODO: Write this method
		return false;
	}
	
	// Return true if there is a tie
	public boolean isTie() {
		// TODO: write this method
		return false;
	}
	
	// print the board in a readable format
	public void printBoard() {
		// TODO: Write this method
	}
	
	// Returns the symbol who's turn it is to go next
	// DO NOT CHANGE THIS METHOD
	public String changeSymbol(String symbol) {
		return symbol.equals("X") ? "O":"X";
	}
	
	public static void main(String[] pizza) {
		// Create an instance of the TicTacToe Class
		TicTacToe game = new TicTacToe();
		// call the playGame() method on it
		game.playGame();
	}
	
}


