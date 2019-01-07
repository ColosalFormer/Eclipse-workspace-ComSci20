package Tutorial_Packcage;
import java.util.Scanner;


public class store_Code4_Array {
	//global variables
	static double price = 0; //total price of sale
	static final double TAX = 0.05;//tax that needs to be paid
	static int totalQty = 0;//counter - accumulator
	static String[] productArray = {"Supreme hoodie", "Bape hoodie", "Louis V bag", "Gucci flip flops", "Balenciaga shoes", "Off-White belt",
			"Yeezy 350 V2", "Nike AirMax", "Adidas NMD", "Nike Vapormax"};//array for different products
	
	static double[] priceArray = { 1000.0, 1500.50, 2500.0, 1250.50, 2550.50, 3500.0, 1200.0, 230.0, 250.50, 400.0 }; //array for the prices of the items 
	static int[] quantity = new int [10];
	
	
	 
	public static void menu() {
		Scanner scanWords = new Scanner(System.in );//scanner to take words in
		Scanner scanNums = new Scanner(System.in);//scanner to take numbers in
		Scanner scanAnswer = new Scanner(System.in);
		
		int itemNum;//gobal variable for item number

		
		System.out.println("What is your name? ");//creating a prompt for the user to enter in name
		String name = scanWords.nextLine();//declares name variable and stores it 
		
		
		System.out.println("\nWelcome " + name + " to Christian and Scotts Hypebeast Fits where you can get all your hypebeast needs");
		//prints out welcome statement to console 
		System.out.println("\nWhat would you like to buy today?\n");//prompts user what they want
		public static void list() { //Function for the list
			for (int i = 0; i <= productArray.length - 1;i++) { //For loop for listing out every arrayed variable
		    
				System.out.println(i+1 + "." + productArray[i] + " " + priceArray[i] + "$"); //Prints out product name	
				}
				
			

			
				itemNum = scanNums.nextInt();//scans what item they want

				
		if(itemNum != 0) {
			System.out.println("How many do you want?: ");//prompts user on how much of the item they would like

		
		int qty = scanNums.nextInt();//storing how n=much the user wants of the item
			totalQty += qty;
			
			if(itemNum == 1) {//if user picks 1, they choose that item
				price += calcCost(priceArray[itemNum - 1], qty);//calculates the total cost 
				quantity[itemNum-1] += qty;
				System.out.println("You chose to buy " + quantity[0] + " Supreme bogo tee");
			}
			else if(itemNum == 2) {//if user picks 2, they choose that item
				price += calcCost(priceArray[itemNum - 1], qty);//calculates the total cost 
				quantity[itemNum-1] += qty;
				System.out.println("You chose to buy " + quantity[0] + " Bape shark hoodie");
			}
			else if(itemNum == 3) {//if user picks 3, they choose that item
				quantity[itemNum-1] += qty;
				price += calcCost(priceArray[itemNum - 1], qty);//calculates the total cost

				System.out.println("You chose to buy " + quantity[] + " Louis V x Supreme collab duffle bag");
			}
			else if(itemNum == 4) {//if user picks 4, they choose that item
				quantity[itemNum-1] += qty;
				price += calcCost(priceArray[itemNum - 1], qty);//calculates the total cost 

				System.out.println("You chose to buy " + quantity[] + " Gucci flip flops");
			}
			else if(itemNum == 5) {//if user picks 5, they choose that item
				quantity[itemNum-1] += qty;
				price += calcCost(priceArray[itemNum - 1], qty);//calculates the total cost 

				System.out.println("You chose to buy " + BalenciQty + " Balenciaga Triple S sneakers");
			}
			else if(itemNum == 6) {//if user picks 5, they choose that item
				quantity[itemNum-1] += qty;
				price += calcCost(priceArray[itemNum - 1], qty);//calculates the total cost 
		
				System.out.println("You chose to buy " + OffWhiteQty + " OffWhite x Nike Jordan 1's");
			}
			else if(itemNum == 7) {//if user picks 5, they choose that item
				quantity[itemNum-1] += qty;
				price += calcCost(priceArray[itemNum - 1], qty);//calculates the total cost 
			
				System.out.println("You chose to buy " + YeezyQty + " Yeezy 350 boosts");
			}
			else {//this runs when the user picks something that is not in the shop
				System.out.println("Sorry we don't got that, come again next time");//prints this to the console
			}
			quantity[itemNum-1] += qty;
		}//end if (itemNum != 0)
	}while(itemNum != 0);//end of do/while
			
	printSummary();
	
	}//end menu 

	public static double calcCost(double priceArray2, int qty) {
		return priceArray2 * qty;
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
