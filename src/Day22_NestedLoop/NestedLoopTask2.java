package Day22_NestedLoop;

import java.util.Scanner;

public class NestedLoopTask2 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);

	
	
while(true) {
	
	
	System.out.println("Enter two numbers:");
	int a= scan.nextInt();
	int b = scan.nextInt(); // 9 character
	
	System.out.println("Multiplication is" + (a*b));
	System.out.println("Do you wanna continue");
	scan.nextLine();
	String answer = scan.nextLine().toLowerCase();
	while(!(answer.equals("yes")|| answer.equals("no"))) {
	if(answer.contentEquals("no")) {

		break;
	
	}
	}	
}
	
	
	
	/*
	 * calculator program write
	 * Ask the user which math problems wants to resolve:*,/,%,-,
	 * 
	 * then ask user to enter two number
	 * then return the result to the console
	 * and then adk the user if they wanna continue to do another math
	 * 
	 * if==> yes repeat the previous step
	 * if no ==> exit the system
	 * 
	 * 
	 * other wise ==> ask the user to re enter
	 */
	
	
	
	
	
	
	
	
}
}
