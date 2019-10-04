package Day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUP2 {
public static void main(String[] args) {
	
	/*
	 * 
	 * enter your first  name
	 * mUhTAr
	 * enter your last name
	 * cYbeRTek
	 * 
	 * output
	 * Muhtar Cybertek
	 * 
	 * 
	 */
	Scanner s = new Scanner (System.in);
	System.out.println("Enter your first and last name: ");
	String firstName = s.nextLine();
	//muHtAr
	firstName=firstName.substring(0,1).toUpperCase()
			+firstName.substring(1).toLowerCase();
	System.out.println("Ener your last name: ");
	String lastName = s.nextLine();
	
	String FullName = firstName+" "+lastName;
	lastName = lastName.substring(0,1).toUpperCase();
	System.out.println(FullName);
	
}
}
