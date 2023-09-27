
class WheeledTransportation{
	
		protected int numWheels;
		protected double maxSpeed;
		private long serialNum;
		static long SNctr =10000;
		static long metroSNctr = 3000;
		
		
		WheeledTransportation(){
			this.numWheels = 0;
			this.maxSpeed =0;
			this.serialNum= SNctr;
			SNctr++;
		}
		
		WheeledTransportation(int numWheels, double maxSpeed){
			this.numWheels = numWheels;
			this.maxSpeed= maxSpeed;
			this.serialNum= SNctr;
			SNctr++;
		}
		
		WheeledTransportation(WheeledTransportation w1){
			this.numWheels = w1.numWheels;
			this.maxSpeed= w1.maxSpeed;
			this.serialNum= SNctr;
			SNctr++;
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