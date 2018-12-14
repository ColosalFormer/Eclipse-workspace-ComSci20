package Tutorial_Packcage;

public class customer {
private String secretLairLocation;
private String Name;
private double evilFunds;

	/**
	 * constructor for the customer
	 * @param secretLairLocation
	 * @param Name
	 * @param evilFunds
	 */
	
	public customer(String secretLairLocation, String Name, double evilFunds) {
		this.secretLairLocation = secretLairLocation; //this function that sets that variable to the other
		this.Name = Name;
		this.evilFunds = evilFunds;
	}
	/**
	 * gets secret lair location
	 * @return sercetLairLocation
	 */
	//getters
	public String getsecretLairLocation() {
		return secretLairLocation;
	}
	/**
	 * gets the name
	 * @return Name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * gets the evil funds of the customer
	 * @return evilFunds
	 */
	public double getEvilFunds() {
		return evilFunds;
	}
	/**
	 * sets the evil funds
	 */
	//setters
	public void setEvilFunds() {
		this.evilFunds = evilFunds;
	}
	/**
	 * sets the name of the customer
	 */
	
	public void setName() {
		this.Name = Name;
	}
	/**
	 * prints out the customer info
	 */
	public String toString() {
		return "Secret Lair Location: " + secretLairLocation + " Evil Funds: " + evilFunds + " Name: " + Name;
	}
	/**
	 *  adds funds to evilfunds
	 * @param addevilFunds - more evil funds being added to the evil funds 
	 */
	public void addFunds(double addevilFunds) {
		
		evilFunds = addevilFunds + evilFunds; 
	}
}
