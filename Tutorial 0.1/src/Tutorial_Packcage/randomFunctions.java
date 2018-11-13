package Tutorial_Packcage;
import java.util.Scanner;

public class randomFunctions {


	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in );//scanner to take words in
		System.out.println("What is your name? ");//creating a prompt for the user to enter in name
		String name = scanWords.nextLine();//declares name variable and stores it 
		name = name.toLowerCase();//makes all letters lower case 
		System.out.println("your name is " + name);//prints out name
			int length = name.length(); // checks the length of the name
		    String scanwords,reverseName = "";
		    for (int i = 0; i < name.length(); i++) { // for loop that puts the name in and reverses it 
		       reverseName = name.charAt(i) + reverseName;// Add each character to the *front*
		    }

		System.out.println("your name backwards is " + reverseName);//prints name out in reverse 
		
		
	}

}//end main
