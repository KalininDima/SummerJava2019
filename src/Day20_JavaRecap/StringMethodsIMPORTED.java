package Day20_JavaRecap;

import java.util.Scanner;

public class StringMethodsIMPORTED {
public static void main(String[] args) {
/*
methods:
substring,indexOf,lastIndexOf,replace,replaceFirst,
equals,equalIgnoreCase,
contains, startsWith, endsWith,
charAt, trim, 
length, concat, isEmpty, toUpperCase, toLowerCase
 
	 
	 */
	
	//substring(): Creating the sub value of the String
	//ending index is excluded
	String str = "Cybertek School";//String literals
	
	str.substring(0, str.indexOf("k")+1);
	System.out.println(str); // cybertek, String is immutable
	str = str.substring(0, str.indexOf("k")+1);
	System.out.println(str); //now is good;
	String str2 = "Cybertek Scool";
		str2.substring(str2.indexOf("S"));
		System.out.println(str2); //school
		
		
		//--------------------
		//indexOf():returns the firrst occured values index number
	String s1 = "Java is a fun language, I Love java";
	System.out.println(s1.indexOf("a")); //1
	System.out.println(s1.indexOf("ag")); //19
	
	//-----------------
	
	//lastIndexOf(): returns the last occured chars index num
	System.out.println(s1.lastIndexOf("a"));//40
	
	System.out.println(s1.indexOf("ava"));//38
	
	System.out.println(s1.indexOf("ava,"));//32
	
	//---------------
	//replace :replaces the old value with the new one
	String name = "Cybertek School Betch 12";
	int length = name.length();
	System.out.println(length);
	
	name=name.replace(" ", " ");
	System.out.println(name.length());
	
	name = name .replace("e", "a");
	System.out.println(name);

	name = name.replace("School", "Family");
	System.out.println(name);
	
	//-------------------
	
	//replaceFirst:replaces the first occured old character with the new value
	
		String A1 = "Java is Fun, Java is object oriented";
		A1= A1.replaceFirst("Java","C++");
		System.out.println(A1);
		
		String A2 = "Java is Fun, Java is object oriented";
		A2= A2.replace("Java is o","C++ is o");
		System.out.println(A2);
		
		String A3 = "Java is Fun, Java is object oriented";
		A3= A3.replace("Java is o","C++ is o");
		System.out.println(A3);
		//---------------
		
		
		//==, .equals();, equalIgnoreCase();
		
		
		String R1 = "Cybertek"; // String pool
		String R2 = new String ("Cybertek");  //heap
		String R3 = new String ("cybertek");//heap
		System.out.println(R1==R2); //false,diferent locations
		
		System.out.println(R1.contentEquals(R2));//true, visible texts are same
		
		System.out.println(R1.equals(R3));// false, case sensitivity
		
		System.out.println(R1.equalsIgnoreCase(R3));
		//true, it checks the visible text without case sensitivity
		
		//---------------------------
		
		//trim(): remove the unused spaces
		
		String spaces = "       M         ";
		spaces=spaces.trim();//"M"
		System.out.println(spaces);
		
		String N1 = "    ";
		N1 = N1.trim();
		System.out.println(N1.isEmpty());//true
		String N2 = "Tommorrow is gonna be a great day to do repl.its";
		N2 = N2.trim();
		System.out.println("N2");
		N2=N2.replace(" ","");
		System.out.println(N2);
		
		
		//----------------
		
		//charAt(index): returns a specific character from String
		String C1 = "Cybertek";
		//`			 01234567
		char ch=C1.charAt(4);//r
		System.out.println(ch);
		
		String C2 = " Please do more and more java practices tommorow";
		char ch2 = C2.charAt(C2.lastIndexOf("w"));
		System.out.println(ch2);
		
		
		String sentences = "ABCDEFGEWRTWE";
		System.out.println(sentences.charAt(0));
		System.out.println(sentences.charAt(sentences.length()-1));
		
		String result = ""+sentences.charAt(0)+sentences.charAt(sentences.length()-1) ;
		System.out.println(result);
		
		//-------------------
		
		//startsWith & endsWith: 
		//returns boolean, checks the starting and ending values
		String Gmail = "cybertekSchool@gmail.com";
				boolean R = Gmail.endsWith("@gmail.com"); //true
		 System.out.println(R);
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter email address:");
		 String GmailAddress= scan.nextLine().toLowerCase();
		 if (GmailAddress.endsWith("@gmail.com")){
			 System.out.println("Its valid email address");
		 } else { System.out.println("invalid email address");
		 }
		 
		 
		 //starts with www.
		 System.out.println("Enter a web Address");
		 String URL = scan.nextLine().toLowerCase();
		 if(URL.startsWith("www.") && URL.endsWith(".com")) {
			 System.out.println("its a valid web address");
	
		 } else {
			 System.out.println("its invalid web address");
		 }

		 
		 //------------------
		 
		 //contains:checks if the given value contained in the String object.
		 //returns boolean
		 
		 String salary = "1000$";
		boolean $ = salary.contains("$");
		System.out.println($);
		
		
		//------------
		
		 //concat:concates two String values:
					String SchoolName="Cybertek";
					SchoolName=SchoolName.concat(" School");//"Cybertek School
					System.out.println(SchoolName);
				
		 String schoolName2 = "Cybertek "+1231; //"+"concates any value to the String
		System.out.println(schoolName2);
		 
		 
}
}
