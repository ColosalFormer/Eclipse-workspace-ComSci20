package Tutorial_Packcage;

import java.util.Random;
import java.util.Scanner;


public class Tut1 {
	
	private static Scanner scan;
	
	
	/**
	 * it calculates circumference given a radius 
	 * @param radius - a double that represents the radius 
	 * @return - the circumference of a circle 
	 */
	
	
	public static double circumference(double radius) {//header or signature
		
		double circumference = 2 * Math.PI * radius;
		
		return circumference;
		
	}			 
	
	
	public static void printName() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Christian Boiiii");

		}

	}

	public static void main(String[] args) {
		
		int  varNum1; 
		varNum1 = 13;
		int varNum2 = 26;
		int varNum3;
		varNum3 = varNum1 + varNum2;
		
		System.out.println(varNum3);
		System.out.println(varNum2);
		System.out.println(varNum1);
	
		printName();
		
		if(varNum3 > 5) {
			System.out.println("greater");
			
		       }
		else
			System.out.println("less");
		
					String indata;
		
					Scanner scan = new Scanner(System.in);
					
					System.out.println("Enter the data");
					indata = scan.nextLine();
					
					System.out.println("You entered: " + indata );
					
					
					int num;
					int square;
					System.out.println("Enter in an integer:");
					num = scan.nextInt();
					square = num + num ; // compute the square
					
					System.out.println("The square of " + num + " is " + square);
					
					
					Random rand = new Random();
					
					int randomNum = rand.nextInt(11) + 5;
					
					System.out.println(randomNum);
					
					
					double register = 10.0;
					register = register + 5; //Customer pays $5.
					register = register - 2.5; //Customer receives $2.50 as change.
					register = register + 10; //Customer pays $10.
					register = register - 3; //Customer receives $3 as change.
					System.out.println(register);

					int bankBalance = 500;
					bankBalance = bankBalance + 250;//user deposits $250 to there bank account
					bankBalance = bankBalance - 100;//user withdraws $100 from there bank account 
					System.out.println("Your balance is: " + bankBalance);
					
					System.out.println(2.0 * (5 / 2));
					
					int day = 6;
					String month = "June";
					System.out.println("The day I was born is: " + month + " " + day );
					
					String firstName = "Christian";
					String lastName = "Icuspit";
					String fullName = firstName + " " + lastName;
					
					System.out.println("Hello, my name is " + fullName);
					
					System.out.println( "There are " + fullName.length() + " letters in my name." );
					
					
					
					
					System.out.println("Enter in a fahrenheit: ");
					
					Scanner input = new Scanner(System.in);
					
					double fahrenheit = input.nextDouble();
					
					double Celsius = (fahrenheit - 32) * (5.0 / 9);
					
					System.out.println(fahrenheit + " fahrenheit converted to Celsius is: " + Celsius);

					
					boolean canSeePlayer = true;
					boolean playerPowerUp = false;
					
					if (canSeePlayer == true ){
						if (playerPowerUp == false ) {
							System.out.println("Attack!");

						} else if (canSeePlayer == true)
							 if(playerPowerUp == true){
								System.out.println("Run away!");
						}
						} else {
							System.out.println("Wander.");
						}
		
					boolean isSnowing = false;// a boolean variable if it is either snowing or not 
					boolean isRaining = false;// a boolean variable if it is either raining or not
					double temperature = 100.0; //creates a double variable for different temperatures
					
					if (isSnowing == true || isRaining == true || temperature < 50.0) {// finds out if it is snowing,raining, or the temperature is below 50
							System.out.println("lets stay home!"); //prints if above statements are true
						} 
					else //else statement runs when if statements 
						System.out.println("Lets go out!");

						
	
					
					int time = 6;// creates integer variable for the time of day
					String timeOfDay;//string variable for what the time of day is
					
					if (time >= 5 && time < 12){//prints day if the time of day is greater than or equal to or less than 12
						timeOfDay = "morning";
						
					}else  if (time >= 12 && time < 20){// function that prints daytime of the time of day is around 12 or less than 20
						timeOfDay = "Daytime";
					}
					else 
						timeOfDay = "Night";// prints night when other statements aren't true
					
					System.out.println(timeOfDay);//prints the time of day into the console
					
					
					int dayOfTheWeek = 7;//creates a integer variable for the days of the week 
					boolean holiday = true;//creates boolean variable if the weekday is a holiday
					String Weekday;//creates string variable to find out the weekday
					
					if (dayOfTheWeek <= 5 && holiday == false) {//finds out if it is a weekday and not a holiday
						Weekday = "Wake up 7:00";//if the statement is true, this prints out to the console 
					
					}else  if (dayOfTheWeek > 5 && holiday == true ) {//finds out if it is the weekend and a holiday
						Weekday = "Sleep in!!";//if statement is true, this prints to the console
					}
					else//this runs when other statements are not true
						Weekday = "what to do what to do";//prints to the console
					
					System.out.println(Weekday);// prints out the weekday to the console and if we either wake up or sleep in
					

					
		
		double r = 4.6;
		double c = circumference(r);
		
		System.out.println("circumference is: " + c);	
		
		
	}//end main 
	}


