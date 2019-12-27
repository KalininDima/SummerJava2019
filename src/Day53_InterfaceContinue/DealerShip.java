package Day53_InterfaceContinue;

public class DealerShip {

	public static void main(String[] args) {
		
		
		TeslaModel3 obj1 = new TeslaModel3();
		
		obj1.start();
		
		JeppWrangler obj2 = new JeppWrangler(); {
			obj2.start();
			obj2.PumpGas();
			
		}
		ToyotaHybrid obj3 = new ToyotaHybrid(); {
			obj3.start();	
			
		}
	}
		
}
