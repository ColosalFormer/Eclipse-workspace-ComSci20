package Tutorial_Packcage;
import java.util.Scanner;


public class store_Code3 {
	//global variables
	static double price = 0; //total price of sale
	static final double TAX = 0.05;//tax that needs to be paid
	static int totalQty = 0;//counter - accumulator
	static int SupQty = 0; 
	static int BapeQty = 0;
	static int LouisQty = 0;
	static int GucciQty = 0;
	static int BalenciQty = 0;
	static int OffWhiteQty = 0;
	static int YeezyQty = 0;       //global variables for the quantity of products
	
	 
	public static void menu() {
		Scanner scanWords = new Scanner(System.in );//scanner to take words in
		Scanner scanNums = new Scanner(System.in);//scanner to take numbers in
		Scanner scanAnswer = new Scanner(System.in);
		
		double supremePrice = 440.0;
		double bapePrice = 550.0;
		double louisvPrice = 700;
		double gucciPrice = 780.0;
		double balenciagaPrice = 1000;
		double offwhitePrice = 1200;
		double yeezyPrice = 1450;//these are the price points for the different items

		int itemNum;//gobal variable for item number

		
		System.out.println("What is your name? ");//creating a prompt for the user to enter in name
		String name = scanWords.nextLine();//declares name variable and stores it 
		
		
		System.out.println("\nWelcome " + name + " to Christian and Scotts Hypebeast Fits where you can get all your hypebeast needs");
		//prints out welcome statement to console 
		do {
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

				
		if(itemNum != 0) {
			System.out.println("How many do you want?: ");//prompts user on how much of the item they would like

		
		int qty = scanNums.nextInt();//storing how n=much the user wants of the item
			totalQty += qty;
			
			if(itemNum == 1) {//if user picks 1, they choose that item
				price += calcCost(supremePrice, qty);//calculates the total cost 
				SupQty += qty;
				System.out.println("You chose to buy " + SupQty + " Supreme bogo tee");
			}
			else if(itemNum == 2) {//if user picks 2, they choose that item
				price += calcCost(bapePrice, qty);//calculates the total cost 
				BapeQty += qty;
				System.out.println("You chose to buy " + BapeQty + " Bape shark hoodie");
			}
			else if(itemNum == 3) {//if user picks 3, they choose that item
				price += calcCost(louisvPrice, qty);//calculates the total cost
				LouisQty += qty;
				System.out.println("You chose to buy " + LouisQty + " Louis V x Supreme collab duffle bag");
			}
			else if(itemNum == 4) {//if user picks 4, they choose that item
				price += calcCost(gucciPrice, qty);//calculates the total cost 
				GucciQty += qty;
				System.out.println("You chose to buy " + GucciQty + " Gucci flip flops");
			}
			else if(itemNum == 5) {//if user picks 5, they choose that item
				price += calcCost(balenciagaPrice, qty);//calculates the total cost 
				BalenciQty += qty;
				System.out.println("You chose to buy " + BalenciQty + " Balenciaga Triple S sneakers");
			}
			else if(itemNum == 6) {//if user picks 5, they choose that item
				price += offwhitePrice * qty;//calculates the total cost 
				OffWhiteQty += qty;
				System.out.println("You chose to buy " + OffWhiteQty + " OffWhite x Nike Jordan 1's");
			}
			else if(itemNum == 7) {//if user picks 5, they choose that item
				price += calcCost(yeezyPrice, qty);//calculates the total cost 
				YeezyQty += qty;
				System.out.println("You chose to buy " + YeezyQty + " Yeezy 350 boosts");
			}
			else {//this runs when the user picks something that is not in the shop
				System.out.println("Sorry we don't got that, come again next time");//prints this to the console
			}
		}//end if (itemNum != 0)
	}while(itemNum != 0);//end of do/while
			
	printSummary();
	
	}//end menu 

	public static double calcCost(double itemPrice, int qty) {
		return itemPrice * qty;
	}//end calcCost
	
	public static double calcTax(double TAX, double price) {
		return TAX * price;
	}//end calcTAX
	
	public static void printSummary() {
		System.out.println("Total items sold: " + totalQty); //prints out total items sold
		
		System.out.println("Your total cost for all of this is: " + price + "$");//tells user the total cost
		System.out.printf("tax is: %.2f \n" , calcTax(TAX,price));//prints out tax
		double totalPrice = calcTax(TAX,price) + price;//adds tax to price
		System.out.printf("Your total plus tax is: %.2f $\n", totalPrice);//prints out full price plus tax
		System.out.println("Thank you for shopping at Hypeabeast Fits!! don't forget to swipe up to get iced up!");//thank you message
		
	}//end printSummary

	
	public static void main(String[] args) {
	menu();//calls the function 
	}//end main
	

}
