package Tutorial_Packcage;
import java.util.Random;
public class projectSets {

public static int randomNumGenerator() {
	Random randomInt = new Random(); //creates random number generator	
	int DiceRoll = randomInt.nextInt(7) + 1; //range for numbers to generate
	return DiceRoll; 
}//end random number generator 


public static int monopolyRoll() {

	int randnumber = randomNumGenerator(); //randnumber variable that stores the value from randNum
	System.out.println("dice roll one is " + randnumber);
	int randnumber2 = randomNumGenerator(); //randnumber variable that stores the value from randNum
	System.out.println("dice roll two is " + randnumber2);
	int totalSum = (randnumber + randnumber2);
	if (randnumber != randnumber2) {
		System.out.println("The sum of these two numbers added is " + totalSum);
	}
	else if (randnumber == randnumber2) {
	int randnum1 = randomNumGenerator(); //randnumber variable that stores the value from randNum
	System.out.println("dice roll 1 is " + randnum1);
	int randnum2 = randomNumGenerator(); //randnumber variable that stores the value from randNum
	System.out.println("dice roll 2 is " + randnum2);
	int randnum3 = randomNumGenerator(); //randnumber variable that stores the value from randNum
	System.out.println("dice roll 3 is " + randnum3);
	int randnum4 = randomNumGenerator(); //randnumber variable that stores the value from randNum
	System.out.println("dice roll 4 is " + randnum4);

	int total = (randnum1 + randnum2 + randnum3 + randnum4); //adds all random numbers 
		System.out.println("The total for all dice rolls added is " + total); //prints total for all dice rolls
		
	}
	return totalSum; 
	
}//end monopolyRoll


public static void main(String[] args) {

	monopolyRoll(); //calls function 

	
	
	}
}//end main 
