package Tutorial_Packcage;

import java.util.ArrayList;

public class invoice {
	
	private customer theCustomer;
	private ArrayList<LineItem> items = new ArrayList<>(); //creates an array list for the items 
	/**
	 * Constructor for invoice 
	 * @param Customer - customer which the invoice is for
	 */
	
	public invoice(customer Customer) {
	this.theCustomer = Customer;	
	}//end invoice
	/**
	 * adds to order of the customer
	 * @param theProduct - product of choice to add to order
	 * @param qty - amount of the product being ordered
	 */
	public void addToOrder(Product theProduct, int qty) { //function that adds product,qty to the array list 
		LineItem l= new LineItem(theProduct,qty);//creates new line item 
		items.add(l);//adds the new lineitem to the array list
	}//end addToOrder
	/**
	 * prints the invoice of the customer 
	 */
	public void printInvoice() {
		for(int i = 0; i < items.size(); i++) {//for loop that prints out the arraylists that contain everything 
			System.out.printf(items.get(i) + " total: $%.2f \n" , (items.get(i).getProduct().getPrice() * items.get(i).getQty()));//prints out full price plus tax
			System.out.println("");		
		}//end for 
		
		if(amountDue() <= theCustomer.getEvilFunds()) { //checks if the customer has greater than or equal to the total amount due
			System.out.println("YOUR PURCHASE HAS BEEN APPROVED");
			System.out.println("");
			System.out.println("");
		}//end if
		
		else {
			double deficit = theCustomer.getEvilFunds() - amountDue(); //function that calculates the difference of funds 
			deficit = deficit* -1; //calculation for the amount of money they are short of 
			System.out.println("Your purchase has been denied"); //prints out how much the customers money is short by
			System.out.println("You can not make this purchase");
			System.out.printf(gettheCustomer() + " is short by $%.2f \n" , deficit);
			System.out.println("");
		}//end else
		
	}//end printInvoice
	
	/**
	 * gets the customer
	 * @return theCustomer
	 */
	public customer gettheCustomer() {
		return theCustomer;
	}//end gettheCustomer
	
	/**
	 * checks if the customer can afford all the products ordered
	 * @param customer
	 * @return true - if can afford, false - if they cannot
	 */
	public boolean canAfford(customer customer) {
		if (customer.getEvilFunds() >= amountDue()) { //if statement that gets the customers evil funds and compares with the amount due
			return true;
		}//end if
		else {//else if they cannot afford
			return false;
		}//end else
	}//end canAfford
	/**
	 * total amount due for the order
	 * @return amountDue
	 */
	public double amountDue() {
		double amountDue = 0;
		for(int i = 0; i < items.size(); i++) {
			amountDue = amountDue + items.get(i).getProduct().getPrice() * items.get(i).getQty(); //calculates total amount 	
			} //end for
		
		return amountDue;
				
	}//end amountDue
	
}//end main

