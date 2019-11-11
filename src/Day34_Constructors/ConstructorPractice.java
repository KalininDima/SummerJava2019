package Day34_Constructors;

public class ConstructorPractice {
public static void main(String[] args) {
	
//	public sort() {  } in constructor method name must 
//  be same as class name
	

	
	//ConstructorPractice obj = new ConstructorPractice(); does not texist
	//default (no-arg) constructor is given by default , when there is no argument
	
	//ConstructorPractice obj2 = new ConstructorPractice("Hello");
	//we dont have constructor that passes String parameter
	
	
	method1();
	//ConstructorPractice(10); only constructor can call constructor, 
	//you need create an object
	ConstructorPractice obj3 = new ConstructorPractice(10);
	//constructor' execution is ALWAYS depends on the creation of the object
	
	
	method2();
	
}


//default Constructor
public ConstructorPractice(int a) {
	System.out.println("Int parameter Constructor " + a);
}

public static void method1() {
	System.out.println("Regular method");
}

public static void method2() {
	ConstructorPractice obj4 = new ConstructorPractice(10);
}

}
