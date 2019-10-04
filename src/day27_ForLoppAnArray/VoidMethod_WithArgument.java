package day27_ForLoppAnArray;

public class VoidMethod_WithArgument {

	
	/*
	 Method with argument:
		access-modifier specifier return-type name ( parameter){
		
		}
		
		parameters: any data-type
			 
	 */
	
	
	public static void main(String[] args) {
		//oddOrEven();//method was designed to take an argument, 
		//the method needs the argument in order to perform its task
		oddOrEven(50); // need provide a value that can be
		//assigned to the parameter of the method
		
		int z = 100;//local variables MUST be 
		//initialized before we use it
		
		
		oddOrEven(z); 
		// variable z' value will be assigned to 
		//the parameter vaiable
		
		//FindSomeTwo(10); error because not enough information yet, 
		//need to be 2 variable
		FindSomeTwo(1,10);
		
		//Write a programm that can remove all dublicates from 
		//String and print the result
		//EX: (aaaaaaabbbbbbcccccc)
		//output: abc
		
		
		String str = "aaaaaasssddddfffggghtyu";
		
		RemoveDublicates(str);
		
		
		
	}
	
	
	public static void FindSomeTwo(int b, int a) {
	System.out.println("Sum of "+a+" and "+b+" is: "+(a +b) );
		
	}
	
	
	public static void oddOrEven(int a) {
		if(a%2 ==0) {
			System.out.println(a+" Even number");
		} else {
			System.out.println(a+" is odd number");
		}
	}
	
	
	public static void RemoveDublicates(String str){
		int l = str.length()-1;
		String resultU = "";
		for (int i = 0;i<=l;i++) {	
				if(!resultU.contains(str.substring(i,i+1))){
				resultU+=str.charAt(i);
		}
		
		
	}
	System.out.println(resultU);
	}
	

}
