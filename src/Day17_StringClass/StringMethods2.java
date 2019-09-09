package Day17_StringClass;

public class StringMethods2 {
public static void main(String[] args) {
	
	/*
	 * replace (ola char, new char):
	 * 				replaces all the old char values with the given 
	 * 				new char value in the 
	 * 				String and  returns it as NEW String value
	 * 
	 * 
	 */
	String str1 = "Java is Fun Programming Languaghe";
		str1=str1.replace('a', '1');
		System.out.println(str1);
	
	
	/*
	 * replace (old str, new str):
	 * 		replace all the old str values with the given new str values
	 * 	Returns it as NEW String value
	 * 
	 */
	
	
	String str2 = "Today is gonna be a great day to learn java";
	str2=str2.replace("Today", "Tomorow");
	
	str2 = str2.replace("java", "");
	System.out.println(str2);
	
	/*
	 * replaceFirst(old str, new str):
	 * 				it replaces the first occured old str with the new str int the
	 * 				String and returns it as a NEW String value
	 * 
	 * 
	 */
	
	String s1 = "Java is fun, Java is good";
	s1=s1.replaceFirst("Java", "Python");
	System.out.println(s1);
	
	String s11 = "Java is Fun and great, JAva is good";
	s11 = s11.replaceFirst("Java","Python");
	System.out.println(s11);
	
	
	String  s22 = "Java is programming laguage, Java is Java";
	s22 = s22.replaceFirst("Java is J", "C# is J");
	System.out.println(s22);
	
	
	
	
	
	
	
	
	
}
}
