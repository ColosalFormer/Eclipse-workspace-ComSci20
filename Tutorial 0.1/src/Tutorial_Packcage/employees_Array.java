package Tutorial_Packcage;

public class employees_Array {

	public static void main(String[] args) {
		String[] employeeName = {"greg","george","jill","john","basil"}; //array for employee name
		int[] wage = {15,16,21,15,22}; //wage array 
		int[] hoursWorked = new int[5];
		
		hoursWorked[0] = 20;
		hoursWorked[1] = 30;
		hoursWorked[2] = 15;
		hoursWorked[3] = 60;
		hoursWorked[4] = 38;
		
		for(int i = 0; i < wage.length; i++) {
			System.out.println("i: " + i + "Name: " + employeeName[i] + " \twage: " + wage[i]);
		}// end for loop
		for(int i = 0; i < wage.length; i++) {//print weeks pay
			System.out.println("Name: " + employeeName[i] + " \tpay: " + wage[i] * hoursWorked[i]);	
		}
		for(int i = 0; i < wage.length; i++) {//linear search for wage over 20$
		if(wage[i] > 20) {
			System.out.println("FIRE name: " + employeeName[i]);
			employeeName[i] = "";
			wage[i] = 0;
			}//end if 
		
		}// end for loop
		for(int i = 0; i < wage.length; i++) {//print new pay and wage
			System.out.println("Name: " + employeeName[i] + " \tpay: " + wage[i] * hoursWorked[i]);	
		}
	
	}

}//end main
