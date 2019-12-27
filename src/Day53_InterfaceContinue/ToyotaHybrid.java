package Day53_InterfaceContinue;

public class ToyotaHybrid implements Cars, ElectricVehicles, GasVehicles {

	@Override
	public void PumpGas() {
		System.out.println("pumping gas");
		
	}

	@Override
	public void Charge() {
		
		System.out.println("charging");
		
	}

	@Override
	public void selfDriving() {
		System.out.println("Selfdriving mode");
		
	}

	@Override
	public void start() {
	System.out.println("push start button");
		
	}

	@Override
	public void SelfParking() {
		// TODO Auto-generated method stub
		
	}
	
	

}
