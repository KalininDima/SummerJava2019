package Day23_Arrays;

public class Arrays {
public static void main(String[] args) {
	/*
	 Arrays: a variable that we can store multiple values
	  		regular variable:
	  				int a=10; can only have one value
	  				
	  				Arrays:
	  					int[] arr = {10,20,30,40};
	 				dataType  variableName
	 				
	 				each value(Elements) in an array have their
	 				own index numbers:
	 				int [] VariablName = {10,20,30,40}
	 				 `	index num			0 1  2  3
	 				to retrive the data of the array:
	 				VariableName[indexNumber of data]
	 				
	 				VariableName[3] ==> 40
	 			
	 			Arrays is immutable, and Arrays sixe is fixed
	 			
	 			Arrays sixe must be initialized, there are 
	 			two ways can initialize Arrays size:
	 				1. givinf values:
	 							int[] a= {1,2,3}
 	 				2. giving the size only
	 				
	 */
	
	//int a ="a";
	int [] arr = {1,2};
	
	
	String [] names = {"Nigar", "PriSvetoyEnuariy","Galosha"}; 
	//					0			1					3
	
	System.out.println(names[1]);
	
	String str1 = names[2];
	String str2= names[1];
	
	//System.out.println(names[4]); error
	
	
	double[] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
	// index: 			0	1 2  3  4  5  6  7
	
	for(int i = 0; i<=7;i++) {
		System.out.println(myArray[i]+" ");
	}
	System.out.println();
	// length of Array:
	String str = "ABC";
		int A = str.length();
		System.out.println(A);
		
	int[] Numbers = {12,24,48,98,2,3,4,5,6,7,8,9,10,11};
			int B = Numbers.length;//14
				System.out.println(B);
				int HighestIndexNum = Numbers.length-1;
				System.out.println(HighestIndexNum);
	
	for(int i=0;i<Numbers.length;i++) {
		int s1= Numbers[i];
		System.out.println(s1+" ");
	}
	System.out.println();
	
	char[] myChars = {'A','B','C','D'};
	int HighestIndexNum2 = myChars.length-1;
	System.out.println(HighestIndexNum2);
	
}
}
