package Package0;

public class Transportation {
	private long serialNo;
	private static long SNctr = 0;
	
	public Transportation() {
		this.serialNo = SNctr++;
	
	}
	public Transportation(Transportation inTr) {
		this.serialNo = inTr.serialNo;
	}
	
	public long getSerialNo() {
		return serialNo;
	}
	public String toString() {
		return "This Transportation object — serial #"+serialNo;
	}
	

}
