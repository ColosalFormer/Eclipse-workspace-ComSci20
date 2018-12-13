package Tutorial_Packcage;

import java.util.ArrayList;

public class invoice {
	private customer theCustomer;
	private ArrayList<LineItem> items = new ArrayList<>();

	
	public invoice(customer Customer) {
	this.theCustomer = Customer;	
	}

	public void addToOrder(Product theProduct, int qty) { //function that adds product,qty to the array list 
		LineItem l= new LineItem(theProduct,qty);//creates new line item 
		items.add(l);//adds the new lineitem to the array list
	}//end
	
	public void printInvoice() {
		for(int i = 0; i < items.size(); i++) {//for loop that prints out the arraylists that contain everything 
			System.out.printf(items.get(i) + " total: $%.2f \n" , (items.get(i).getProduct().getPrice() * items.get(i).getQty()));//prints out full price plus tax
			System.out.println("");		
		}//end for 
		
		if(amountDue() <= theCustomer.getEvilFunds()) { //checks if the customer has greater than or equal to the total amount due
			System.out.println("YOUR PURCHASE HAS BEEN APPROVED");
			System.out.println("");
			System.out.println("");
		}
		
		else {
			double deficit = theCustomer.getEvilFunds() - amountDue(); //function that calculates the difference of funds 
			deficit = deficit* -1; //calculation for the amount of money they are short of 
			System.out.println("Your purchase has been denied"); //prints out how much the customers money is short by
			System.out.println("You can not make this purchase");
			System.out.printf(gettheCustomer() + " is short by $%.2f \n" , deficit);
			System.out.println("");
		}
		
	}
	

	public customer gettheCustomer() {
		return theCustomer;
	}
	
	
	public boolean canAfford(customer customer) {
		if (customer.getEvilFunds() >= amountDue()) { //if statement that gets the customers evil funds and compares with the amount due
			return true;
		}
		else {//else if they cannot afford
			return false;
		}
	}
	
	public double amountDue() {
		double amountDue = 0;
		for(int i = 0; i < items.size(); i++) {
			amountDue = amountDue + items.get(i).getProduct().getPrice() * items.get(i).getQty(); //calculates total amount 	
			} 
		
		return amountDue;
				
	}
	
}

