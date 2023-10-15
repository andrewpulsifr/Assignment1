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
import Package0.Transportation;
/**
 * Class that returns a Aircraft object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object extends Transportation class adding price and Maximum Elevation
 * 
 * @author Andrew Pulsifer 40234525 and Eamon Foley 40233231
 */
public class Aircraft extends Transportation{
	protected double price;
	protected double maxElevation;
	private long serialNum;
	static long SNctr = 0;
	
	
	//***CONSTRUCTORS***//
	
	/**
	 * Default constructor creates a Aircraft object with default values
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 */
	public Aircraft() {
		this.price = 0;
		this.maxElevation = 0;
		this.serialNum = SNctr;
		SNctr++;	
	}
	
	/**
	 * Parameterized constructor creates a Aircraft object with input values
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 * 
	 * @param	inPrice	Defines price of aircraft
	 * @param	inElevation	Defines max elevation
	 */
	public Aircraft(double inPrice, double inElevation) {
		this.price = inPrice;
		this.maxElevation = inElevation;
		serialNum = SNctr;
		SNctr++;
	}
	/**
	 * Copy constructor creates a Aircraft object inputs of another object
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 * 
	 * @param inObject	Aircraft object containing variables to copy 
	 */
	public Aircraft(Aircraft inObject) {
		this.price = inObject.price;
		this.maxElevation = inObject.maxElevation;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	//***ACCESSORS AND MUTATORS***//
	
	/**
	 * Mutator method reseting price
	 * @param	inPrice	Input reseting number of wheels	 
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
	 * @param	inElevation	Input reseting max elavation 
	 */
	public void setMaxElevation(double inElevation) {
		this.maxElevation = inElevation;
	}
	/**
	 * Accessor method returning maxElevation
	 * @return	maxElevation	returns maximum elevation
	*/
	public double getMaxElevation() {
		return this.maxElevation;
	}
	/**
	 * Accessor method returning objects serialNum
	 * @return	serialNum	returns serial number 
	*/
	public long getSerialNum() {
		return this.serialNum;
	}
	
	//***GET NEXT SERIAL NUMBER METHOD***//
	
	/**
	 * Accessor method returning next serial number of object	
	 * @return	serialNumber+1 returns next serial number 
	 */
	public long getNextSerialNumber() {
		return SNctr + 1;
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
		Aircraft a = (Aircraft)x;
		if(a.price == this.price && a.maxElevation == this.maxElevation) {
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
		return "This Aircraft - Serial #" + this.serialNum + " - has a price of $" + this.price + " and a maximum elevation of " 
				+ this.maxElevation + "m";
	}
}
