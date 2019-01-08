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
	
		public static int player = 1; // Variable for which player
		public static String[][] grid = { // 2d array for tic tac toe grid
				  { "-", "-", "-" },
				  { "-", "-", "-" },
				  { "-", "-", "-" }
				};
		public static boolean wonDiagonal() { // Function for diagonal wins
			// X wins
			if (grid[0][0].equals("X")&&grid[0][1].equals("X")&&grid[0][2].equals("X")|| // Multiple if statements for different setups in the array lists for diagonals ie X--
					grid[1][0].equals("X")&&grid[1][1].equals("X")&&grid[1][2].equals("X")||                                                                             // -X-
					                                                                                                                                                     // --x
					grid[2][0].equals("X")&&grid[2][1].equals("X")&&grid[2][2].equals("X")||                                                                             
					
					grid[0][0].equals("X")&&grid[1][0].equals("X")&&grid[2][0].equals("X")||
					
					grid[0][1].equals("X")&&grid[1][1].equals("X")&&grid[2][1].equals("X")||
					
					grid[0][2].equals("X")&&grid[1][2].equals("X")&&grid[2][2].equals("X")) {
				return true;
				
			}
			// O wins
			else if (grid[0][0].equals("O")&&grid[0][1].equals("O")&&grid[0][2].equals("O")||
					grid[1][0].equals("O")&&grid[1][1].equals("O")&&grid[1][2].equals("O")||
					
					grid[2][0].equals("O")&&grid[2][1].equals("O")&&grid[2][2].equals("O")||
					
					grid[0][0].equals("O")&&grid[1][0].equals("O")&&grid[2][0].equals("O")||
					
					grid[0][1].equals("O")&&grid[1][1].equals("O")&&grid[2][1].equals("O")||
					
					grid[0][2].equals("O")&&grid[1][2].equals("O")&&grid[2][2].equals("O")) {
				return true;
				
			}
			else {
				return false;
			}
		}
		public static boolean wonStraight() { // Function for straight wins
			// X wins
			if (grid[0][0].equals("X")&&grid[0][1].equals("X")&&grid[0][2].equals("X")|| // Multiple if statements for different setups in the array lists for straights ie X--
					grid[1][0].equals("X")&&grid[1][1].equals("X")&&grid[1][2].equals("X")||                                                                             // X--
					                                                                                                                                                     // X-- 
					grid[2][0].equals("X")&&grid[2][1].equals("X")&&grid[2][2].equals("X")||
					
					grid[0][0].equals("X")&&grid[1][0].equals("X")&&grid[2][0].equals("X")||
					
					grid[0][1].equals("X")&&grid[1][1].equals("X")&&grid[2][1].equals("X")||
					
					grid[0][2].equals("X")&&grid[1][2].equals("X")&&grid[2][2].equals("X")) {
				return true;
				
			}
			// O wins
			else if (grid[0][0].equals("O")&&grid[0][1].equals("O")&&grid[0][2].equals("O")||
					grid[1][0].equals("O")&&grid[1][1].equals("O")&&grid[1][2].equals("O")||
					
					grid[2][0].equals("O")&&grid[2][1].equals("O")&&grid[2][2].equals("O")||
					
					grid[0][0].equals("O")&&grid[1][0].equals("O")&&grid[2][0].equals("O")||
					
					grid[0][1].equals("O")&&grid[1][1].equals("O")&&grid[2][1].equals("O")||
					
					grid[0][2].equals("O")&&grid[1][2].equals("O")&&grid[2][2].equals("O")) {
				return true;
				
			}
			else {
				return false;
			}
		}
		public static void calc(int x,int y) { //Calculates which letter to use and if the space is taken
		String playerx = "X"; //Variables for players letter
		String playero = "O";
		int j = 0; // int variable for the while loop
		do { //start of do while
		  if(grid[x][y] == "-") { //if statement if the area selected is empty
		    if (player == 1) { //if statement for player one
			    grid[x][y] = playerx; // replaces area with player letter like ie X
			    j = 1; //Breaks loop
		    }
		    else if (player == 2) { //if else statement for player 2
			    grid[x][y] = playero; // replaces area with player letter like ie O
			    j = 1; //Breaks loop
		    }
		    else {} //else statement
		  }
		  else { //else statement for if a taken space is selected  
		  System.out.println("That's taken"); 
		  System.out.println("Still Player " + player + "'s turn"); //Prints players turn
		  System.out.println(" ");
		  print(); //prints out the tic tac toe grid by calling the print function
	      System.out.println(" ");
	      System.out.println("Enter which Row (1-3)"); // Question prompt
	      Scanner input = new Scanner(System.in); // Takes the input and stores it
	      x = input.nextInt(); // x = input
	      x = x-1; // x - 1 = input for easier usability 
	      System.out.println("Enter which Column(1-3)"); // Question prompt
	      Scanner input2 = new Scanner(System.in); // Takes the input and stores it
	      y = input2.nextInt(); // x = input
	      y = y-1; // x - 1 = input for easier usability
		  }
		}while(j == 0); // end of do while
	}
		public static void print() { //Function that prints out grid
			for (int i = 0; i < grid.length; i++) { //For loops that prints out whole 2d array
			    for (int j = 0; j < grid[i].length; j++) { 
			        System.out.print(grid[i][j] + " ");
			    }
			    System.out.println(" ");
			}
		}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			Welcomeprompt();
		int win = 0; //variable for win condition
	    do { //do while for the game
	        print();
	        System.out.println("Player " + player + "'s turn"); //A series of printlns that give instructions or needed info to the player
	        System.out.println(" ");
	        System.out.println("Enter which Row (1-3)"); //Question prompt
	        Scanner input = new Scanner(System.in); //input variable
	        int row = input.nextInt(); //row variable that equals input
	        System.out.println("Enter which Column (1-3)");
	        Scanner input2 = new Scanner(System.in); //input variable
	        int column = input2.nextInt(); //column variable that equals input
	        calc(row-1,column-1); //calls calculation function to calculate rows and place your symbol on selection
	        
	        
	       
	        if (wonStraight() == true) { //if statement for wining through a straight
	        	win = 1; // breaks while loop
	        }
	        else if (wonDiagonal() == true) { //if statement for wining through a diagonal
	        	win = 1; // breaks while loop
	        }
	        else{ // else for switching the player every turn and continuing the game
	            if(player == 1) { //if statement that passes it to player 2
	             	player = 2; //player is now 2
	            }
	            else if(player == 2) { //if statement that passes it to player 1
	             	player = 1; //player is now 1
	            }
	            else { //else that does nothing
	             	
	            }
	             	
	        	}
	    }while(win == 0);
	    print(); //Prints the grid until someone wins
	    System.out.println("Player " + player + " won!"); //Win message when while loop is broken
	    
	   
	    
	    
	    
		}

	}//end main
