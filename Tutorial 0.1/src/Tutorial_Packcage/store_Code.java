package Tutorial_Packcage;
import java.util.Scanner;


public class store_Code {
	
	//pink dolphin
	//golf wang
	//gucci
	//supreme
	//bape

	public static void main(String[] args) {
		Scanner scanWords = new Scanner(System.in );//scanner to take words in
		Scanner scanNums = new Scanner(System.in);//scanner to take numbers in
		
		double supremePrice = 440.0;
		double bapePrice = 550.0;
		double louisvPrice = 700;
		double gucciPrice = 780.0;
		double balenciagaPrice = 1000;
		double offwhitePrice = 1200;
		double yeezyPrice = 1450;//these are the price points for the different items
		double price = 0; //total price of sale
		final double TAX = 0.05;//tax that needs to be paid
		
		System.out.println("What is your name? ");//creating a prompt for the user to enter in name
		String name = scanWords.nextLine();//declares name variable and stores it 
		
		
		System.out.println("\nWelcome " + name + " to Christian and Scotts Hypebeast Fits where you can get all your hypebeast needs");
		//prints out welcome statement to console 
		
		System.out.println("\nWhat would you like to buy today?\n"//prompts user what they want
				+ "0. Exit\n"
				+ "1. Supreme bogo tee:    440$\n" 
				+ "2. Bape shark hoodie:    550$\n"
				+ "3. Louis V x Supreme collab duffle bag:    700$ \n"
				+ "4. Gucci flip flops:    780$\n"
				+ "5. Balenciaga Triple S sneakers:    1000$\n"
				+ "6. OffWhite x Nike Jordan 1's:    1200$\n"
				+ "7. Yeezy 350 boosts:    1450$\n");
		int itemNum = scanNums.nextInt();//scans what item they want

			while(itemNum != 0) { 	

				System.out.println("How many do you want?: ");
			
			int qty = scanNums.nextInt();//storing how n=much the user wants of the item
				
			if(itemNum == 1) {//if user picks 1, they choose that item
				price = supremePrice * qty;//calculates the total cost 
				System.out.println("You chose to buy a Supreme bogo tee");
			}
			else if(itemNum == 2) {//if user picks 2, they choose that item
				price += bapePrice * qty;//calculates the total cost 
				System.out.println("You chose to buy a Bape shark hoodie");
			}
			else if(itemNum == 3) {//if user picks 3, they choose that item
				price += louisvPrice * qty;//calculates the total cost 
				System.out.println("You chose to buy a Louis V x Supreme collab duffle bag");
			}
			else if(itemNum == 4) {//if user picks 4, they choose that item
				price += gucciPrice * qty;//calculates the total cost 
				System.out.println("You chose to buy Gucci flip flops");
			}
			else if(itemNum == 5) {//if user picks 5, they choose that item
				price += balenciagaPrice * qty;//calculates the total cost 
				System.out.println("You chose to buy Balenciaga Triple S sneakers");
			}
			else if(itemNum == 6) {//if user picks 5, they choose that item
				price += offwhitePrice * qty;//calculates the total cost 
				System.out.println("You chose to buy OffWhite x Nike Jordan 1's");
			}
			else if(itemNum == 7) {//if user picks 5, they choose that item
				price += yeezyPrice * qty;//calculates the total cost 
				System.out.println("You chose to buy Yeezy 350 boosts");
			}
			else {//this runs when the user picks something that is not in the shop
				System.out.println("Sorry we don't got that, come again next time");//prints this to the console
			}
			
			System.out.println("\nWhat would you like to buy today?\n"//prompts user what they want
					+ "0. Exit\n"
					+ "1. Supreme bogo tee:    440$\n" 
					+ "2. Bape shark hoodie:    550$\n"
					+ "3. Louis V x Supreme collab duffle bag:    700$ \n"
					+ "4. Gucci flip flops:    780$\n"
					+ "5. Balenciaga Triple S sneakers:    1000$\n"
					+ "6. OffWhite x Nike Jordan 1's:    1200$\n"
					+ "7. Yeezy 350 boosts:    1450$\n");
			
			itemNum = scanNums.nextInt();//scans what item they want
	}//end while
			
		System.out.println("Your total cost for all of this is: " + price + "$");//tells user the total cost
		System.out.println("tax is: " + price *TAX);
		double totalPrice = price *TAX + price;
		System.out.println("Your total plus tax is: " + totalPrice);
		System.out.println("Thank you for shopping at Hypeabeast Fits!! don't forget to swipe up to get iced up!");//
	}
	

}
