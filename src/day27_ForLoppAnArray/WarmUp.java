package day27_ForLoppAnArray;

import java.util.Arrays;

public class WarmUp {
public static void main(String[] args) {
	/*
	 1.Create an int array 
	 called numbers that has length of 100 
	 2.assign 1~100 to the array' each indexes
	 3.use for each loop to print out all 
	 the even numbers.
	 
			
	 */
	
	int [] numbers;
	numbers =new int[100];
	
	for (int i =1;i<=100;i++) {
		numbers[i-1] = i;
		//each value of "i" will be assigned to the index numbers of (i -100)
		//numbers[0] = 1;
		//numbers[1] = 2;
	}
	
	System.out.println(Arrays.toString(numbers));
	
	for (int each : numbers) {
		if(each % 2 !=0 ) { // 1 %2 != 0 ==true
			continue;
		}
		System.out.print(each+" ");
	}
	
	
	
}
}
