package Day49_Recap;
/*
	 Abstractions on essentials/important things, 
 worrying about the details/implementations
 
 car:
 		start() {
 				
 				put the key	
 				turn the engine on
 				start driving
 				
 				
 				}
 				
 	abstract method : a method without body/implementation
 				public abstract start();
 				its a method thats meant to be override
 				Only the instance methods can be override and can be abstract
 				
 				ex:
 						Pontanic car:
 								start() {
 								call the mechanic
 								start the engine
 								jump start
 								drive
 					
 								}
 								
 						
 					Tesla ca:
 							start() {
 							say "start"
 							drive
 							
 							}
 							
 					abstract method can only be declared in abstract
 					 class and interface
 							
 					abstract class: abstract is something not concrete
 					we cannot create object from
 					a class meant to be extended
 					abstract class cannot be final
 					of the sub class is regular class, the sub MUST override the
 					abstract methods
 					if the sub class is abstract , no need to override
 					
 			why we cannot create object from abstract class?
 					abstraction is something not concrete
 					
 					
	 */



class Toyota extends Abstractions{
    
    // public abstract void startTheCar();
    
    @Override
    public void startTheCar() {
        System.out.println("Brake");
        System.out.println("push the start button");
        System.out.println("Release the brake");
    }
    
    public static void main(String[] args) {
        //Abstraction  obj = new Abstraction ();
        
    }
}
class Tesla extends Abstractions{
        // regular class MUST implement the abstract methods from the abstract class
    
    public void startTheCar() {
        System.out.println("voice constrol");
        System.out.println("driver");
    }
    
}

public abstract class Abstractions {
    public abstract void startTheCar(); 
    
}

