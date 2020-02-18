package org.whrhs.dlamson.csa.u8.l1;

public class TicTacToe {
	
	// 3 x 3 Grid for playing tic tac toe
	private String[][] grid = new String[3][3];
	
	// play one game of tic-tac-toe
	// POST: Game is completed
	// DO NOT CHANGE THIS METHOD
	public void playGame() {
		String symbol = determineWhoGoesFirst();
		while(!isWinner() && !isTie()) {
			playTurn(symbol);
			symbol = changeSymbol(symbol);
		}
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
		// TODO: Implement
	}
	
	// Randomly returns whether X (Player) or O (Computer) goes first
	public String determineWhoGoesFirst() {
		// TODO: Implement
		return "";
	}
	
	// Returns true is there is a winner
	public boolean isWinner() {
		// TODO: Implement
		return false;
	}
	
	// Return true if there is a tie
	public boolean isTie() {
		// TODO: Implement
		return false;
	}
	
	// print the board in a readable format
	public void printBoard() {
		// TODO: Implement
	}
	
	// Returns the symbol who's turn it is to go next
	// DO NOT CHANGE THIS METHOD
	public String changeSymbol(String symbol) {
		return symbol.equals("X") ? "O":"X";
	}
	
	public static void main(String[] pizza) {
		
		// TODO: run the game here!
		
	}
	
}

