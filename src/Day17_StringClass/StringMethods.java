package Day17_StringClass;

public class StringMethods {
public static void main(String[] args) {
	
	// ==
	String str1 = "Hello Javangers";
	String str2 = "Hello Javangers";
	boolean R1 = str1==str2;
	System.out.println(R1);
	
	String str3 = new String ("Hello Javangers");
	String str4 = new String ("Hello Javangers");
	boolean R2= str3 == str4;
	
	boolean R3 = str1 == str3;
	
	/*
	 * 
	 * Methods:
	 * 1.concat,2.length,3.CharAt, 4. toUpperCase
	 * 5.toLowerCase
	 */
	//concat(str) : it takes String, 
	//and combines the two Strings and returns it as new String Value
	
	String a = "Cybertek";
	a=a.concat(" School");//Cybertek School
	//a.concat(" School"); //Cybertek
	
	String A = "hello", B="hello ";
	System.out.println(A==B); // false, different value, B has a space.
	String C = "Hello", D = "hello";
	System.out.println(C==D); //false , case sensetivety

	
	/*
	 * 
	 * length(): it returns the total number if the characters as an int
	 * 
	 */
	String LongName="ABCDEFGDSGSSAFDG";
		int num = LongName.length();
			System.out.println(num);
	
			/*
			 * charAt(indexNum): it returns the character
			 *  of the index number as a char value
			 * 
			 */
			
			String name5="Muhtar";
			//index:	  012345
			char ch = name5.charAt(5);
			System.out.println(ch); // 5 is r index
			
			
			
			/*
			 * toUppersCase(); converts the String vallue
			 *  to Upper case, and returns it as NEW String value
			 * 
			 * 
			 * 
			 * 
			 * toLowerCase();converts the String vallue
			 *  to Lower case, and returns it as NEW String value
			 * 
			 * 
			 */
			
			
			String name2 = "cybertek";
				name2.toUpperCase();
				System.out.println(name2);//cybertek
			
				name2=name2.toUpperCase();//CYBERTEK
				System.out.println(name2);
				
			String name3 = "CYBERTEK";
					name3.toLowerCase();
			System.out.println(name3);//"CYBERTEK";
			
					name3=name3.toLowerCase();
			System.out.println("name3");//cybertek
			
			
			
			
			/*
			 * trim(): its used for removing the unused spaces
			 *returns a NEW String value
			 */
			
			
			String s1 = "			hello   ";
					s1.trim();
					System.out.println(s1);
					
					s1 = s1.trim();
					System.out.println(s1);
					
					
					String s2 = "Cybertek		School";
					s2=s2.trim();
					System.out.println(s2);
					
					
					
					String s3="    ";
							s3 = s3.trim();
							System.out.println(s3);
							
					String s4 = " 	Cybertek	School";
					s4 = s4.trim();
					
					
					/*
					 * subdtring (begginning index):
					 * 				it creates sub value of the String 
					 * 				from the beginning index till the last index
					 * 				returns it as a new String value
					 * 
					 */
					
					String str = "Cybertek School";
					//			  0123456789101112
					
					String  Str2 = str.substring(9);
					
					System.out.println(Str2);
					
					//or
					String  Str = str.substring(9);
					
					
					
					String Address = "Mclean VA 22000";
					//                0123456789...
					String zipcode = Address.substring(10);
					System.out.println(zipcode);
					
					/*
					 * substring(beginning index, ending index):
					 * 			it creates the sub value of the String from
					 * beginning index till the ending index
					 * (ending index num will be excluded)
					 * then returns it as a NEW String value
					 * 
					 */
							
			String Name = "Hello Cybertek School";
					Name=Name.substring(6, 13);//??
						System.out.println(Name);
						
						
						String fullName = "Cybertek School Batch12";
						//				   012345678910111213141516
						String middleName = fullName.substring(9,14+1);//School
						System.out.println(middleName);
						
						/*
						 * replace (old char, new char);
						 * 
						 * 
						 * ;
						 */
}
}
