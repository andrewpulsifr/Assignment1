package Package4;
import Package1.WheeledTransportation;

public class Monowheel extends WheeledTransportation {

	private double maxWeight;
	private long serialNum;
	static long monoSNctr = 55000;
	
	
	Monowheel(){
		maxWeight=0;
		this.serialNum= monoSNctr;
		monoSNctr++;
	}
	
	Monowheel(int numWheels, double maxSpeed, double maxWegith){
		super(numWheels, maxSpeed);
		this.serialNum= monoSNctr;
		monoSNctr++;
	}
	
	Monowheel(Monowheel m1){
		super(m1.numWheels,m1.maxSpeed);
		this.maxWeight=m1.maxWeight;
		this.serialNum= monoSNctr;
		monoSNctr++;
	}
		
	public void setMaxWeight(int maxWeight) {
		this.maxWeight=maxWeight;
	}
	
	public double getMaxWeight() {
		return maxWeight;
	}
	

	public String toString() {
		return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
				+ "a maximum speed of"+ maxSpeed +". The max weight of this monowheel equals "+maxWeight;
	}
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
}
