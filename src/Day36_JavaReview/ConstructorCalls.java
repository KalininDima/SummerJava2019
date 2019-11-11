package Day36_JavaReview;

public class ConstructorCalls {


	/*
	
	 1.Only constructor can call another constructor
	 2.Constructor cannot call by constructor name
	 3.We use "this()" keyword to call constructor 
	 4.Constructor call must be first step
	 5. One constructor can only call one constructor, cannot call more than 1
	 use this keyword : used for calling object instances
	 6. Constructor cannot call it self
	 7. Constructor cannot contain itself
	 
	 */

		public ConstructorCalls () {
			System.out.println("A");
			
		}
		
		public ConstructorCalls (int a) {
			//ConstructorCalls();
			//System.out.println("B");//Constructor call must be first step
			this(); // "A"   this(); <---- constructor
			
			System.out.println("B");
			
		}
		
		public ConstructorCalls (double a) {
			
			this(10); // A B
			//this(); one constructor cannot containe more than 1 constructor, one constructor can call 
			//only 1 constructor
			System.out.println("C"); // C
		}
		
		public static void method1() {
			
		}
		
		public static void main (String[] args) {
			method1();
			//ConstructorCalls();
			ConstructorCalls obj = new ConstructorCalls(10.5);
		}

}
