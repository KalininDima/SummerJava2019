package Day16_Recap;

import java.util.Scanner;

public class nextline2 {
public static void main(String[] args) {
	/*
	 * write a program that acepts zip code , city, phone number
	 * 
	 * and then displayed all those gathered information
	 * Do not use next() method
	 */
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ener your zip code");
	int z = sc.nextInt();
	
	//21234 Enter
	System.out.println("Enter your city");
	sc.nextLine();
	String c = sc.nextLine();
	
	System.out.println("Enter your phone number");
	int p = sc.nextInt();
	

	
	System.out.println("Enter state name");
	sc.nextLine();
	String s = sc.nextLine();
	
	System.out.println("Your state " + s);
	System.out.println("zip code is " +z);
	System.out.println("City name is "+c);
	System.out.println("Your phone number "+p);
	
}
}
