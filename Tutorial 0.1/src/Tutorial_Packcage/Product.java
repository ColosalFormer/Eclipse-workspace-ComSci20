package Tutorial_Packcage;

public class Product {
	private String name;
	private double price;
	
	//getters
	public double getPrice() {
		return price;
	}
	
	public String getaName() {
		return name;
	}
	
	//setters
	public void setPrice() {
		this.price = price;
	}
	
	public void setaName() {
		this.name = name;
	}
	
	public Product(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "name: " + name + " price: " + price;
	}
}
