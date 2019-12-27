package Day54_Polymorphisim;

public class Zoo {
public static void main(String[] args) {
	Tiger tiger1 = new Tiger ();
	Tiger [] Tigers = { tiger1, new Tiger() };
	
	Octopus octopus1 = new Octopus();
	Octopus[] octopus = {octopus1,new Octopus() };
	
	Animal 				animal1 = 			new Tiger();
	// reference type    reference name			object
				animal1.talk();
			//	animal1.Hunts();
					//reference type decides what can be called,
				//hunt method is not exist in reference type
				
	Animal animal2= new Octopus();//Octopus is talking ===> gologoglog
	//animal2.Swim();
				// animal class (referencetype) does not have swim
	
}
}

class Animal {
	
	public void talk () {
		System.out.println("Animal is talking");
	}
}

class Tiger extends Animal {
	public void Hunts () {
		System.out.println("hudinig hunt");
	}
	
	public void Talk () {
		System.out.println("Tigier says rrrooar");
	}
	
}

class Octopus extends Animal {
	
public void Swim() {
	System.out.println("Swiming");
}
public void Talk() {
	System.out.println("octopus says golgoogolgog");
}

}