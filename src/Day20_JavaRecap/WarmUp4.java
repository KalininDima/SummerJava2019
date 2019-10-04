package Day20_JavaRecap;

import java.util.Scanner;

public class WarmUp4 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	 int min = 9999999;//store the minimum user input value
	 for (int i = 1; i<=5; i++) {
		 
		 System.out.println("Enter a number");
		 
		 int inputNum = scan.nextInt();//100,50, 2000,-999
		 if (inputNum<min) {
			 min = inputNum;
			 
		 }
		 System.out.println("min value is"+min);
		 }
	
	
	
	
	
	
}
}
