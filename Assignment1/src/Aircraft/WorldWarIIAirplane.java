package Aircraft;

public class WorldWarIIAirplane extends Aircraft{
	
	private boolean twinEngine;
	static long ww2SNctr = 80000;
	private long serialNum;
	
	//***CONSTRUCTORS***//
	
	//default constructor
	WorldWarIIAirplane(){
		twinEngine = false;
		serialNum = ww2SNctr;
		ww2SNctr++;
	}
	
	//parameterized constructor
	WorldWarIIAirplane(double inPrice, double inElevation, boolean inEngine){
		super(inPrice, inElevation);
		this.twinEngine = inEngine;
		this.serialNum = ww2SNctr;
		ww2SNctr++;
	}
	
	//copy constructor
	WorldWarIIAirplane(WorldWarIIAirplane inPlane){
		super(inPlane.price, inPlane.maxElevation);
		this.twinEngine = inPlane.twinEngine;
		this.serialNum = ww2SNctr;
		ww2SNctr++;
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
		
	public void setTwinEngine(boolean inEngine) {
		this.twinEngine = inEngine;
	}
		
	public long getSerialNum() {
		return this.serialNum;
	}
		
	//***GET NEXT SERIAL NUMBER METHOD***//
		
	public long getNextSerialNumber() {
		return ww2SNctr + 1;
	}
		
	//***EQUALS() METHOD***//
		
	public boolean equals(Object x) {
		if(x == null || x.getClass() != this.getClass()) {
			return false;
		}
		WorldWarIIAirplane a = (WorldWarIIAirplane)x;
		if(a.price == this.price && a.maxElevation == this.maxElevation && this.twinEngine == a.twinEngine) {
			return true;
		}
		return false;
	}
		
	//**toSTRING() METHOD***//
		
	public String toString() {
		if(this.twinEngine == true) {
			return "This Twin Engine World War II Airplane - Serial #" + this.serialNum + " - has a price of $" + this.price + " and a maximum elevation of " 
				+ this.maxElevation + "m";
		}
		else {
			return "This Single Engine World War II Airplane - Serial #" + this.serialNum + " - has a price of $" + this.price + " and a maximum elevation of " 
					+ this.maxElevation + "m";
		}
		
	}

}
