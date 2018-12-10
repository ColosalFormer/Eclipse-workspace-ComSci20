package Tutorial_Packcage;

public class LineItem {
private int qty;
private Product theProduct;

public LineItem (Product theProduct,int qty) { 
	this.qty = qty;
	this.theProduct = theProduct;
}

public String toString() {//accessor/mutator for the product and quantity of that product
	return "Product: " + theProduct + " Quantity: " + qty;
}

}
