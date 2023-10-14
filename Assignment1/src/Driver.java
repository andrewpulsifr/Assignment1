import Package0.Transportation;
import Package1.WheeledTransportation;
import Package2.Train;
import Package2.Tram;
import Package3.Metro;
import Package4.Monowheel;
import Package5.Aircraft;
import Package5.WorldWarIIAirplane;
import Package6.Ferry;

/**
 * Main class that creates objects by calling classes to test functionatlity
 * 
 * @author Andrew Pulsifer and Eamon Foley
 */
public class Driver {
	
	/**
	 * Static method printing most and least expensive aircraft
	 * 
	 * @param	a	array of aircraft objects
	 */
	static void findLeastAndMostExpensiveAircraft(Object[] a) {
		
		Aircraft mostExpensive = null;
		Aircraft leastExpensive = null;
		
		for (int i = 0; i< a.length; i++) {
				
			String targetClass = a[i].getClass().toString().substring(15);
				
				if(targetClass.equals("Aircraft")) {
				Aircraft firstAircraft = (Aircraft)a[i];
				mostExpensive = firstAircraft;
				leastExpensive = firstAircraft;
				break;
			}
			
		}
		
		if(mostExpensive == null || leastExpensive == null) {
			System.out.println("Sorry, there are no aircrafts in this array of objects");
		}
		else {
			for (int i = 0; i < a.length; i++) {
			
			String targetClass = a[i].getClass().toString().substring(15);
			
			if(targetClass.equals("Aircraft")) {
				Aircraft b = (Aircraft)a[i];
				if(b.getPrice() > mostExpensive.getPrice()) {
					mostExpensive = b;
				}
				if(b.getPrice() < leastExpensive.getPrice()) {
					leastExpensive = b;
				}
			}
		}
		
		System.out.println("The Most expensive aircraft is: " + mostExpensive.toString());
		System.out.println("The least expensive aircraft is: " + leastExpensive.toString());
		
		}
		
		
	}
	/**
	 * Static main method creating objects and printing output 
	 * Testing most expensive and least expensive method with new objects
	 * 
	 * @param	args	to pass arguments
	 */
	public static void main(String[] args) {
		
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

		//TESTING EQUALS METHODS
		System.out.println("Testing equals methods on objects from different classes...\n");
		System.out.println("\t Comparing train1 and ferry3... \n\t     " + train1.equals(ferry3) + "! train1 and ferry3 are not equal\n");
		System.out.println("\t Comparing metro1 and aircraft2... \n\t     " + metro1.equals(aircraft2) + "! metro1 and aircraft2 are not equal\n");

		System.out.println("\nTesting equals methods on objects from the same class with different attributes...\n");
		System.out.println("\t Comparing mono1 and mono3... \n\t     " + mono1.equals(mono3) + "! mono1 and mono3 are not equal\n");
		System.out.println("\t Comparing ww2Airplane2 and ww2Airplane3... \n\t     " + ww2Airplane2.equals(ww2Airplane3) + "! ww2Airplane2 and wwAirplane3 are not equal\n");

		System.out.println("\nTesting equals methods on objects from the same classe with similar attributes...\n");
		System.out.println("\t Comparing aircraft1 and aircraft2... \n\t     " + aircraft1.equals(aircraft2) + "! aircraft1 and aircraft2 are equal\n");
		System.out.println("\t Comparing tram1 and tram2...\n\t     " + tram1.equals(tram2) + "! tram1 and tram2 are equal\n");
		
		//CREATING 2 ARRAYS OF TRANSPORTATION OBJECTS
		Transportation[] tArr1 = new Transportation[] {wt1,wt2,wt3,train1,train2,train3,metro1,metro2,metro3,tram1,tram2,tram3,mono1,mono2,mono3,aircraft1,aircraft2,aircraft3,ww2Airplane1,ww2Airplane2,ww2Airplane3,ferry1,ferry2,ferry3};
		
		Transportation[] tArr2 = new Transportation[] {wt1,wt2,wt3,train1,train2,train3,metro1,metro2,metro3,tram1,tram2,tram3,mono1,mono2,mono3,ferry1,ferry2,ferry3};

		//EXECUTING FIND LEAST AND MOST EXPENSIVE AIRCRAFT METHOD ON THE TWO TRANSPORTATION ARRAYS
		System.out.println("Finding the least and most expensive aircraft in Transportation Array 1...\n");
		findLeastAndMostExpensiveAircraft(tArr1);
		System.out.println("\nFinding the least and most expensive aircraft in Transportation Array 2...\n");
		findLeastAndMostExpensiveAircraft(tArr2);

		//Object abc[] = new Object[] {a1,a2,f2,f1};
		
		//findLeastAndMostExpensiveAircraft(arc);
	}

}
