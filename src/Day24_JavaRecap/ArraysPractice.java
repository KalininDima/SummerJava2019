package Day24_JavaRecap;

import java.util.Scanner;

public class ArraysPractice {
public static void main(String[] args) {
	
	/*
	 ask user to enter five numbers, 
	 then find the sum of those five numbers 
	 
	 
	 		Must use Array
	 		
	 		
	 */
	
	int [] numbers = new int [51];
	                   
	
	Scanner scan = new Scanner (System.in);
	
	for (int i = numbers.length; i < numbers.length-1; i--){
	System.out.println("Enter a number");
	numbers[i]=scan.nextInt();
	}//assign user inputs to the Arrays indexes
	
	int sum = 0;
	for (int i = 0;i<numbers.length;i++) {
		sum += numbers[i];
	}
	System.out.println(sum);
	
}
}
