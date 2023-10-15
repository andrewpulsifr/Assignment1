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
 *	@see Package2
 */

package Package2;
import Package3.Metro;

/**
 * Class that returns a Tram object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object extends metro class adding totatStops and unique serial number
 * @author Andrew Pulsifer 40234525 and Eamon Foley 40233231
 */
public class Tram extends Metro{
		
		protected int totalStops;
		private long serialNum;
		static int SNctr=25000;
		
		/**
		 * Default constructor creates a Tram object with default values
		 * Assigns a unique serial number using static counter
		 */

		Tram(){
			this.totalStops=0;
			this.serialNum= SNctr++;
		}
		
		/**
		 * Parameterized constructor creates a Tram object with input values
		 * Assigns a unique serial number using static counter
		 * 
		 * @param	numWheels	Defines number of wheels 
		 * @param	maxSpeed	Defines the max speed of the transport vehicle 
		 * @param	numVehicles Defines number of vehicles
		 * @param	startStation Defines the station the train departs from 
		 * @param 	destStation	Defines the station the train arrives at
		 * @param	yrCreated	Defines the year created
		 * @param	totalStops	Defines total number of stops
		 */
		public Tram(int numWheels, double maxSpeed, int numVehicles, String startStation,String destStation, int yrCreated,int totalStops ){
			super(numWheels,maxSpeed,numVehicles,startStation,destStation,yrCreated);
			this.totalStops=totalStops;
			this.serialNum= SNctr++;
		}
		/**
		 * Copy constructor creates a MetTramro object inputs of another object
		 * Assigns a unique serial number using static counter
		 * 
		 * @param t1	Tram object containing variables to copy 
		 */	
		Tram(Tram t1){
			super(t1.numWheels,t1.maxSpeed,t1.numVehicles,t1.startStation,t1.destStation,t1.yrCreated);
			this.totalStops=t1.totalStops;
			this.serialNum= SNctr++;
		}
		
		/**
		 * Mutator method reseting totalStops
		 * @param	totalStops	Input reseting total number of stops
		 */
		public void setTotalStops(int totalStops) {
			this.totalStops=totalStops;
		}
		
		/**
		 * Accessor method returning totalStops 
		 * @return	totalStops	returns total number of stops 	 
		*/
		public int getTotalStops() {
			return this.totalStops;
		}
		/**
		 * toString override method returning all information related to object
		 * 
		 * @return String returns information related to object 
		 */
		public String toString() {
			return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
					+ " a maximum speed of "+ maxSpeed+" km/hr. It has "+numVehicles+" vehicles and "
					+ "its starting and destination stations are"+startStation+" and "+destStation
					+". It was created in the year "+yrCreated+" and has "+totalStops+" totals stops.";
						
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
			Tram a = (Tram)x;
			if(a.numWheels == this.numWheels && a.maxSpeed == this.maxSpeed && a.numVehicles == this.numVehicles  
				&& a.startStation == this.startStation && a.destStation == this.destStation && a.yrCreated == this.yrCreated
				&& a.totalStops == this.totalStops) {
				return true;
			}
				return false;

		}
		/**
		 * clone() override method used to invoke polymorphism when using
		 * copy constructor 
		 * 
		 * @return	new Tram(this)		Call to copy constructor 
		 * */
		public Tram clone(){
			return new Tram(this);	// Create and return a new Tram using the copy constructor
		}
			


}

