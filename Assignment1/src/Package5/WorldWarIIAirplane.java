// -----------------------------------------------------
// Assignment 1
// Part: 1
// Written by: Andrew Pulsifer 40234525 & Eamon 40233231
// -----------------------------------------------------

/**
 *	Andrew Pulsifer 40234525 & Eamon 40233231
 *	COMP249
 *	Assignment #1
 *	Due Date October 15th 2023
 *
 *	@see Package5
 */
package Package5;

/**
 * Class that returns a WorldWarIIAirplane object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object extends Aircraft class adding twin engine
 * @author Andrew Pulsifer and Eamon 
 */
public class WorldWarIIAirplane extends Aircraft{
	
	private boolean twinEngine;
	private long serialNum;
	static long ww2SNctr = 80000;
	
	//***CONSTRUCTORS***//
	
	/**
	 * Default constructor creates a WorldWarIIAirplane object with default values
	 * Assigns a unique serial number using static counter
	 */
	public WorldWarIIAirplane(){
		twinEngine = false;
		serialNum = ww2SNctr;
		ww2SNctr++;
	}
	
	/**
	 * Parameterized constructor creates a Metro object with input values
	 * Assigns a unique serial number using static counter
	 * 
	 * @param	inPrice	Defines price
	 * @param	inElevation	max elevation
	 * @param	inEngine Defines type of engine
	 */
	public WorldWarIIAirplane(double inPrice, double inElevation, boolean inEngine){
		super(inPrice, inElevation);
		this.twinEngine = inEngine;
		this.serialNum = ww2SNctr;
		ww2SNctr++;
	}
	
	/**
	 * Copy constructor creates a WorldWarIIAirplane object inputs of another object
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 * 
	 * @param inPlane	WorldWarIIAirplane object containing variables to copy 
	 */
	WorldWarIIAirplane(WorldWarIIAirplane inPlane){
		super(inPlane.price, inPlane.maxElevation);
		this.twinEngine = inPlane.twinEngine;
		this.serialNum = ww2SNctr;
		ww2SNctr++;
	}
	//***ACCESSORS AND MUTATORS***//
	
	/**
	 * Mutator method reseting year price was created
	 * @param	inPrice	Input reseting price
	 */
	public void setPrice(double inPrice) {
		this.price = inPrice;
	}
	/**
	 * Accessor method returning price	
	 * @return	price returns price
	*/
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Mutator method reseting maxElevation
	 * @param	inElevation	Input reseting number of wheels	 
	 */
	public void setMaxElevation(double inElevation) {
		this.maxElevation = inElevation;
	}
	/**
	 * Accessor method returning maxElevation
	 * @return	maxElevation	returns  
	*/
	public double getMaxElevation() {
		return this.maxElevation;
	}
	
	/**
	 * Mutator method reseting truth value of twinEngine
	 * @param	inEngine	Input reseting arrival station
	 */
	public void setTwinEngine(boolean inEngine) {
		this.twinEngine = inEngine;
	}
	/**
	 * Accessor method returning serialNum
	 * @return	serialNum	returns serial number of object 
	*/
	public long getSerialNum() {
		return this.serialNum;
	}
		
	//***GET NEXT SERIAL NUMBER METHOD***//
	
	/**
	 * Accessor method returning next serial number of object	
	 * @return	ww2SNctr returns next serial number 
	 */
	public static long getNextSerialNumber() {
		return ww2SNctr;
	}
		
	//***EQUALS() METHOD***//
	
	/**
	 * equals() override method returning whether objects are equal
	 * 
	 * @param	x 		Object input to compare
	 * @return	false	if not equal
	 * @return	true	if equal
	 */
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
	
	/**
	 * toString override method returning all information related to object
	 * 
	 * @return String returns information related to object 
	 */
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
