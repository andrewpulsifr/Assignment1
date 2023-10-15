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
 *	@see Package0
 */

package Package0;

/**
 * Class that returns a Transportation object 
 * Object that can be created through a default or copy constructor
 * Object is defined by the serial number 
 * 
 * @author Andrew Pulsifer 40234525 and Eamon Foley 40233231
 */
public class Transportation {
	private long serialNo;
	private static long SNctr = 0;
	
	/**
	 * Default constructor
	 * Assigns serial number using static counter
	 * Increments counter by one to avoid duplicate serial numbers
	 */
	public Transportation() {
		this.serialNo = SNctr++;
	
	}
	
	/**
	 * Copy constructor creates a transportation object inputs of another object
	 * 
	 * @param inTr	WheeledTransport object containing variables to copy 
	 */
	public Transportation(Transportation inTr) {
		this.serialNo = inTr.serialNo;
	}
	
	/**
	 * Accessor method returning serial number of object	
	 * @return	serialNo returns serial number of object
	 */
	public long getSerialNo() {
		return serialNo;
	}
	/**
	 * toString override method returning all information related to object
	 * 
	 * @return String returns information related to object 
	 */
	public String toString() {
		return "This Transportation object — serial #"+serialNo;
	}
	

}
