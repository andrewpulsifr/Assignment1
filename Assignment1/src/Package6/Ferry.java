package Package6;
import Package0.Transportation;

public class Ferry extends Transportation{
	private double maxSpeed;
	private double maxLoad;
	private long serialNum;
	static long SNctr = 70000;
	
	//***CONSTRUCTORS***//
	
	//default constructor
	public Ferry(){
		this.maxSpeed = 0;
		this.maxLoad = 0;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	//parameterized constructor
	public Ferry(double inSpeed, double inLoad){
		this.maxSpeed = inSpeed;
		this.maxLoad = inLoad;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	//copy constructor
	public Ferry(Ferry inObject){
		this.maxSpeed = inObject.maxSpeed;
		this.maxLoad = inObject.maxLoad;
		this.serialNum = SNctr;
		SNctr++;
	}
	
	//***ACCESSORS AND MUTATORS***//
	
	public void setMaxSpeed(double inSpeed) {
		this.maxSpeed = inSpeed;
	}
	
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setMaxLoad(double inLoad) {
		this.maxLoad = inLoad;
	}
	
	public double getMaxLoad() {
		return this.maxLoad;
	}
	
	public long getSeriallNum() {
		return this.serialNum;
	}
	
	//***GET NEXT SERIAL NUMBER METHOD***//
	
	public long getNextSerialNumber() {
		return SNctr + 1;
	}
	//***EQUALS() METHOD***//
	
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
	
	public String toString() {
		return "This Ferry - Serial #" + this.serialNum + " - has a maximum speed of " + this.maxSpeed + " km/h and a maximum load of " 
				+ this.maxLoad + "kg";
		}

}
