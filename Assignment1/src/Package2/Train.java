package Package2;
import Package1.WheeledTransportation;

class Train extends WheeledTransportation{
	
	protected int numVehicles;
	protected String startStation;
	protected  String destStation;
	
	Train(){
		this.numWheels = 0;
		this.startStation ="empty";
		this.destStation= "empty";
	}
	
	Train(int numWheels, double maxSpeed, int numVehicles, String startStation,String destStation){
		super(numWheels,maxSpeed);
		this.destStation= destStation;
		this.startStation= startStation;

		
	}
		
	Train(Train t1){
		super(t1.numWheels,t1.maxSpeed);
		this.numVehicles= t1.numVehicles;
		this.destStation= t1.destStation;
		this.startStation= t1.startStation;
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
		return getSerialNum();
	}

	public String toString() {
		return "This wheeled transport — serial #"+getSerialNum()+" has "+numWheels+" wheels, has"
				+ "a maximum speed of"+ maxSpeed+" km/hr. It has "+numVehicles+" vehicles and "
						+ "its starting and destination stations are"+startStation+" and "+destStation;
					
	}
		
		
}
