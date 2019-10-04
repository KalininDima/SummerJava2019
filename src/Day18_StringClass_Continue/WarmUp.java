package Day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first and last name");
String firstName = sc.nextLine();
String lastName = sc.nextLine();
String initials = firstName.substring(0,1).concat(".")+ lastName.substring(0,1);
initials=initials.toUpperCase();
System.out.println("initials is: "+initials);
	
System.out.println("Enter your first and last name");
firstName = sc.nextLine();
lastName = sc.nextLine();
String initials1 = ""+ firstName.charAt(0) + "."+lastName.charAt(0);
initials1=initials1.toUpperCase();
System.out.println("initials is: "+initials1);


//'A'+'B' ==> 'AB' (Wrong)
//       65+66 = 131  (correct)     
        int FirstNameIndex = firstName.length()-1;
        int LastNameIndex = lastName.length()-1 ;

String LastLetters = ""+firstName.charAt( FirstNameIndex )
          + "." + lastName.charAt( LastNameIndex );
LastLetters  = LastLetters.toLowerCase();

String LastLetters2 = firstName.substring(FirstNameIndex )
            + lastName.substring(LastNameIndex );
LastLetters2    = LastLetters2.toLowerCase();       
        
System.out.println("Last letters are: "+LastLetters2);
    
}
}