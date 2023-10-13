package Package5;
import Package0.Transportation;

public class Aircraft extends Transportation{
	protected double price;
	protected double maxElevation;
	private long serialNum;
	static long SNctr = 0;
	
	
	//***CONSTRUCTORS***//
	
	//default constructor
	public Aircraft() {
		this.price = 0;
		this.maxElevation = 0;
		this.serialNum = SNctr;
		SNctr++;	
	}
	
	//parameterized constructor
	public Aircraft(double inPrice, double inElevation) {
		this.price = inPrice;
		this.maxElevation = inElevation;
		serialNum = SNctr;
		SNctr++;
	}
	//copy constructor
	public Aircraft(Aircraft inObject) {
		this.price = inObject.price;
		this.maxElevation = inObject.maxElevation;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	//***ACCESSORS AND MUTATORS***//
	
	public void setPrice(double inPrice) {
		this.price = inPrice;
	}
	public double getPrice() {
		return this.price;
	}
	
	public void setMaxElevation(double inElevation) {
		this.maxElevation = inElevation;
	}
	public double getMaxElevation() {
		return this.maxElevation;
	}
	
	public long getSerialNum() {
		return this.serialNum;
	}
	
	//***GET NEXT SERIAL NUMBER METHOD***//
	
	public long getNextSerialNumber() {
		return SNctr + 1;
	}
	
	//***EQUALS() METHOD***//
	
	public boolean equals(Object x) {
		if(x == null || x.getClass() != this.getClass()) {
			return false;
		}
		Aircraft a = (Aircraft)x;
		if(a.price == this.price && a.maxElevation == this.maxElevation) {
			return true;
		}
		return false;
	}
	
	//**toSTRING() METHOD***//
	
	public String toString() {
		return "This Aircraft - Serial #" + this.serialNum + " - has a price of $" + this.price + " and a maximum elevation of " 
				+ this.maxElevation + "m";
	}
}
