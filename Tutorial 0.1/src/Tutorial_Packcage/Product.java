package Tutorial_Packcage;

public class Product {
	private String name;
	private double price;
	
	public Product(String name,double price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "name: " + name + " price: " + price;
	}
}
