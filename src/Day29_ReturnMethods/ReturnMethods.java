package Day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethods {
public static void main(String[] args) {
	
	name(); // this is a String value now
	System.out.println(name()); //return methods
	//are either printed or assigned 

	
	String str = name();
	
	
	System.out.println(str);
	
	
	//int max = sum(10,20); // the method sum does not return any value
	
	addition (10,20);//this method is and int value
	System.out.println(addition(10,20));
	
	byte num = (byte)addition (10,20); //or int, or long,or...
	System.out.println(num);
	
	int max = (int)GN(1,3,7);
	
	System.out.println(max);
	
	System.out.println(GN ( 1,3,7) );
	
	int arr [] = {201,2,33,124,543,333,126};
	int maxarr = maximum(arr);
	System.out.println(maxarr);
	int arr2 [] = {201,2,33,124,543,333,126};
	int maxarr2 = maximum(arr2);
}


//write a method that accepts int 
//Array and returns the maximum number

public static int maximum (int [] arr) {
	Arrays.sort(arr);
	
	return arr[arr.length-1];
}

	/*
	 -acces-modifer 
	 specifier returnType name 
	 (parameter){statements}
	 */
	
	//if return type is void:
	public static void method1() {
		System.out.println("Hello");
		return; // it exists the loop imideatly
	}
	
	//if the return type of the method is not void:
	public static String name () {
		return "Batch12";
		//System.out.println(); return statement exists 
		//the loop after method immidiately
	}
	
	public static boolean ReturnB () {
		return 8>9;
		
				
	}
	 public static void sum (int a, int b) {
		 System.out.println(a+b);
	 }
	 public static int addition (int a,int b) {
		 return a+ b;
	 }
	
	
	//write a method that accepts 3 numbers and 
	 //returns the largest number
	
	 public static double GN(int a,int b, int c) {
		 int [] arr = {a,b,c};
		 Arrays.sort(arr);
		 return arr [arr.length-1];
	 }
	 
	 
	 
}
