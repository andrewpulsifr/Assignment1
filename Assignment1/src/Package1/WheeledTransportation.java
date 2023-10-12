// -----------------------------------------------------
// Assignment 1
// Part: 1
// Written by: Andrew Pulsifer 40234525 & Eamon INPUT REST and copy to other classes
// -----------------------------------------------------


package Package1;

/**
 * Class that returns a wheeled transportation object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object is defined by the number of wheels it has, its max speed and serial number
 * 
 * @author Andrew Pulsifer & Eamon 
 */
public class WheeledTransportation{
	
		protected int numWheels;
		protected double maxSpeed;
		private long serialNum;
		static long SNctr =10000;
		
		/**
		 * Default constructor creates a wheeled transport object with default values
		 * Assigns serial number using static counter
		 * Increments counter by one to avoid duplicate serial numbers
		 */
		public WheeledTransportation(){
			this.numWheels = 0;
			this.maxSpeed =0;
			this.serialNum= SNctr++;
		}
		/**
		 * Parameterized constructor creates a wheeled transport object with input values
		 * Assigns serial number using static counter
		 * Increments counter by one to avoid duplicate serial numbers
		 * 
		 * @param	numWheels	Defines number of wheels 
		 * @param	maxSpeed	Defines the max speed of the transport vehicle 
		 */
		public WheeledTransportation(int numWheels, double maxSpeed){
			this.numWheels = numWheels;
			this.maxSpeed= maxSpeed;
			this.serialNum= SNctr++;
		}
		
		/**
		 * Copy constructor creates a wheeled transport object inputs of another object
		 * Assigns serial number using static counter
		 * Increments counter by one to avoid duplicate serial numbers
		 * 
		 * @param w1	WheeledTransport object containing variables to copy 
		 */
		public WheeledTransportation(WheeledTransportation w1){
			this.numWheels = w1.numWheels;
			this.maxSpeed= w1.maxSpeed;
			this.serialNum= SNctr++;
		}
		/**
		 * Mutator method reseting number of wheels
		 * @param	numWheels	Input reseting number of wheels	 
		 */
		public void setNumWheels(int numWheels) {
			this.numWheels=numWheels;
		}
		/**
		 * Mutator method reseting max speed	
		 * @param	maxSpeed	Input reseting max speed	 
		*/
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed=maxSpeed;
		}
		/**
		 * Accessor method returning max speed	
		 * @return	numWheels	returns number of wheels of object	 
		*/
		public int getNumWheels() {
			return numWheels;
		}
		/**
		 * Accessor method returning max speed
		 * 	
		 * @return	maxSpeed	returns max speed of object
		 */
		public double getMaxSpeed() {
			return maxSpeed;
		}
		
		/**
		 * Accessor method returning serial number of object	
		 * @return	serialNumber returns serial number of object
		 */
		public long getSerialNum() {
			return serialNum;
		}
		/**
		 * toString override method returning all information related to object
		 * 
		 * @return String returns information related to object 
		 */
		public String toString() {
			return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
					+ "a maximum speed of"+ maxSpeed+" km/hr.";
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
			WheeledTransportation a = (WheeledTransportation)x;
			if(a.numWheels == this.numWheels && a.maxSpeed == this.maxSpeed ) {
				return true;
			}
				return false;

		}
		/**
		 * clone() override method used to invoke polymorphism when using
		 * copy constructor 
		 * 
		 * @return	new WheeledTransportation(this)		Call to copy constructor 
		 * */
		public WheeledTransportation clone(){
			return new WheeledTransportation(this);	// Create and return a new WheeledTransportation using the copy constructor
		}

			
			
}