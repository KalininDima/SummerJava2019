package Day50_Task;

public class Garage {
	
	public static void main(String[] args) {
		
		Tesla Model3 = new Tesla("Tesla", "Model 3", "Blue",(long) 2020, "Wagon",(double) 0,(short) 350,
				(double)15000,"AWD", (byte)5, "Electricity", (long)120 );
		
		
		Model3.getInfo();
		Model3.turnOn("Open door, press breake pedal, wait 3 seconds, car is on");
		Model3.turnOff("Press Parking button, take phone or keys,step out from the car, walk on 5-10 feet, car will close automatically");
		Model3.accseleration(4.4);
	}

}
