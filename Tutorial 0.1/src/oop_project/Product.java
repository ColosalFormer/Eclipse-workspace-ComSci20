package oop_project;

public class Product {
	/**
	 * Constructors for default values of Product
	 * 
	 */
	private String name;
	private double price;
	/**
	 * gets the price
	 * @return price
	 */
	//getters
	public double getPrice() {//returns value of the price variable 
		return price;
	}
	/**
	 * gets the name
	 * @return name
	 */
	
	public String getaName() {//returns value of the name variable 
		return name;
	}
	/**
	 * sets price
	 */
	
	//setters
	public void setPrice() {
		this.price = price;
	}
	/**
	 *  sets the name
	 */
	
	public void setaName() {
		this.name = name;
	}
	/**
	 * @param name - name of the product
	 * @param price - price of the product
	 */
	
	public Product(String name,double price) {//sets value for each given parameters
		this.name = name;
		this.price = price;
	}
	
	/**
	 * prints out product info
	 */
	public String toString() {//prints out name and price of product
		return "name: " + name + " price: " + price;
	}
	
}//end main
