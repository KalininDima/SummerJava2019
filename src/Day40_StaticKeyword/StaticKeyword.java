package Day40_StaticKeyword;

import java.util.Scanner;

public class StaticKeyword {
/*
 static means that we can access the members through the class name
 
 		static members belongs to the class, 
 		also called class members
 	
 	What can be static in Java
 				1. static variables (class,global)
 				2. static methods
 				3. static initializer
 				4. static inner class (nested class)
 		instance variables: created in the class outside any method
 							belongs to the object. Each object will 
 							have own copy
 		local variables: declared within the methods or blocks 
 							only accessible within the method or block
 		
 		static variables: created in the class outside any
 		 				  method with static keyword
 		 				  
 		 				  when variable is static its shared with 
 		 				  class and all objects of the class. And we can 
 		 				  call it thru class name
 		 
 		static methods: e method that we can call thru the class name
 						static methods only accepts class members(static)
 						
 						none static can only be called thru the 
 						objects in the static method
 						
 		instance variable VS static variable:
 				instance variables belong to object (fields)
 				static variables belong to the class (class variables)
 				
 				static method only accepts class members , non
 				 static must be called thru the object
 				
 				static features are shared by class and all 
 				other objects
 				can only have one copy
 				
 				each objects they have their own copy of instance variables
 				
 				summary:
 				1. static is shared by class and all other objects
 				2. there can only  be one copy for static variable
 				3. each objects has its own copy of instance variable
 				4. static members can be called thru the class name
 				5. static methods only accepts only accepts static members
 				6. in order to call none static in a static method we MUSt call it thru the object
 				
 */
	
	int a;
	static int b ;
	static Scanner scan = new Scanner (System.in);
	public static void method1 () {
		System.out.println("Open browser 2 ");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		StaticKeyword obj1 = new StaticKeyword();
				obj1.a = 100;
		StaticKeyword obj2 = new StaticKeyword();
				obj2.a = 200;
				
		System.out.println(obj1.a); //100
			// each object has its own copy of instance variables
		System.out.println(obj2.a); //200
		
		double num = 100.5;
		
		System.out.println(StaticKeyword.b);
		System.out.println(obj1.b);//0
		System.out.println(obj2.b);//0
		
		System.out.println("================");
		
		StaticKeyword obj3 = new StaticKeyword();
					obj3.a = 100;
					System.out.println(obj3.a); //100
					
		StaticKeyword obj4 = new StaticKeyword();
		System.out.println(obj4.a); //0
		
		obj3.b = 400;
		System.out.println(obj3.b);//400
		System.out.println(obj4.b); //400
		
	}
	
	public static void method() {
	//	System.out.println(num); local variable only visible within the method
	}
	
	public static void PrintH() {
		System.out.println("Hello cybertek");
	}
}
