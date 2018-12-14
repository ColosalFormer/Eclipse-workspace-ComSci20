package Tutorial_Packcage;

public class LineItem {
private int qty;
private Product theProduct;
	/**
	 * gets the quantity of the product 
	 * @return qty
	 */
	//getters
	public int getQty() {
		return qty;
	}
	/**
	 * gets the product
	 * @return theProduct
	 */
	
	public Product getProduct() {
		return theProduct;
	}
	/**
	 * sets the product
	 */
	
	//setters
	public void setProduct() {
		this.theProduct = theProduct;
	}
	/**
	 * sets the quantity
	 */
	
	public void setQty() {
		this.qty = qty;
	}
	/**
	 * Constructor for LineItem and fills in the parameters for the variables 
	 * @param theProduct
	 * @param qty
	 */
	public LineItem (Product theProduct,int qty) { 
		this.qty = qty;
		this.theProduct = theProduct;
	}
	/**
	 * prints out the product and quantity 
	 */
	public String toString() {//accessor/mutator for the product and quantity of that product
		return "Product: " + theProduct + " Quantity: " + qty;
	}

}
