package Day36_JavaReview;

public class ConstructorReview {
	
		public ConstructorReview() {
			System.out.println("default constructor");
		}
		
		public ConstructorReview(int a) {
			System.out.println("Construcor with argument int:"+a);
		}
public static void main(String[] args) {
	
	
	
	/*
	 Constructors: Special method , used when create an object of a class
	 			Every classMUST have constructor
	 			if we dont create any constructor, then compiler will give
	 			default constructor
	 			
	 			creating object:
	 					ClassName obj = new ExistingConstructor;
	 					
	 					only the given constructor gets executed
	 					
	 			declaration of constructor:
	 			
	 					access - modifier className(){
	 					 
	 					}
	 					
	 					CONSTRUCTOR WITH ARGUMENT	:
	 						access-modifier className(paramemter)
	 					
	 					constructors name MUSt be same with class name
	 					in constructors method signature their is 
	 					no return type and specifier
	 					
	 					we can multiple constructors by 
	 					overload constructor
	 					
	 					you can give multiple parameters in 
	 					constructor
	 					
	 1.Only constructor can call another constructor
	 2.Constructor cannot call by constructor name
	 3.We use "this()" keyword to call constructor 
	 4.Constructor call must be first step
	 5. One constructor can only call one constructor, 
	 cannot call more than 1
	 use this(); keyword : used for calling object instances
	 6. Constructor cannot call it self
	 7. Constructor cannot contain itself
	 					
	 					
	 */
	
	ConstructorReview obj = new ConstructorReview();
	
	//ConstructorReview obj2 = new ConstructorReview("12 batch");
					//the constructor with argument String not exist
	
	ConstructorReview obj2 = new ConstructorReview(90);
	 }
	

}
