package Day53_InterfaceContinue;

public class TeslaModel3 implements Cars, ElectricVehicles{
	
	public void start() {
		System.out.println("Voise Control \" Tesla START\" ");
	}

	
	public void Charge() {
		System.out.println("Charging");
	}
	
	public void selfDriving() {
		System.out.println("Self Driving mode");
	}
}
