package Tutorial_Packcage;
import java.util.Scanner;
import java.util.Random;

public class guessingGame {
	//globalvariables


	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in );//scanner to take words in
		System.out.println("Hey there, what is your name? ");//creating a prompt for the user to enter in name
		String name = scanWords.nextLine();//declares name variable and stores it 
		System.out.println("\nWelcome " + name + " to the best guessing game ever!"); 
		System.out.println("You must guess a number between 0 to 100, if you guess the number right, you win!");

	

		
		Random rand = new Random();//imports random generator
		int numberGuess = rand.nextInt(101);//stores random number
		int numberOfTries = 0;//stores number of tries 
		Scanner scanGuess = new Scanner(System.in);//scans user guess
		int guess;//creates variable for user guess
		boolean win = false;//creates a variable for when the user wins
		
		while (win == false) {//whlie loop that continues until the user guess the right number
			System.out.println("Guess a number between 1 to 100 ");//creating a prompt for the user to enter in guess
			guess = scanGuess.nextInt();//stores user guess 
			numberOfTries++;//stores number of tries
			
			
			if (guess == numberGuess) {//statement when the user guess is equal to the random number
				win = true;
			}
			
			else if (guess < numberGuess) {//statement when the guess is to low
				System.out.println("Your guess is too low!, guess again");
			}
			
			else if (guess > numberGuess) {//statement when the user guess is to high
				System.out.println("Your guess it too high!, guess again");
			}
		}//end while loop
			
			System.out.println("Congratualtions, You WON!!");//print win message
			System.out.println("The number you had to guess is " + numberGuess);//prints random number that had to be guessed 
			System.out.println("It took you " + numberOfTries + " tries to guess the number.");//prints amount of tries to complete
			
			
	
	}

}//end main


