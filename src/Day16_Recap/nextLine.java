package Day16_Recap;

import java.util.Scanner;

public class nextLine {
public static void main(String[] args) {
	
	
	
	Scanner scan = new Scanner (System.in);
	//nextLine will take everything in scanner memory
	//(including "Enter") up to new line
	System.out.println("Enter your phone number");
	//12332 Enter
	int pn = scan.nextInt();
	System.out.println(pn);
	
	scan.nextLine();
	
	System.out.println("Enter your name");
	String name = scan.nextLine();
	
	/*
	 * nextLine(); will take everything in 
	 * scanner memory up to new line
	 */
}
}
