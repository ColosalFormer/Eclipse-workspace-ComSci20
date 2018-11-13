package Tutorial_Packcage;

public class projectSets2 {




public boolean isPrime(int number){
	boolean Equation = number > number;
	return Equation;
	
}//end prime 

public static double absoluteValue(double Number){//finds absolute value of a number
	if ( Number < 0) {//if the number is negative this makes it turn positive
		return Number * -1;//this is the equation to make the the negative turn positive

	}
	else {//runs when other statement does not meet requirements
		return Number;//returns number as is if the original was still positive
	}

}//end absoluteval

public static double calculateTip(double BillAmount) {
	double TipBill  = BillAmount;

	BillAmount = TipBill * .15;
		
return BillAmount ;
		 
}//end calctip


public static String nametagText(String name) {
String nameText = "Hello my name is: " + name ;
	
return nameText ;	
	
}//end nametagText

public static double fahrenheitToCelsius(double fahrenheit){
	
	return (fahrenheit - 32) * 5/9 ;
	
}//end fahrenheitToCelsius

public static void printTemperature(double fahrenheit){
	
System.out.println(fahrenheitToCelsius(68));
double fahrenheit1 = 68;
System.out.println("F: " + fahrenheit1);
double celsius = (fahrenheit - 32) * 5 / 9;
System.out.println("C: " + celsius);

}//end printTemperature


public static void main(String[] args) {
	
printTemperature(68);



	
//System.out.println(nametagText("christian"));

//calculateTip(67.80);//calling the function
//System.out.println(calculateTip(67.80));//prints out tip


	
}//end main


	
}

