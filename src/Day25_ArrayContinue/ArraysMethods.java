package Day25_ArrayContinue;

import java.util.Arrays;

public class ArraysMethods {
public static void main(String[] args) {
	
	
	int num1 =10;
	System.out.println(num1);
	
	int [] arr = {1,2,3};
	System.out.println(arr[0]);
	
	/*
	 to print entire array as whole , we need to convert the
	  Array to String Arrays.toString
	 (Variable.Name): used for converting single dimensional 
	 arrays  to String value
	 
	 Arrays class :
	 
	 arrays Utilities:
	 			Arrays.toString (VaiableNAme): it converts 
	 			an arry to String value
	 			
	 			Arrays class is presented in java.util package
	 
	 */
	
	String str = Arrays.toString(arr);
	System.out.println(str);
	
	String [] names = {"Elv", "Eva,", "Adama," , "Sendler"};
	System.out.println(names [0]);
	System.out.println(names); // hash code
	System.out.println(Arrays.toString(names));
	
	
	/*
	 Arrays.sort(variableName):
	 				sorts the values of the array in acseending order (smallest to larger)
	 */
	
	int[] Numbers = {9,8,100,3000,4,5,6};
	Arrays.parallelSort(Numbers);
	
	System.out.println( Arrays.toString(Numbers) );
	
	
	Arrays.sort(Numbers);	//sort all the values in the array in acseendin
	
	//sort methods doesNumbers = [4,5,6,8,9,1000];
	
	System.out.println(Arrays.toString(Numbers));
	
	System.out.println("Maximum:" + Numbers[Numbers.length-1]);
	System.out.println("Minimum: " + Numbers[0]);
	
	
	
	System.out.println(Arrays.toString(Numbers));
	
	
	
	String [] Namelists = {"Alex", "Anton", "Eva", "Ema", "Ashot", "Anna","Evan"};
	Arrays.sort(Namelists); // alphabets order (from ASCII table
	
	System.out.println(Arrays.toString(Namelists));
	
	
	char [] ch = {'0','9','8','5','2'};
		Arrays.sort(ch);
		System.out.println(ch);
	System.out.println(Arrays.toString(ch));
	
	
	int [] nums = {2000,90,89, 78, 65, 5555, 444, -5};
	
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	System.out.println("Minimum number : "+ nums[0]);
	System.out.println("Maximum number:" + nums[nums.length-1]);
	System.out.println("Second maximum number: "+nums[nums.length-2]);
	System.out.println("Second minimum number: "+nums[1]);
	
	/*
	 write a program that can print the arrays in Descending order (largest to smallest)
	 */
	
	String result="[";
	int [] MyNumbers = {99,10,12,123123,223,5,65};
	Arrays.sort(MyNumbers);
		for (int i = MyNumbers.length-1;i>= 0; i--) {
			result += MyNumbers[i]+",";
			
			
		}
		
		System.out.println();
		
		//result=result.replace(",", " ");
		result = result.substring(0,result.length()-2)+"}";
		System.out.println(result);
		
		
		 int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
	        Arrays.sort(arr2);  //  array will be sorted in Acsending order
	    //  arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
	        //        0  1   2    3   4    5     6
	        
	        int[] Decedning = new int[arr2.length];
	        /*
	            Decedning[0] = arr2[6];
	            Decedning[1] = arr2[5];
	            Decedning[2] = arr2[4];
	            Decedning[3] = arr2[3];
	            Decedning[4] = arr2[2];
	            Decedning[5] = arr2[1];
	            Decedning[6] = arr2[0];
	        */
	        
	        int z=0;
	        for(int i = arr2.length-1; i >=0; i-- ) {
	            Decedning[ z ] = arr2[i];
	            z++;
	        }
	        
	        System.out.println(Arrays.toString(arr2));
	    
	        System.out.println(Arrays.toString(Decedning));
	                
		
		
		
		
		/*for (int i = arr2.length-1;i>=0;i++) {
			arr3[z] = arr2[i];
			z++;
		}
		System.out.println(arr2);
		System.out.println(arr3);

				// MyNumbers-->[10,40,50,99,200,3000,5000]
		
			// index		0	1	2	3	4	
	
	*/
		
	for (int i = nums.length-1;i>0;i--) {
		System.out.print(nums[i]+" ");
	}
	
	
	
}
}
