package Day50_Task;

public  abstract class Cars {
public String Make;
public String Model;
public String Color;
public long Year;
public String Body;
public double EngineSize;
public short HP;
public double Millage;
public String Train;
public byte Seats;
public String fuelType;
public long fuelUsage;


public Cars(String Make, String Model, String Color,long Year, String Body,double EngineSize,
		short HP, double Millage, String Train, byte Seats, String fuelType,long fuelUsage) {
	this.Make=Make;
	this.Model = Model;
	this.Color = Color;
	this.Year = Year;
	this.Body = Body;
	this.EngineSize = EngineSize;
	this.Train=Train;
	this.Seats = Seats;
	this.fuelType=fuelType;
	this.fuelUsage=fuelUsage;
	this.Millage = Millage;
	this.HP=HP;
	
	
}

public abstract void turnOn(String turnOn);
public abstract void turnOff(String turnOff);
public abstract void accseleration(double speed0to60);
	
public void getInfo() {
	System.out.println("Make is "+Make+" and "+Model);
	System.out.println("Color is "+Color);
	System.out.println("Year is "+ Year);
	System.out.println("Type of body is "+ Body);
	System.out.println("Size of Engine "+ EngineSize);
	System.out.println("Horse Power "+HP);
	System.out.println("Millage "+Millage);
	System.out.println("Drive Type "+Train);
	System.out.println("Capacity of passengers "+Seats);
	System.out.println("Fuel type "+fuelType);
	System.out.println("Fuel usage "+fuelUsage);

	
	
}
}


