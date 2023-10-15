// -----------------------------------------------------
// Assignment 1
// Part: 2
// Written by: Andrew Pulsifer 40234525 & Eamon 40233231
// -----------------------------------------------------


import Package0.Transportation;
import Package1.WheeledTransportation;
import Package2.Train;
import Package2.Tram;
import Package3.Metro;
import Package4.Monowheel;
import Package5.Aircraft;
import Package5.WorldWarIIAirplane;
import Package6.Ferry;

//Part II
/**
 * Main class that creates objects by calling classes to test functionatlity
 *  
 * 
 * @author Andrew Pulsifer 40234525 and Eamon Foley 40233231 
 */
public class Driver2 {
	/**
	 * Static method copying array of transport objects 
	 * 
	 * @param	inArr	array of transport objects	
	 * @return	copyTransArr	copied array of objects
	 */
	public static Transportation[] copyTheObjects(Transportation[] inArr) {
		
		Transportation[] copyTransArr = new Transportation[inArr.length];
		
		for(int i = 0; i<copyTransArr.length; i++) {
			copyTransArr[i] = new Transportation(inArr[i]);
		}
		return copyTransArr;
	}
	/**
	 * Static method printing array of transport objects 
	 * 
	 * @param	transArr	array of transport objects	
	 */
	public static void displayArrContents(Transportation[] transArr) {
		
		for(int i=0;i<transArr.length;i++) {
			System.out.print((i+1) + ". "  +transArr[i].toString() + "\n");
		}
	}
	
	/**
	 * Static main method creating objects and printing output 
	 * Testing Copy method with new objects
	 * 
	 * @param	args	to pass arguments
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to program testing object creation of transportation classes");
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		//CREATING OBJECTS OF EACH CLASS, EACH CLASS WILL HAVE 2 IDENTICAL OBJECTS
				//AND ONE OBJECT WITH DIFFERENT ATTRIBUTES IN ORDER TO TEST THE METHODS
				
				//CREATING WHEELED TRANSPORTATION OBJECTS
				WheeledTransportation wt1 = new WheeledTransportation(6,60.0);
				WheeledTransportation wt2 = new WheeledTransportation(6,60.0);
				WheeledTransportation wt3 = new WheeledTransportation(4,90.0);

				//CREATING TRAIN OBJECTS
				Train train1 = new Train(8, 70.0, 6, "Anrignon", "Berri-UQAM");
				Train train2 = new Train(8, 70.0, 6, "Anrignon", "Berri-UQAM");
				Train train3 = new Train(6, 60.0, 5, "Bonaventure", "Montmorency");

				//CREATING METRO OBJECTS
				Metro metro1 = new Metro(6, 60.0, 9, "Honore-Beaugrand", "Montomrency", 2012);
				Metro metro2 = new Metro(6, 60.0, 9, "Honore-Beaugrand", "Montomrency", 2012);
				Metro metro3 = new Metro(6, 60.0, 9, "Cote-Vertu", "Angrignon", 2013);

				//CREATING TRAM OBJECTS
				Tram tram1 = new Tram(4, 40.0, 4, "Centre Street", "Tuscany", 2015, 8);
				Tram tram2 = new Tram(4, 40.0, 4, "Centre Street", "Tuscany", 2015, 8);
				Tram tram3 = new Tram(4, 40.0, 4, "Southland", "Centre Street", 2016, 7);

				//CREATING MONOWHEEL OBJECTS
				Monowheel mono1 = new Monowheel(1, 30.0, 4000.0);
				Monowheel mono2 = new Monowheel(1, 30.0, 4000.0);
				Monowheel mono3 = new Monowheel(1, 50.0, 3000.0);

				//CREATING AIRPLANE OBJECTS
				Aircraft aircraft1 = new Aircraft(15000000, 65000);
				Aircraft aircraft2 = new Aircraft(15000000, 65000);
				Aircraft aircraft3 = new Aircraft(12000000, 50000);

				
				//CREATING WORLD WAR II AIRPLANE OBJECTS
				WorldWarIIAirplane ww2Airplane1 = new WorldWarIIAirplane(1000000, 30000, true);
				WorldWarIIAirplane ww2Airplane2 = new WorldWarIIAirplane(1000000, 30000, true);
				WorldWarIIAirplane ww2Airplane3 = new WorldWarIIAirplane(2000000, 25000, false);
				
				//CREATING FERRY OBJECTS
				Ferry ferry1 = new Ferry(20,60);
				Ferry ferry2 = new Ferry(20,60);
				Ferry ferry3 = new Ferry(30,50);

				//PRINTING CREATED OBJECTS
				System.out.println("Wheeled Transport Objects:");
				System.out.println("\t" + wt1.toString()+ "\n");
				System.out.println("\t" +wt2.toString()+ "\n");
				System.out.println("\t" +wt3.toString()+ "\n");
				System.out.println("\n");
				
				System.out.println("Train Objects:");
				System.out.println("\t" +train1.toString()+ "\n");
				System.out.println("\t" +train2.toString()+ "\n");
				System.out.println("\t" +train3.toString()+ "\n");
				System.out.println("\n");

				System.out.println("Metro Objects:");
				System.out.println("\t" +metro1.toString()+ "\n");
				System.out.println("\t" +metro2.toString()+ "\n");
				System.out.println("\t" +metro3.toString()+ "\n");
				System.out.println("\n");

				System.out.println("Tram Objects:");
				System.out.println("\t" +tram1.toString()+ "\n");
				System.out.println("\t" +tram2.toString()+ "\n");
				System.out.println("\t" +tram3.toString()+ "\n");
				System.out.println("\n");

				System.out.println("Monowheel Objects:");
				System.out.println("\t" +mono1.toString()+ "\n");
				System.out.println("\t" +mono2.toString()+ "\n");
				System.out.println("\t" +mono3.toString()+ "\n");
				System.out.println("\n");

				System.out.println("Aircraft Objects:");
				System.out.println("\t" +aircraft1.toString()+ "\n");
				System.out.println("\t" +aircraft2.toString()+ "\n");
				System.out.println("\t" +aircraft3.toString()+ "\n");
				System.out.println("\n");

				System.out.println("World War II Airplane Objects:");
				System.out.println("\t" +ww2Airplane1.toString()+ "\n");
				System.out.println("\t" +ww2Airplane2.toString()+ "\n");
				System.out.println("\t" +ww2Airplane3.toString()+ "\n");
				System.out.println("\n");

				System.out.println("Ferry Objects:");
				System.out.println("\t" +ferry1.toString()+ "\n");
				System.out.println("\t" +ferry2.toString()+ "\n");
				System.out.println("\t" +ferry3.toString()+ "\n");
				System.out.println("\n");
				
				Transportation[] tArr = new Transportation[] {wt1,wt2,wt3,train1,train2,train3,metro1,metro2,metro3,tram1,tram2,tram3,mono1,mono2,mono3,aircraft1,aircraft2,aircraft3,ww2Airplane1,ww2Airplane2,ww2Airplane3,ferry1,ferry2,ferry3};

				Transportation[] coppiedArr = copyTheObjects(tArr);
				
				System.out.println("Displaying information of coppied array: \n");
				displayArrContents(coppiedArr);
				
				System.out.println();
				System.out.println("-------------------------------------------------------------------");
				System.out.println("Program has terminated!");
		
	}

}
