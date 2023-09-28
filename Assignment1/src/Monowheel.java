
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
}
