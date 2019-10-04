package Day25_ArrayContinue;

public class WarmUp {
public static void main(String[] args) {
	/*
	 1.Write a program that can print out the unique values from an int Array 
	 Ex:
	 	if arr-->{1,1,2,3,3}
	 	output:2
	 	
	 	if arr --> {1,2,2,3,4,4}
	 	output: 1 3
	 	
	 */
	
	int [] arr = {1,1,2,2,3,4,4,9};
	
  for (int j = 0;j<arr.length;j++) {
	int count = 0;
	for (int i = 0; i<arr.length;i++) {
		if(arr[i]==arr[j]) {
			count++;
		}
	}
	if (count==1) {
		System.out.print(arr[j]);
	}
  }
	System.out.println();
	
	System.out.println("------------------------");
	
	
	
	
	/*
    1. Write a program that can print out the unique values from an int Array
       Ex: 
           if arr -> {1,1,2,3,3}
           output: 2
           if arr -> {1,2,2,3,4,4}
           output:  1  3
    */
       
       int[] arr1 = { 1, 1, 2, 2 , 3, 4, 5, 1 , -1 };
       // index:     0  1  2  3   4
       // arr[j]  
       
   for(int j=0; j < arr1.length; j++) {  
       
       int count = 0 ;  // to find out how many time a value is appeared in the array
       for(int i=0; i < arr1.length; i++) {
           if( arr1[i] == arr1[j] ) {  // compares each index of the array with the given value
               count++;  // everytime if the value is occured in the array, count will be increased by one
           }
       }
        
       if( count == 1 ) {  // if only appeared once, we will print that value out
           System.out.println( arr1[j] );
       }
       
   }
	
	
	
	
	
	
	
	
}
}
