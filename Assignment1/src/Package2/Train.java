package Package2;
import Package1.WheeledTransportation;

/**
 * Class that returns a Train object 
 * Object that can be created through a default, parameterized or copy constructor
 * Object extends wheeled transport class adding numVehicles, startStation & destStation
 * @author Andrew Pulsifer & Eamon 
 */
public class Train extends WheeledTransportation{
	
	protected int numVehicles;
	protected String startStation;
	protected  String destStation;
	
	/**
	 * Default constructor creates a Train object with default values
	 * Assigns serial number when wheeled transport is called
	 */
	public Train(){
		this.numWheels = 0;
		this.startStation ="empty";
		this.destStation= "empty";
	}
	
	/**
	 * Parameterized constructor creates a Train object with input values
	 * Assigns serial number when wheeled transport is called
	 * 
	 * @param	numWheels	Defines number of wheels 
	 * @param	maxSpeed	Defines the max speed of the transport vehicle 
	 * @param	numVehicles Defines number of vehicles
	 * @param	startStation Defines the station the train departs from 
	 * @param 	destStation	Defines the station the train arrives at
	 */
	public Train(int numWheels, double maxSpeed, int numVehicles, String startStation,String destStation){
		super(numWheels,maxSpeed);
		this.destStation= destStation;
		this.startStation= startStation;
		
		
	}
	/**
	 * Copy constructor creates a Train object inputs of another object
	 * Assigns serial number when wheeled transport is called
	 * 
	 * @param t1	Train object containing variables to copy 
	 */	
	public Train(Train t1){
		super(t1.numWheels,t1.maxSpeed);
		this.numVehicles= t1.numVehicles;
		this.destStation= t1.destStation;
		this.startStation= t1.startStation;
	}
	/**
	 * Mutator method reseting destStation
	 * @param	destStation	Input reseting arrival station
	 */
	public void setDestStation(String destStation) {
		this.destStation=destStation;
	}
	/**
	 * Mutator method reseting startStation
	 * @param	startStation	Input reseting departure station
	 */
	public void setStartStation(String startStation) {
		this.startStation=startStation;
	}
	/**
	 * Accessor method returning number of vehicles
	 * @return	numVehicles	returns number of vehicles of object	 
	*/
	public int getNumVehicles() {
		return this.numVehicles;
	}
	/**
	 * Accessor method returning destStation
	 * @return	destStation	returns arrival location of object	 
	*/
	public String getDestStation() {
		return this.destStation;
	}
	/**
	 * Accessor method returning max speed	
	 * @return	startStation	returns number of wheels of object	 
	*/
	public String getStartStation() {
		return this.startStation;
	}
	/**
	 * Accessor method returning serial number from wheeled transport class
	 * @return	super.getSerialNum()	returns serial number from parent class	 
	*/
	public long getSerialNum() {
		return super.getSerialNum();
	}

	/**
	 * toString override method returning all information related to object
	 * 
	 * @return String returns information related to object 
	 */
	public String toString() {
		return "This wheeled transport — serial #"+getSerialNum()+" has "+numWheels+" wheels, has"
				+ "a maximum speed of"+ maxSpeed+" km/hr. It has "+numVehicles+" vehicles and "
						+ "its starting and destination stations are"+startStation+" and "+destStation;
					
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
		Train a = (Train)x;
		if(a.numWheels == this.numWheels && a.maxSpeed == this.maxSpeed && a.numVehicles == this.numVehicles  && a.startStation == this.startStation && a.destStation == this.destStation ) {
			return true;
		}
			return false;

	}
	/**
	 * clone() override method used to invoke polymorphism when using
	 * copy constructor 
	 * 
	 * @return	new Train(this)		Call to copy constructor 
	 * */
	public Train clone(){
		return new Train(this);	// Create and return a new Train using the copy constructor
	}
	
		
		
}
