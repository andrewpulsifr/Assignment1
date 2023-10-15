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
 *	@see Package6
 */
package Package6;
import Package0.Transportation;

/**
 * Class that returns a Ferry object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object extends Transportation class adding maxSpeed and maxLoad
 * 
 * @author Andrew Pulsifer 40234525 and Eamon Foley 40233231
 */
public class Ferry extends Transportation{
	private double maxSpeed;
	private double maxLoad;
	private long serialNum;
	static long SNctr = 70000;
	
	//***CONSTRUCTORS***//
	
	/**
	 * Default constructor creates a Ferry object with default values
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 */
	public Ferry(){
		this.maxSpeed = 0;
		this.maxLoad = 0;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	/**
	 * Parameterized constructor creates a Ferry object with input values
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 * 
	 * @param	inSpeed	Defines speed
	 * @param	inLoad	Defines load capacity
	 */
	public Ferry(double inSpeed, double inLoad){
		this.maxSpeed = inSpeed;
		this.maxLoad = inLoad;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	/**
	 * Copy constructor creates a Ferry object inputs of another object
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 * 
	 * @param inObject	Ferry object containing variables to copy 
	 */
	public Ferry(Ferry inObject){
		this.maxSpeed = inObject.maxSpeed;
		this.maxLoad = inObject.maxLoad;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	//***ACCESSORS AND MUTATORS***//
	
	/**
	 * Mutator method reseting price
	 * @param	inSpeed	Input reseting speed 
	 */
	public void setMaxSpeed(double inSpeed) {
		this.maxSpeed = inSpeed;
	}
	
	/**
	 * Accessor method returning maxSpeed	
	 * @return	price returns maximum speed
	*/
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	/**
	 * Mutator method reseting price
	 * @param	inLoad	Input reseting max load
	 */
	public void setMaxLoad(double inLoad) {
		this.maxLoad = inLoad;
	}
	
	/**
	 * Accessor method returning maxLoad	
	 * @return	price returns maximum load
	*/
	public double getMaxLoad() {
		return this.maxLoad;
	}
	
	/**
	 * Accessor method returning serialNum	
	 * @return	price returns serial number
	*/
	public long getSeriallNum() {
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
		Ferry a = (Ferry)x;
		if(a.maxSpeed == this.maxSpeed && a.maxLoad == this.maxLoad) {
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
		return "This Ferry - Serial #" + this.serialNum + " - has a maximum speed of " + this.maxSpeed + " km/h and a maximum load of " 
				+ this.maxLoad + "kg";
		}

}
