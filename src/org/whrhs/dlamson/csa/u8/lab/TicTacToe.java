package org.whrhs.dlamson.csa.u8.lab;

import java.util.Scanner;
import java.util.Arrays;
public class TicTacToe {
	// 3 x 3 Grid for playing tic tac toe
		private String[][] grid = {
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
			//System.out.println(symbol);
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
			Scanner scan = new Scanner(System.in);
			int row = -1;
			int column = -1;
			if (symbol.equals("X")){
				System.out.println("Choose a location, row and then column");
				row = scan.nextInt();
				while (row < 0 || row > 2){
					System.out.println("Hey, thats illegal, try again");
					row = scan.nextInt();
				}
				column = scan.nextInt();
				while(column < 0 || column > 2){
					System.out.println("Excuse me, ILLEGAL, try again");
					column = scan.nextInt();
				}
			}
			else if(symbol.equals("O")){
				row = ((int) (Math.random() * 3)) ;
				column = ((int) (Math.random() * 3));		
				//System.out.println(row + " " + column);
			}
			while(grid[column][row].equals("X") || grid[column][row].equals("O")){
			if (symbol.equals("X")){
			System.out.println(" Illegal, choose a location, row and then column");
			row = scan.nextInt();
			while (row < 0 || row > 2){
				System.out.println("Hey, thats illegal, try again");
				row = scan.nextInt();
			}
			column = scan.nextInt();
			while(column < 0 || column > 2){
				System.out.println("Excuse me, ILLEGAL, try again");
				column = scan.nextInt();
			}
			}
			else if(symbol.equals("O")){
				row = ((int) (Math.random() * 3)) ;
				column = ((int) (Math.random() * 3));		
				//System.out.println(row + " " + column);
			}
			
			
			}
			System.out.println(row + " " + column);
			grid[column][row] = symbol;
			printBoard();
			// TODO: Write this method

		}
		
		// Randomly returns whether X (Player) or O (Computer) goes first
		public String determineWhoGoesFirst() {
			int x = (int) (Math.random() * 2);
			if(x == 1){
				return "X";
			}
			else{
				return "O";
			}
			// TODO: Write this method
			//return "";
		}
		
		// Returns true is there is a winner
		public boolean isWinner() {
			// TODO: Write this method
			if ((grid[0][0] + grid[0][1] + grid[0][2]).equals("XXX") ||
				(grid[0][0] + grid[0][1] + grid[0][2]).equals("OOO") ||
				(grid[1][0] + grid[1][1] + grid[1][2]).equals("XXX") ||
				(grid[1][0] + grid[1][1] + grid[1][2]).equals("OOO") ||
				(grid[2][0] + grid[2][1] + grid[2][2]).equals("XXX") ||
				(grid[2][0] + grid[2][1] + grid[2][2]).equals("OOO") ||
				(grid[0][0] + grid[1][0] + grid[2][0]).equals("XXX") ||
				(grid[0][0] + grid[1][0] + grid[2][0]).equals("OOO") ||
				(grid[0][1] + grid[1][1] + grid[2][1]).equals("XXX") ||
				(grid[0][1] + grid[1][1] + grid[2][1]).equals("OOO") ||
				(grid[0][2] + grid[1][2] + grid[2][2]).equals("XXX") ||
				(grid[0][2] + grid[1][2] + grid[2][2]).equals("OOO") ||
				(grid[0][0] + grid[1][1] + grid[2][2]).equals("XXX") ||
				(grid[0][0] + grid[1][1] + grid[2][2]).equals("OOO") ||
				(grid[0][2] + grid[1][1] + grid[2][0]).equals("XXX")){
				return true;
			}
			
			return false;
		}
		
		// Return true if there is a tie
		public boolean isTie() {
			if (!isWinner() && 
			(grid[0][0].equals(("X")) || grid[0][0].equals("O")) &&
			(grid[0][1].equals(("X")) || grid[0][1].equals("O")) &&
			(grid[0][2].equals(("X")) || grid[0][2].equals("O")) &&
			(grid[1][0].equals(("X")) || grid[1][0].equals("O")) &&
			(grid[1][1].equals(("X")) || grid[1][1].equals("O")) && 
			(grid[1][2].equals(("X")) || grid[1][2].equals("O")) &&
			(grid[2][0].equals(("X")) || grid[2][0].equals("O")) &&
			(grid[2][1].equals(("X")) || grid[2][1].equals("O")) &&
			(grid[2][2].equals(("X")) || grid[2][2].equals("O"))
			){
				return true;
			}
			return false;
		}
		
		// print the board in a readable format
		public void printBoard() {
			System.out.println(grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + "\n---------");
			System.out.println(grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + "\n---------");
			System.out.println(grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + "\n---------");

		

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
			//game.playTurn("O");
			
		}
}