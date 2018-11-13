package Tutorial_Packcage;
import java.util.Scanner;



public class ceasar_cypher {


	  public static String encryption(String plainText, int shiftValue) {//new signature for encryption function
		    char ch; // creates char variable for ch
		    String encrypt = new String(); // creates new string for encrypt variable
		    for(int i = 0; i < plainText.length(); ++i){ //grabs each letter from message
		      ch = plainText.charAt(i); //ch variable = to normal message
		      if(ch >= 'a' && ch <= 'z'){ //checks for lowercase letters
		        ch = (char)(ch + shiftValue); // adds shift value to message
		      if(ch > 'z'){ //checks if lowrcase letter is greater than z
		        ch = (char) ((char)(ch - 'z' + 'a' - 1)% 26); // takes letters and adds mod 26 to keep as letters
		      }
		      encrypt += ch;
		      }
		      else if(ch >= 'A' && ch <= 'Z'){//checks upper case letters
		      ch = (char)(ch + shiftValue); //adds shift value to message
		        if(ch > 'Z'){ //checks for upper case letters that are greater than Z
		          ch = (char) ((char)(ch - 'Z' + 'A' - 1)% 26);//adds mod 26 to keep as letters
		        }
		      encrypt += ch;
		      }
		      else { //else statement when other statements aren't met
		        encrypt += ch;
		      }
		    }
		    return encrypt;
		  }//end main encryption function

		  public static String decryption(String encryptedText, int shiftValue) { //new signature for decryption function
		    char ch; //char variable for ch
		    String decrypt = new String();//creates string variable for decrypt
		    for(int i = 0; i < encryptedText.length(); ++i){//for loop that takes in each individual letter
		      ch = encryptedText.charAt(i); //grabs encrypted text and stores it in ch variable
		      if(ch >= 'a' && ch <= 'z'){//checks for lowercase letters
		        ch = (char)(ch - shiftValue); //subtracts shift value from message
		        if(ch > 'z'){//checks if letters are greater than z
		          ch = (char)((char)(ch + 'z' - 'a' + 1) % 26); //gets letters and adds mod 26
		        }
		        decrypt += ch;
		      }
		      else if(ch >= 'A' && ch <= 'Z'){ //checks if message has capital letters
		        ch = (char)(ch - shiftValue); // takes each character and subtracts shift value
		        if(ch > 'Z'){ //checks if captial letter is greater than Z
		          ch = (char)((char)(ch + 'Z' - 'A' + 1) % 26); //gets letters and adds mod 26 to bring back to normal
		        }
		        decrypt += ch;
		      }
		      else {//else statement when other statements aren't met
		        decrypt += ch; 
		      }
		    }
		    return decrypt; //return 
		  }//end decrypt function

		  public static void main(String[] args) {
		    Scanner scanWords = new Scanner(System.in);//scanner to take words in
		    System.out.print("Enter in a message:");//creating a prompt for the user to enter in name
		    String message = scanWords.nextLine();//declares name variable and stores it
		    System.out.println("You typed in: " + message );

		    Scanner scanValue = new Scanner(System.in ); //scanner to take in shift value
		    System.out.print("Enter in value:"); //prompts user to enter in a shift value
		    int Value = scanValue.nextInt(); //scans shift value
		    System.out.println("\nYou made the message shift " + Value+ " times."); //prints message
		    
		    String encryptMessage = encryption(message, Value); //calls encryption and encrypts message entered
		    System.out.println("\nEncrypted message: " + encryptMessage); //print out message
		    String decryptedMessage = decryption(encryptMessage, Value); // calls decryption function and decrypts encrypted message
		    System.out.println("\nDecrypted message: " + decryptedMessage); //prints message
		    

		} 

	}//end 

