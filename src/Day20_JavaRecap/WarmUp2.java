package Day20_JavaRecap;

import java.util.Scanner;

public class WarmUp2 {
public static void main(String[] args) {
	/*
	 1.Write a program that asks user to enter number 10 times:
	 		-find the sum of those 10 inputs
	 		-find the maximum number and the minimum number
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	
	//its for 10 times
	for (int i = 1;i<10; i++) {
		System.out.println("Enter your number");
		int inputNum = scan.nextInt();
		sum+=inputNum;
		
	}
	System.out.println("sum is: "+sum);
	
	//its for 1 number
	System.out.println("Enter your number");
	int inputNum = scan.nextInt();
	sum+= inputNum;
	
	
	
	
	
	
}
}
