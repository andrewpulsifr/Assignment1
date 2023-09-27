
public class Tram extends Metro{
		
		protected int totalStops;
		private long serialNum;
		static int tramSNctr=25000;
		
		Tram(){
			this.totalStops=0;
			this.serialNum= tramSNctr;
			tramSNctr++;
		}
		
		Tram(int numWheels, double maxSpeed, int numVehicles, String startStation,String destStation, int yrCreated,int totalStops ){
			super(numWheels,maxSpeed,numVehicles,startStation,destStation,yrCreated);
			this.totalStops=totalStops;
			this.serialNum= tramSNctr;
			tramSNctr++;
		}
		
		Tram(Tram t1){
			super(t1.numWheels,t1.maxSpeed,t1.numVehicles,t1.startStation,t1.destStation,t1.yrCreated);
			this.totalStops=t1.totalStops;
			this.serialNum= tramSNctr;
			tramSNctr++;
		}
			
		public void setTotalStops(int totalStops) {
			this.totalStops=totalStops;
		}
		
		public int getTotalStops() {
			return this.totalStops;
		}
	
		public String toString() {
			return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
					+ "a maximum speed of "+ maxSpeed+" km/hr. It has "+numVehicles+" vehicles and "
					+ "its starting and destination stations are"+startStation+" and "+destStation
					+". It was created in the year "+yrCreated+" and has "+totalStops+" totals stops.";
						
		}
			


}

