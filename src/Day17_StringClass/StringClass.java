package Day17_StringClass;

import java.util.Scanner;

public class StringClass {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Eter your first and last name");
	String firstName = scan.nextLine();
	String lastName = scan.nextLine();
	String fullName= firstName.concat(" "+lastName);
	
	String fullName2 = firstName +" "+lastName;
	
	String name ="Cybertek" +12+'A'+4.5;
	//String name2 = "Cybertek".concat(12);
	//in concat method you can only give String varuable or String
	
	int num = fullName.length();
	
	System.out.println(fullName2+" contains "+num+" characters");
	int lastIndexNum = fullName2.length()-1;
	System.out.println(fullName2.charAt(lastIndexNum));
	
	
}
	
	
	
}
