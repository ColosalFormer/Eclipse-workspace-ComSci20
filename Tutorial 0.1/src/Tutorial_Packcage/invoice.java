package Tutorial_Packcage;

import java.util.ArrayList;

public class invoice {
	private customer theCustomer;
	private ArrayList<LineItem> items = new ArrayList<>();

	public invoice(customer Customer) {
	this.theCustomer = Customer;	
	}

	public void addToOrder(Product theProduct, int qty) {
		
	
	}
}

