package Day53_InterfaceContinue;

public class JeppWrangler implements Cars, GasVehicles {

	public void start () {
		System.out.println("put your keys into ignition and then turn key");
		
	}
	
	public void PumpGas() {
		System.out.println("push button \" Gas\" for open it");
	}

	@Override
	public void SelfParking() {
		System.out.println("Self Parking mode");
		
	}
	
	
}
