package Day50_Task;

public class Tesla extends Cars{
	
	public Tesla (String Make, String Model, String Color,long Year, String Body,double EngineSize,
			short HP, double Millage, String Train, byte Seats, String fuelType,long fuelUsage) {
		
		super(Make, Model, Color, Year, Body, EngineSize, HP, Millage, Train, Seats, fuelType, fuelUsage);
		
	}
	
	public void turnOn(String turnOnProcess) {
	System.out.println("In "+Model+" to start electircal engine you should "+turnOnProcess);
	}
	public void turnOff (String turnOff) {
		System.out.println("For turn off "+ Model+" you should "+turnOff);
	}
	
	public void accseleration(double speed0to60) {
		System.out.println(Make+" "+Model+" Acceleration from 0 to 60: "+speed0to60);
	}
	
	

}
