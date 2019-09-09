package Day16_Recap;

import java.util.Scanner;

public class next_VS_nextLine {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enrer your firsty name");
			String f = scan.next();
			//
	System.out.println("Enter the last name");
		String L = scan.next();
		
		System.out.println("Your first name is"+f);
		System.out.println("Your last name is"+L);
}
}
