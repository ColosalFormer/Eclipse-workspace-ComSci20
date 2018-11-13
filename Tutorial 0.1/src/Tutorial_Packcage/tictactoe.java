package Tutorial_Packcage;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class tictactoe {
	public static void Welcomeprompt() throws InterruptedException {
		String welcome = "Welcome to TIC TAC TOE ";
		System.out.println(welcome);
		TimeUnit.MILLISECONDS.sleep(50);

		Scanner scanplayer = new Scanner(System.in );//scanner to take words in
		Scanner scanplayer2 = new Scanner(System.in );//scanner to take words in
		System.out.println("What is your name Player 1: ");
		String player1 = scanplayer.nextLine();
		System.out.println("What is your name Player 2: ");
		String player2 = scanplayer2.nextLine();
		TimeUnit.MILLISECONDS.sleep(50);
		System.out.println("Welcome " + player1 + " and " + player2 + " to TIC TAC TOE ");
		System.out.println("You each will have infinite turns until one of you gets four in a row!");
		TimeUnit.MILLISECONDS.sleep(50);
		System.out.println("Here is your board");
			
}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Welcomeprompt();
		// TODO Auto-generated method stub
		//take input player
		//place the token
		//switch players
		//find out if a spot is taken
		//have restart/play again function
		//have a winner/loser 
		
		String[] grid = new String[3];//single dimension array 
		grid[0] = "-";
		grid[1] = "-";
		grid[2] = "-";
		
		String[][] board = new String[3][3]; //creates 2d array 3 rows 3 coloms
		board[0][0] = "-";
		board[0][1] = "-";
		board[0][2] = "-";

//		for(int i = 0; i < grid.length; i++) {
//			System.out.println(grid[1]);
//		}//end for loop to print rows 
		
for(int row = 0; row < board.length; row++) {//prints down rows
		
			for(int col = 0; col < board[row].length; col++) {//prints coloms 
				board[row][col] = " - ";
		}
}//end for 
		

		//fill and print 2d array

//board[3][3] = " X ";	
		
for(int row = 0; row < board.length; row++) {//prints down rows
		
	for(int col = 0; col < board[row].length; col++) {//prints coloms 


		System.out.print(board[row][col]); 
		TimeUnit.MILLISECONDS.sleep(50);
			}
			
			System.out.println();//prints new line after the row is done 
		}//end for 	
	}
	int player = 1;

	int Player = 2;
}
