package Tutorial_Packcage;

public class problemSet4 {


public static int factorial(int n) {//factorial function
	int answer = 1; //variable to store 
	for(int i = 1; i <= n; i++) { //for loop that multiplys through by how many times 
		answer = i*answer; //answer is multiplied and 
	}
	return answer;	//return statement

}


	
public static void main(String[] args) {
 
//System.out.println(factorial(5));//prints out the factorial of 5

int n = 10;
while (n < 50) {
	n = n*2;
}
System.out.println(n);

	}

}


