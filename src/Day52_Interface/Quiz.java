package Day52_Interface;

/*
 * two ways to achieve abstracyions:
 * 		1. Abstrat class
 * 		2. Abstract method
 * 
 * why we need interface?
 * what we can have in interface?
 * what we cannot have in interface?
 * 
 * Interface: its blueprint of class, but  interface its not a class
 * 
 * 		public interface name {
 * 
 * 
 * 		}
 * 
 * we can store abstract methods, and let implement
 *  abstract methods
 *  
 *  interface is meant to be implemented
 *  
 *  implements keyword: we use the implements keyword to implements to implement
 *  abstract methods to the class
 *  
 *  Why do we need interface?
 *  A class can implement multiple interface
 *  A class can extend one class only
 *  
 *  What we can have in interface?:
 *  		methods: abstract method, static method, default method
 *  		variables : public static final ==>  automatically variables
 *   		are public , static and final by default
 *  		static and final by default
 *  
 *  What we cannot have in Interface?:
 *  Constructor
 *  Instance methods
 *  Instance variable
 *  instance block
 *  static block
 *  
 *  Interface we have used:
 *  WebDriver
 *  WebElement
 *  
 *  List
 *  Set
 *  Map
 *  next topic : Interface continue
 *  				wxtends vs implimints
 *  
 *  
 *  
 * 
 * 
 */
class A{
	public A() {
		System.out.print("A ");
	}
}

class B extends A{
	
	public B() {
		//super();  //A
		System.out.print("B ");
	}
}

abstract class abstractB{
	
	public abstract void method1();
	public abstract void method2();
	
	
}

public class Quiz extends abstractB{
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	
	// assessment quiz 13
	static int a = 10;
	
	public  void methodB() {
		
	}
	
	
	public static void main(String[] args) {
		B obj = new B();
		System.out.println();
		
		Quiz obj1 =new Quiz();
		obj1.a =20;
		
		
		Quiz obj2 = new Quiz();
		
		System.out.println(obj1.a); //20
		
		System.out.println(obj2.a);  // 20
		
		int[] arr = {2, 1, 0 };
		//	index:	 0  1  2 
		for(int i : arr) {
			System.out.print(arr[i] +" ");
			// arr[2] ==> 0
			//	arr[1] ==> 1
			// arr[0] ==> 2
			
		}
		
		
	}


	

}