package Tutorial_Packcage;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class playTicTacToe {
	
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

	}
		
	   public static void drawBoard(char[][] board) {
		   
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[i].length; j++) {
	                if (j == board[i].length - 1) System.out.print(board[i][j]);
	                else System.out.print( board[i][j] + " | ");
	            }

		            System.out.println();
               System.out.println("--------------");

		             

	        }


	    }
		


	  
	//comment each line of the main method
	   public static void main(String[] args) throws InterruptedException
	   {
		Welcomeprompt();
	  	Scanner in = new Scanner(System.in);
	  	Scanner ScanNum = new Scanner(System.in);
	  	System.out.println("How big of a board would you like to play on?");
	  	System.out.println("enter in a number: ");
	  	int num1 = ScanNum.nextInt();
	  	System.out.println("enter in another number: ");
	  	int num2 = ScanNum.nextInt();
		System.out.println("You chose to play on a " + num1 + " by " + num2 + " board.");
	  	char[][] board = new char[num1][num2];
	  
	 
	  	int player = 2;
	 
	  	drawBoard(board);
	  	//while (!win(board, player))
	  	{
	     	  if (player == 1)
	     	  {
	        	    player = 2;
	     	  }
	     	else
	     	{
	        	  player = 1;
	     	}
	 
	     	System.out.println("Player " + player + " choose a row: ");
	     	int row = in.nextInt();
	   	System.out.println("Player " + player + " choose a column: ");
	     	int column = in.nextInt();

	     	if( player == 1 ) {
//	     		board[row][column] = X;
	     	}
	     	else {
	     		if ( player == 2) {
//		     		board[row][column] = O;
	     		}

	     	}

	     	drawBoard(board);
	  	}//end while

	  	System.out.println("Player " + player + " wins!");
	   }//end main
	}//end class


