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
			System.out.println(items.get(i) + "Your total plus tax is: %.2f $\n" + getProduct);//prints out full price plus tax

		}//end for 
		
		
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
			amountDue = amountDue + items.get(i).getProduct().getPrice() * items.get(i).getQty();		
			} 
		
		return amountDue;
				
	}
	
}

