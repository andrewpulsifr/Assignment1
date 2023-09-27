
public class Metro extends Train{
		
		protected int yrCreated;
		private long serialNum;
		static int metroSNctr;
		
		Metro(){
			this.yrCreated=1800;
			this.serialNum= SNctr;
			SNctr++;
		}
		
		Metro(int numWheels, double maxSpeed, int numVehicles, String startStation,String destStation, int yrCreated ){
			super(numWheels,maxSpeed,numVehicles,startStation,destStation);
			this.yrCreated=yrCreated;
			this.serialNum= metroSNctr;
			metroSNctr++;
		}
		
		Metro(Metro m1 ){
			super(m1.numWheels,m1.maxSpeed,m1.numVehicles,m1.startStation,m1.destStation);
			this.yrCreated=m1.yrCreated;
			this.serialNum= metroSNctr;
			metroSNctr++;
		}
			
		public void setYrCreated(int yrCreated) {
			this.yrCreated=yrCreated;
		}
		
		public int getyrCreated() {
			return this.yrCreated;
		}
	
		public String toString() {
			return "This wheeled transport — serial #"+serialNum+" has "+numWheels+" wheels, has"
					+ "a maximum speed of "+ maxSpeed+" km/hr. It has "+numVehicles+" vehicles and "
					+ "its starting and destination stations are"+startStation+" and "+destStation
					+". It was created in the year "+yrCreated;
						
		}
			


}
