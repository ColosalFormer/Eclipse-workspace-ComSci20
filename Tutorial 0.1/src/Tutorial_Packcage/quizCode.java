package Tutorial_Packcage;

public class quizCode {


public static int factorial(int n) {//factorial function
	int answer = 1; //variable to store 
	for(int i = 1; i <= n; i++) { //for loop that multiplys through by how many times 
		answer = i*answer; //answer is multiplied and 
	}
	return answer;	//return statement

}

public static void isSingleDigit(int x) {
	boolean singledigit; //creates boolean variable 
	int num1 = 1; //int varaible for number 1 
	int num2 = 100; //int variable for number 100
	if (x == 1) { //if statement to check if the x int value typed in is 1
		singledigit = true; //if it is a single digit number typed in. it prints true
		System.out.println(true);//print function
	}
	else { //if it is a triple digit number then this runs
		System.out.println(false); //print function 
	}

}//end isSingleDigit

public static void smallest(int x, int y, int z) {
	int smallestnum = 0; //int variable to store the smallest number 
	if( x<y && x<z ) { //if statement to check if x is the smallest number
	 smallestnum = x; //stores x value into smallsetnum variable if it is the smallest  
	 System.out.println("The smallest amongst the integers is " + x); //print
	}
	else if ( y<x && y<z ) { //else if statement if int y is less than x and z 
	 smallestnum = y;//stores y value into smallestnum variable if it is the smallest number 
	 System.out.println("The smallest amongst the integers is " + y);
	}
	else { //else statement when z is the smallest number
	 smallestnum = z; //stores z as the smallest number into the variable 
	 System.out.println("The smallest amongst the integers is " + z); //print function
	}
}//end smallest
	
public static void main(String[] args) {
 
System.out.println(factorial(5));//prints out the factorial of 5

 
smallest(50,20,30); //calls function and prompts user to put in three random numbers to compare the smallest 

	}

}
