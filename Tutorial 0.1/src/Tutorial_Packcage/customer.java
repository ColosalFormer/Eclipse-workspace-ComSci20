package Tutorial_Packcage;

public class customer {
private String secretLairLocation;
private String Name;
private double evilFunds;

	public customer(String secretLairLocation, String Name, double evilFunds) {
		this.secretLairLocation = secretLairLocation;
		this.Name = Name;
		this.evilFunds = evilFunds;
	}
	
	public String toString() {
		return "Secret Lair Location: " + secretLairLocation + " Name: " + Name + " Evil Funds: " + evilFunds;
	}
	
	public void addFunds(double addevilFunds) {
		
		evilFunds = addevilFunds + evilFunds;
	}
}
