package Tutorial_Packcage;

public class dsAssignment4 {

	public static void main(String[] args) {
		String[] names = {"Chris","Trent","Scott","Ridge","Steve","Christian","Tyson","Bill","Chester","Tyrone",}; //name array for those who are participating 
		
		double[] raisedmoney = {300, 150, 200, 345.60, 20, 190.30, 65.90, 400, 250.50, 600.40}; //money raised 
		
		boolean[] returnedForms = {true,true,false,true,false,false,false,false,true,true}; //boolean array for those who returned forms
		
		for (int i= 0; i < names.length; i++) { //for loop to print everything
			System.out.println("Name: " + names[i] + " $" + raisedmoney[i] + " Form: " + returnedForms[i]);
		}//end for loop
		
		System.out.println("");
		
		double totalAmt = 0;//stores total amount raised 
		for (int i= 0; i < raisedmoney.length; i++) { //for loop to print everything
		totalAmt += raisedmoney[i]; //adds each index to total amount
		}//end for
		
		System.out.println("");
		double avgRaised = totalAmt /names.length;//calculates average amount raised 
		
		int bigMoneyCount = 0; //tracks how many ppl raised over $200
		
		for (int i= 0; i < raisedmoney.length; i++) {//search for greater than 200
			//counting # of ppl over $200
			if(raisedmoney[i] > 200) {
				System.out.println(names[i] + " Raised " + raisedmoney[i]);
				bigMoneyCount++;//add 1 to bigMoneyCount
			}//end if
		}//end for
		
		System.out.println("");
		
		for (int i= 0; i < returnedForms.length; i++) {//search for those who did not return there form
		if(returnedForms[i] == false) {
			System.out.println(names[i] + " have not returned there form");

			}
		}
		System.out.println("");
		System.out.println("Total amount raised: " + totalAmt);
		System.out.println("avg amount raised " + avgRaised);
		
		double lowestAmt;//declare varoable for item tracked
		
		lowestAmt = raisedmoney[0];//assume first index is item searched for
		
		int nameIndex = 0;//tracks index of person with lowest amount raised
		
		for (int i= 0; i < raisedmoney.length; i++) {//find lowest amount raised
			if(raisedmoney[i] < lowestAmt) {
				lowestAmt = raisedmoney[i]; //stores lowest # into variable, set new lowest value 
				nameIndex = i;
			}//end if 
		}//end for 
		System.out.println("");
		System.out.println("Lowest amount raised " + lowestAmt + " by " + names[nameIndex]);
		
	}

}//end main
