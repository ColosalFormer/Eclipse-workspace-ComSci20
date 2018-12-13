package Tutorial_Packcage;

public class LineItem {
private int qty;
private Product theProduct;

	//getters
	public int getQty() {
		return qty;
	}
	/**
	 * 
	 * @return 
	 */
	
	public Product getProduct() {
		return theProduct;
	}
	/**
	 * 
	 */
	
	//setters
	public void setProduct() {
		this.theProduct = theProduct;
	}
	/**
	 * 
	 */
	
	public void setQty() {
		this.qty = qty;
	}
	
	public LineItem (Product theProduct,int qty) { 
		this.qty = qty;
		this.theProduct = theProduct;
	}
	
	public String toString() {//accessor/mutator for the product and quantity of that product
		return "Product: " + theProduct + " Quantity: " + qty;
	}

}
