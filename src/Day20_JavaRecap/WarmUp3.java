package Day20_JavaRecap;

import java.util.Scanner;

public class WarmUp3 {
public static void main(String[] args) {
	
	/*
	 4. write a program  that 
	 asks user to enter number 10 times:
	 		1. find the maximum number
	 
	 
	 
	 
	 
	 */
	
	Scanner scan = new Scanner(System.in);	
	int max = 0;
	
	for (int i = 1; i<=5; i++) {
	System.out.println("Enter a number");//1, 2
	int inputNum = scan.nextInt();
	
	if (inputNum>max) {
		max = inputNum;
	}
	
	
	}
	System.out.println("max value is : "+max);
	
	
	
	
	
	
	
}
}
