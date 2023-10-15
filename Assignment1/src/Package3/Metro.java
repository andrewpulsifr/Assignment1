
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
 *	@see Package3
 */

package Package3;
import Package2.Train;

/**
 * Class that returns a Metro object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object extends Train class adding year created and unique serial number
 * @author Andrew Pulsifer 40234525 and Eamon Foley 40233231
 */
public class Metro extends Train{
		
		protected int yrCreated;
		private long serialNum;
		static int SNctr;
		
		/**
		 * Default constructor creates a Metro object with default values
		 * Assigns a unique serial number using static counter
		 */
		public Metro(){
			this.yrCreated=1800;
			this.serialNum= SNctr++;
		}
		/**
		 * Parameterized constructor creates a Metro object with input values
		 * Assigns a unique serial number using static counter
		 * 
		 * @param	numWheels	Defines number of wheels 
		 * @param	maxSpeed	Defines the max speed of the transport vehicle 
		 * @param	numVehicles Defines number of vehicles
		 * @param	startStation Defines the station the train departs from 
		 * @param 	destStation	Defines the station the train arrives at
		 * @param	yrCreated	Defines the year metro was created
		 */
		public Metro(int numWheels, double maxSpeed, int numVehicles, String startStation,String destStation, int yrCreated ){
			super(numWheels,maxSpeed,numVehicles,startStation,destStation);
			this.yrCreated=yrCreated;
			this.serialNum= SNctr++;
		}
		/**
		 * Copy constructor creates a Metro object inputs of another object
		 * Assigns a unique serial number using static counter
		 * 
		 * @param m1	Metro object containing variables to copy 
		 */	
		public Metro(Metro m1 ){
			super(m1.numWheels,m1.maxSpeed,m1.numVehicles,m1.startStation,m1.destStation);
			this.yrCreated=m1.yrCreated;
			this.serialNum= SNctr++;
		}
		
		/**
		 * Mutator method reseting year metro was created
		 * @param	yrCreated	Input reseting arrival station
		 */
		public void setYrCreated(int yrCreated) {
			this.yrCreated=yrCreated;
		}
		
		/**
		 * Accessor method returning yrCreated 
		 * @return	yrCreated	returns year metro was created 	 
		*/
		public int getyrCreated() {
			return this.yrCreated;
		}
		
		/**
		 * toString override method returning all information related to object
		 * 
		 * @return String returns information related to object 
		 */
		public String toString() {
			return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
					+ " a maximum speed of "+ maxSpeed+" km/hr. It has "+numVehicles+" vehicles and "
					+ "its starting and destination stations are "+startStation+" and "+destStation
					+". It was created in the year "+yrCreated;
						
		}
		
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
			Metro a = (Metro)x;
			if(a.numWheels == this.numWheels && a.maxSpeed == this.maxSpeed && a.numVehicles == this.numVehicles  && a.startStation == this.startStation && a.destStation == this.destStation && a.yrCreated == this.yrCreated ) {
				return true;
			}
				return false;

		}
		/**
		 * clone() override method used to invoke polymorphism when using
		 * copy constructor 
		 * 
		 * @return	new Metro(this)		Call to copy constructor 
		 * */
		public Metro clone(){
			return new Metro(this);	// Create and return a new WheeledTransportation using the copy constructor
		}

		/**
		 * Accessor method returning next serial number of object	
		 * @return	serialNumber returns next serial number 
		 */
		public static long getNextSerialNumber() {
			return SNctr;
		}

}
