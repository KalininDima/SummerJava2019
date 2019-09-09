package DAy15Scanner_StringClass;

public class StringClass {
	public static void main(String[] args) {
		
	
 String str = "Cyber";
 String A = "Cyber";
 String B = "Cyber";
 //System.out.println(A==B);
 
 String str2 = new String("Cyber");
 
 
 System.out.println( str == str2);
 
 
 String str3 = new String ("Cyber");
 
 System.out.println(str2==str3);
 
 String s1 = "cat";
 String s2 = "cat";
 System.out.println(s1==s2);//Same memory locations
 
 String s3 = new String ("cat");
 String s4 = new String ("cat");
 
 System.out.println(s3==s4);// different memories locations
 
 System.out.println(s1==s4);//different memory locations
 
 
 String a = "Batch12";
 String b = "batch12";
 System.out.println(a==b);// false
 
 String c = new String ("cybertek");
 String d = new String ("Cybertek");
 System.out.println(c==d);
 
 
 
 
	}
		 
}
