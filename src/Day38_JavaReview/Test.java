package Day38_JavaReview;

public class Test {
//q1
	//public costructor() { contructor must be a class name
		
	//}
	
//q2
public static void main(String[] args) {
	//q1:
	Test obj = new Test();
	
	//q2
	// Test obj2 = new Test (123); //class object MUST be created with existing consructor
	
	//q3
	/*
	 public Test () {
	 //this(); // constructor cant call it self
	   
	  public Test (int a) {
	  this();
	  
	  }
	 }
	 */
	

	
	
}	
//q4:
//public Test () {
//	this (10);constructor cant contain itself, no loops
	
//}

//public Test (int a) {
//	this();constructor cant contain itself, no llops
//}


//q5:
public Test() {
	int a  = 100;
	//this(10); constructor call must be first step
	System.out.println("Hello");
}

public Test (int a) {
	
}

//q6:

}
