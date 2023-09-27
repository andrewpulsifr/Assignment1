package WheeledTransportation;
class WheeledTransportation{
	
		protected int numWheels;
		protected double maxSpeed;
		protected long serialNum;
		static long serialNumCount =10000;
		
		WheeledTransportation(){
			this.numWheels = 0;
			this.maxSpeed =0;
			this.serialNum= serialNumCount;
			serialNumCount++;
		}
		
		WheeledTransportation(int numWheels, double maxSpeed){
			this.numWheels = numWheels;
			this.maxSpeed= maxSpeed;
			this.serialNum= serialNumCount;
			serialNumCount++;
		}
			
		public void setNumWheels(int numWheels) {
			this.numWheels=numWheels;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed=maxSpeed;
		}
		
		public int getNumWheels() {
			return numWheels;
		}
		
		public double getMaxSpeed() {
			return maxSpeed;
		}
		
		public long getSerialNum() {
			return serialNum;
		}
	
		public String toString() {
			return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
					+ "a maximum speed of"+ maxSpeed+" km/hr.";
		}
			
			
}

class Train extends WheeledTransportation{
	
	private int numVehicles;
	private String startStation;
	private  String destStation;
	
	Train(){
		super();
		this.numWheels = 0;
		this.startStation ="empty";
		this.destStation= "empty";
		WheeledTransportation.serialNumCount++;
	}
	
	Train(int numWheels, double maxSpeed){
		this.numWheels = numWheels;
		this.maxSpeed= maxSpeed;
		this.serialNum= WheeledTransportation.serialNumCount;
		WheeledTransportation.serialNumCount++;
	}
		
	public void setNumWheels(int numVehicles) {
		this.numVehicles=numVehicles;
	}
	public void setDestStation(String destStation) {
		this.destStation=destStation;
	}
	
	public void setStartStation(String startStation) {
		this.startStation=startStation;
	}
	
	public int getNumVehicles() {
		return this.numVehicles;
	}
	
	public String getDestStation() {
		return this.destStation;
	}
	public String getStartStation() {
		return this.startStation;
	}
	
	public long getSerialNum() {
		return super.getSerialNum();
	}

	public String toString() {
		return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
				+ "a maximum speed of"+ maxSpeed+" km/hr. It has "+numVehicles+" vehicles and "
						+ "its starting and destination stations are"+startStation+" and "+destStation;
					
	}
		
		
}


public class Driver {

	
	
		
		
	}

