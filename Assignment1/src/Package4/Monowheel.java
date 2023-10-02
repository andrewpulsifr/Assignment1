package Package4;
import Package1.WheeledTransportation;

/**
 * Class that returns a Monowheel object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object extends wheeled transportation class adding maximum weight and unique serial number
 * 
 * @author Andrew Pulsifer & Eamon 
 */
public class Monowheel extends WheeledTransportation {

	private double maxWeight;
	private long serialNum;
	static long SNctr = 55000;
	
	
	/**
	 * Default constructor creates a Monowheel object with default values
	 * Assigns unique serial number using static counter
	 */
	Monowheel(){
		maxWeight=0;
		this.serialNum= SNctr++;
	}
	/**
	 * Parameterized constructor creates a Monowheel object with input values
	 * Calls constructor from parent
	 * Assigns unique serial number using static counter	
	 * 
	 * @param	numWheels	Defines number of wheels 
	 * @param	maxSpeed	Defines the max speed of the transport vehicle 
	 * @param	maxWeight	Defines the maximum weight a monowheel object can hold
	 */
	Monowheel(int numWheels, double maxSpeed, double maxWegith){
		super(numWheels, maxSpeed);
		this.serialNum= SNctr++;
	}
	/**
	 * Copy constructor creates a wheeled transport object inputs of another object
	 * Assigns unique serial number using static counter	
	 * 
	 * @param m1	Monowheel object containing variables to copy 
	 */
	Monowheel(Monowheel m1){
		super(m1.numWheels,m1.maxSpeed);
		this.maxWeight=m1.maxWeight;
		this.serialNum= SNctr++;
	}
	
	/**
	 * Mutator method reseting maxWeight
	 * @param	numWheels	Input reseting maximum monowheel weight 
	 */
	public void setMaxWeight(int maxWeight) {
		this.maxWeight=maxWeight;
	}
	/**
	 * Accessor method returning max weight
	 * @return	numWheels	returns number of wheels of object	 
	*/
	public double getMaxWeight() {
		return maxWeight;
	}
	
	/**
	 * toString override method returning all information related to object
	 * 
	 * @return String returns information related to object 
	 */
	public String toString() {
		return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
				+ "a maximum speed of"+ maxSpeed +". The max weight of this monowheel equals "+maxWeight;
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
		Monowheel a = (Monowheel)x;
		if(a.numWheels == this.numWheels && a.maxSpeed == this.maxSpeed && a.maxWeight == this.maxWeight ) {
			return true;
		}
			return false;

	}
	
	/**
	 * clone() override method used to invoke polymorphism when using
	 * copy constructor 
	 * 
	 * @return	new Monowheel(this)		Call to copy constructor 
	 * */
	public Monowheel clone()
	{
		return new Monowheel(this);	// Create and return a new Monowheel using the copy constructor
	}
}
