package Tutorial_Packcage;

public class Product {
	private String name;
	private double price;
	/**
	 * Constructors for default values of Product
	 * 
	 */
	//getters
	public double getPrice() {//returns value of the price variable 
		return price;
	}
	/**
	 * prints product information
	 * 
	 */
	
	public String getaName() {//returns value of the name variable 
		return name;
	}
	
	//setters
	public void setPrice() {
		this.price = price;
	}
	
	public void setaName() {
		this.name = name;
	}
	
	public Product(String name,double price) {//sets value for each given parameters
		this.name = name;
		this.price = price;
	}
	/**
	 * @param name - name of the product
	 * @param price - price of the product
	 */
	
	public String toString() {
		return "name: " + name + " price: " + price;
	}
}
