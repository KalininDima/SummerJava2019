package Day34_Constructors;

public class ConstructorMethods {
public static void main(String[] args) {
	

	
	/*
	regular methods:
	 access - modifier specifier return-type methodName (parametre)
	 Constructor: its a very special method . used for creating the object
	 of the class.
	 		3 types of method:
	 			1.void method
	 			2.return method
	 			3.constructor special
	 			
	 			every single class must have a constructor
	 			if we didnt give the constructor, then the compiler
	 			will give the default (no-arg) constructor
	 			 
	 declaration of constructor:
	 		default constructor (constructor without argument):
					access-modifier className(){
					
					}
					
			constructor with argument:
	 		access-modifier className(parameter) {
	 			(public)		
	 		statements;
	 		
	 		}
	 		
	 		
	 		constructor cannot have return type and specifier
	 		constructor' name MUST be same with the class name
	 		
	 		constructor' execution depends on creation of the object
	 		constructor calls:
	 					only a constructor can call another constructor;
	 					
	 		create an object from class :
	 				className referenceName = new existingConstructorMethod
	 		
	 		Constructor Methods can be overload
	 		if we want to have more than one constructor we MUSt overload it
	 		
	 //ConstructionMethod objVariable = new ConstructorMethods("A")
	// object was not created with 
	// existing constructor
	 */
	
	
	ConstructorMethods obj = new ConstructorMethods(9);
	
	method1();
	
	
}

public ConstructorMethods() {
	System.out.println("Default Constructors");
	
	//return "aaa" ; there is no return type in constructor
	
	
}

public ConstructorMethods(String str) {
	System.out.println("String constructor");
}

public ConstructorMethods ( int num) {
	System.out.println("int constructor");
	
	
}

public static void method1 ( ) {
	
	ConstructorMethods obj = new ConstructorMethods("string");
	
}

}
