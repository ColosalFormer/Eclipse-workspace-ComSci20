package Tutorial_Packcage;
import java.util.Scanner; //imports scanner
public class translator_DS5 {
	
	public static void main(String [] args) {//Main method
	int x = 1;//Variables that control loops
	int g = 1;
	do {//Start of do while loop
		String Wakandan[] = {"YIBAMBE","TAKE DOWN ALL DEFENSES","get this man a shield","Do you know the way ","I AM THE BLACK PANTHA","ZOLAL","WAKANDA FOREVER","I am WAKANDAN","WHAT ARE THOSE",
				"DELETE that footage","WHA A U DOIN ","ON YOUR FEET","STAY WITH ME","WHY ARE YOU RUNNING","KINETIC ENERGY"}; //String array for Tachanka
	    String English[] = {"CHARGE","get rid of all those defenses","get Captain America his shield please","where do I go","I am the black panther king of Wakanda","That was great","wakanda is my city forever","I am the king of Wakanda",
	    		"What is that","get rid of that video now","What are you doing","Get up","Don't Die on Me","why are you running away from me","RELEASING MY KINETIC ENERGY"}; //String array for English
	
	
	
	
	System.out.println("Would you like to translate English or Wakandan?"); //question prompt
	Scanner input3 = new Scanner(System.in);// new scanner variable
	String answer2 = input3.nextLine();//input = scanner variables next string input
	if (answer2.equalsIgnoreCase("English")) { //if statement for choosing english
		System.out.println("Terms that can be translated");
		for(int i = 0; i <= English.length - 1;i++) { //for loop for printing out translations
			System.out.println(English[i]); //prints out strings in array
		}//End of for loop
		
		
			System.out.println("Enter something to be translated");
			Scanner input = new Scanner(System.in); //Scanner variable
			String word = input.nextLine();//Takes in new string unput
			for(int i = 0; i <= English.length - 1;i++) {// For loop for finding translation
				if (word.equalsIgnoreCase(English[i])) { //if statement for when the string equals a translation in the array
					System.out.println("Translation to Wakandan: " + Wakandan[i]); //prints it out
					i = 14; //Ends For loop prematurely 
				}//End of if
				else if (i == 14){ //else if for non working words
					System.out.println("I don't think we have a translation for that..."); 
					
				}//End of else if
				else {
					
				}//End of else
			}//End of for loop
			int y = 1; //variable for initializing the upcoming loop
			do { //start of do while
			System.out.println("Would you like to translate again? (Yes or No)"); //question prompt
			Scanner input2 = new Scanner(System.in); //scanner variable 
			String answer = input2.nextLine();// input = next string of scanner variable
			if (answer.equalsIgnoreCase("Yes")) { // if statement for yes
				y = 0; //Cuts off current loop and restarts outer loop
			}
			else if (answer.equalsIgnoreCase("No")) {//else if statement for saying no that ends all loops
				y = 0;//ends all loops
				x = 0;
				g = 0;
			}
			else {//else statement for wrong inputs that makes the question loop again
				System.out.println("Yes or no that cannot be done");
			}
				
			}while (y == 1); //end of do while
			
	}//end of if
	else if (answer2.equalsIgnoreCase("Wakandan")) {//else if for saying Tachanka
		System.out.println("Terms that can be translated");
		for(int i = 0; i <= English.length - 1;i++) { //for loop for printing out translations
			System.out.println(Wakandan[i]); //prints out terms in tachanka array
		}//End of for loop
		
		
			System.out.println("Enter something to be translated");
			Scanner input = new Scanner(System.in); //Scanner variable
			String word = input.nextLine();//Takes in new string unput
			for(int i = 0; i <= English.length - 1;i++) {// For loop for finding translation
				if (word.equalsIgnoreCase(Wakandan[i])) { //if statement for when the string equals a translation in the array
					System.out.println("Translation to English: " + English[i]); //prints it out
					i = 14; //Ends For loop prematurely 
				}//End of if
				else if (i == 14){ //else if for non working words
					System.out.println("I don't think we have a translation for that..."); 
					
				}//End of else if
				else {
					
				}//End of else
			}//End of for loop
			int y = 1;//variable for initializing the upcoming loop
			do {//start of do while
			System.out.println("Would you like to translate again? (Yes or No)");
			Scanner input2 = new Scanner(System.in); //scanner variable 
			String answer = input2.nextLine();// input = next string of scanner variable
			if (answer.equalsIgnoreCase("Yes")) { // if statement for yes
				y = 0; //Cuts off current loop and restarts outer loop
			}
			else if (answer.equalsIgnoreCase("No")) {//else if statement for saying no that ends all loops
				y = 0;//ends all loops
				x = 0;
				g = 0;
			}
			else { //else statement for wrong inputs that makes the question loop again
				System.out.println("Yes or no feller that cannot be done");
			}
				
			}while (y == 1); //end of do while
			
		
	}
	else { // Loops the first question again upon wrong input
		System.out.println("Yes or no my dude, you gotta choose one of them");
	}
	
	}while (g == 1); //end of do while
	}//End of Main

}//Class end
