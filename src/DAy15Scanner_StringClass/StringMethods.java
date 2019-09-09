package DAy15Scanner_StringClass;

public class StringMethods {
public static void main(String[] args) {
	
	String str = "Cybertek";
	// index num: 01234567
			//charAt(index):
	System.out.println(str.charAt(4));
	
	char ch = str.charAt(4);
	
	System.out.println(ch);
	
	
	
	String str2 = "Mu htar";
	//index numbers: 0123456
	
	
	System.out.println(str2.charAt(4));
	
	
	//length():
	String name = "Donald J Trump";
		System.out.println(name.length());
		//or
		int n = name.length();
		
		
	//concat():
		
		String s1="Cybetek";
				s1.concat("School");//attempt to modify String s1
				//returns a brand new String value
					System.out.println(s1);// string is immutable
					s1 =s1.concat(" School");
					System.out.println(s1);
					
					
	//toUpperCase():
				String N = "cybertek";
					N.toUpperCase();
					
					System.out.println(N); //cybertek , String is immutable
					N=N.toUpperCase();
					System.out.println(N);
				
	// toLowerCase():
				String name1="AdUraHmAn";
						name1.toLowerCase();
					System.out.println(name1);//ABDURAHMAN string is immutable
					
					name1 = name1.toLowerCase();
					
					System.out.println(name1);
					
	//indexOf
					/*
					 * charAt(index),lenght(), concate(str), toUpperCase(),toLowerCase()
					 * 
					 * 
					 */
					
					String a ="Batch 12 Javangers";
					// index: 0123456789.....
						System.out.println(a.charAt(9));
							
							char ch1 = a.charAt(14);
						System.out.println(ch1);
						
						/*
						 * charAt() methods extracts  a specific character 
						 * for t and returns it as char value 
						 */
						
						
				int Lenght = a.length();
				System.out.println(a.length());
				
				
				int HighestInexNum = a.length()-1;
				System.out.println(HighestInexNum);
				/*
				 * length(); method returns the total number of 
				 * character in the String as an int value
				 * 
				 */
				
				
				String b = "Cybertek";
				b.concat(" Batch 12 Javangers");
				// "Cybertek Batch 12 Javangers" 
				System.out.println(b);
				String c = b.concat(" Batch 12 Javangers");
				System.out.println(c);
				
			b=b.concat(" Batch 12 Javangers");
						// "Cybertek Batch 12 Javangers"
			System.out.println(b);
			/* 
			 * .concat() method concates the value to the variable value and then returns 
			 * a NEW String value
			 * 
			 */
			
			String d = "book";
			System.out.println(d.toUpperCase());
			System.out.println( d ); //book
			d=d.toUpperCase();
			
			System.out.println(d);
			/*
			 * toUppersCase() method converts the String value to upper 
			 * case and returns it as a NEW STring
			 * 
			 */
			
			String e = "JAVAAAAAAA";
			e.toLowerCase();
			System.out.println(e.toLowerCase());
			System.out.println(e);
			e=e.toLowerCase();
			System.out.println(e);
			
			String f = e.toLowerCase();
			e = e.toLowerCase();
			System.out.println(f);
			
			/*
			 * toLowerCase(); method converts String value to lower case and returns
			 * it as a NEW String
			 * 
			 */
		
			
}
	
	
	
}
