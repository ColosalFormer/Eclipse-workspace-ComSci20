package Tutorial_Packcage;

import java.util.Random;

public class problemSet4 {


public static int factorial(int n) {//factorial function
	int answer = 1; //variable to store 
	for(int i = 1; i <= n; i++) { //for loop that multiplys through by how many times 
		answer = i*answer; //answer is multiplied and 
	}
	return answer;	//return statement

}

public static int yearsTilOneMill (double initialBalance) {
	
	int years = 0; // sets the variable years to 0 value
	while (initialBalance <= 1000000) {
		years++; // adds value to years
		initialBalance += initialBalance * 0.05; // multiplies the initialBalance by 0.05
	}
	
	return years; // returns the value of years
}

public static void monopolyRoll() {
	Random rand = new Random ();
	
	int randNum1 = rand.nextInt(7); // generates a random number
	int randNum2 = rand.nextInt(7); // generates a random number
//	randNum = 2;    for testing 
//	randNum2 = 2;   for testing
	int totalRolled = 0; // declares a variable
	
	while (randNum1 == randNum2) {
		totalRolled = randNum1 + randNum2 + totalRolled;
		randNum1 = rand.nextInt(7); // generates a random number
		randNum2 = rand.nextInt(7); // generates a random number
//		randNum = 3; 
//		randNum2 = 2;
		
	if (randNum1 != randNum2) {
		System.out.println("Since the new generated numbers are not the same, you're good!  The sum is " 
	+ (randNum1 + randNum2 + totalRolled) + "."); // prints out sum to the console
	}

	}
	
	System.out.println("Since the generated numbers are not the same, you're good!  The sum is " 
			+ (randNum1 + randNum2 + totalRolled)+ ".");  // prints out sum to the console
}

	
public static void main(String[] args) {
 
//System.out.println(factorial(5));//prints out the factorial of 5

int n = 10;
while (n < 50) {
	n = n*2;
}
System.out.println(n);

System.out.println(factorial(5)); // calls method

System.out.println(yearsTilOneMill(100)); //calls function to calculate how long it takes for you to earn a million dollars

int rows = 3;
for (int i = 1; i <= rows; i++) {
	String thisRow = "";
	for (int j = 0; j < i; j++) {
		thisRow = thisRow + "#";
	}
	System.out.println(thisRow);
}//end for loop

System.out.println("42 + 7");
System.out.println(42 + 7);
System.out.print("Hello");
System.out.println("World");
	}

}


