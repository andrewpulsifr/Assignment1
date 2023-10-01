
package Package3;
import Package2.Train;

public class Metro extends Train{
		
		protected int yrCreated;
		private long serialNum;
		static int metroSNctr;
		
		public Metro(){
			this.yrCreated=1800;
			this.serialNum= metroSNctr;
			metroSNctr++;
		}
		
		public Metro(int numWheels, double maxSpeed, int numVehicles, String startStation,String destStation, int yrCreated ){
			super(numWheels,maxSpeed,numVehicles,startStation,destStation);
			this.yrCreated=yrCreated;
			this.serialNum= metroSNctr;
			metroSNctr++;
		}
		
		public Metro(Metro m1 ){
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
		
		public boolean equals(Object x) {
			
			if(x == null || x.getClass() != this.getClass()) {
				return false;
			}
			Metro a = (Metro)x;
			if(a.numWheels == this.numWheels && a.maxSpeed == this.maxSpeed && a.numVehicles == this.numVehicles  && a.startStation == this.startStation && a.destStation == this.destStation && a.yrCreated == this.yrCreated ) {
				return true;
			}
				return false;

		}
			


}
