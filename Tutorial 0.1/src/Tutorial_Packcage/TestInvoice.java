package Tutorial_Packcage;

public class TestInvoice {

	public static void main(String[] args) {
		
		//invoice run 1
		customer c = new customer("island", "Dr evil", 15200.0);
		invoice in = new invoice(c);
		in.addToOrder(new Product("flame Thower",123.80), 3);
		in.addToOrder(new Product("sharks", 105.2),2);
		in.addToOrder(new Product("lasers",50.5),20);
		

		runInvoice(c,in); //runs invoice
		
		//invoice run 2
		customer c2 = new customer("Headquarters", "Joker", 15000.0);
		invoice in2 = new invoice(c2);
		in2.addToOrder(new Product("BANG gun",534.90), 2);
		in2.addToOrder(new Product("Razor sharp playing cards", 16.80), 50);
		in2.addToOrder(new Product("Harpoon gun",450.50),4);
		in2.addToOrder(new Product("Crowbar",48.5),20);
		in2.addToOrder(new Product("Acid Flower",78.5),30);

		runInvoice(c2,in2); //runs invoice

		//invoice run 3
		customer c3 = new customer("Space", "Thanos", 56000000000.0);
		invoice in3 = new invoice(c3);
		in3.addToOrder(new Product("Infinity gauntlet", 340000.50),1);
		in3.addToOrder(new Product("Time Gem",565000.00),1);
		in3.addToOrder(new Product("Power Gem",455000.00),1);
		in3.addToOrder(new Product("Soul Gem",707000.00),1);
		in3.addToOrder(new Product("Space Gem",690000.00),1);
		in3.addToOrder(new Product("Reality Gem",890000.00),1);
		in3.addToOrder(new Product("Mind Gem",690000.00),1);
		
		runInvoice(c3,in3); //runs invoice

		//invoice run 4
		customer c4 = new customer("Camp", "Deathstroke", 5700.0);
		invoice in4 = new invoice(c4);
		in4.addToOrder(new Product("Sniper Rifle", 3400.50),1);
		in4.addToOrder(new Product("EMP Grenade",23.00),60);
		in4.addToOrder(new Product("Sword",4500.00),3);
		in4.addToOrder(new Product("Blue Laser",39.50),6);
		in4.addToOrder(new Product("Line Launcher",670.90),8);
		
		
		runInvoice(c4,in4); //runs invoice

	}//end main
	
	//do not modify code below
	/**
	 *  prints out the invoice of the customer
	 * @param c
	 * @param i
	 */
	public static void runInvoice(customer c, invoice i) {
		i.printInvoice();

		if(c.getEvilFunds()- i.amountDue() < 0) {
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getEvilFunds());
			System.out.println("New funds total: " + c.getEvilFunds());
i.printInvoice();
		}
				
	}//end runInvoice


}//end TestInvoice

	


