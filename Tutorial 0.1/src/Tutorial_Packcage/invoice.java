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
			System.out.println(items.get(i));
		}//end for 
		
		
	}
	public customer theCustomer() {
		return theCustomer;
	}
	
	public Product getPrice() {
		return getPrice();
	}
	
	public boolean canAfford(customer Customer) {
		return true;
	}
	
	public double amountDue() {
		return amountDue();
				
	}
	
}

