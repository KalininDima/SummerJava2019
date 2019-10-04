package Day26_ForEach;

import java.util.Arrays;

public class ForEach {
public static void main(String[] args) {
	
	/*
	 For each loop: used to access
	  the value in collection of values, its a loop
	  thats already been iterated. 
	  For each loop Never goes infinite loop
	  
	  
	  syntax for each loop:
	  				for (DataType each VariableName:
	  				 VariabeNameOf Collection) {
	  				 
	 */
	/*
	 syntax:
	 		For(DataType each: Collection of Values) {
	 		
	 		}
	 		
	 		
	 		variable name "each" represents
	 		 of the characters of the array
	 		
	 		number of times execution of the loop 
	 		depends on the length of the array
	 		
	 		
	 */
	
	int [] arr = {1,2,3,4,5};
	for (int i=0;i<arr.length;i++) {
	
		System.out.print(arr[i]);
	}
	
	System.out.println("================");
	for(int each : arr) {
		System.out.println(each);
	}
	
	String [] str1 = {"A","B","C"};
	for ( String each :str1) {
		System.out.print(each);
	}
	System.out.println();
	
	char [] ch = {'z','x','y','c','a','b'};
	Arrays.sort(ch);
	for (char each1 : ch) {
		System.out.print(each1);
	}
	
	
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
	for(int varname : arr1) {
		if(varname %2!=0)
		System.out.println(varname +" ");
		
	}
	System.out.println();
	
	//print 1 ~1000: we cannot use for each loop
	
	
	
	
	
	
	
	
}
}
