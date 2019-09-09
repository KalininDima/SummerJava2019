package Day05_Recap;


public class Concatenation {
	
	
	public static void main(String[] args) {
		
		
	/*
	 * String: represents the sequence of characters, used for storing text
	 * 	string valuse are surrendered by a double quote
	 * String: char sequences, declared within "" used 
	 * concatenation: combinig, linking things together  ==> creates a String  achived by 
	 * using + operator
	 */
		
		
		String str = "any text";
		
				System.out.println(str);
		
		
		String str2 = "1";
				System.out.println(str2);
				
				
				
		String myName = "CybertekScholl" + "Shool";
		
		System.out.println(myName);
		
		String Year = "This is " + 2019;
		
		
	//Example;
			String name = "Dima";
			System.out.println("My name is " + name);
 
			
			/*
			 * cucumber is variable name $
			 * tomato is variablename $
			 * 
			 */
			
			int cucumber =3;
			
			int tomato = 5;
			
			System.out.println("cucumber is " + '$'+ cucumber); // "cucmber is $3"
			System.out.println("Tamato is " +'5'+ tomato);
			
			String newStr = "100"+10;
			System.out.println(newStr);// 10010
			
			
			System.out.println(1 + 2 + 3);// 6
			
			
			System.out.println("1" + 2 + 3);// "12"+3 ==> 123
			
			//System.out.println("1" - 2 + 3);// "11" - 3
			
			
			System.out.println("Batch 12"+1+2); //"Batch 121"+2 => batch 1212
			
			System.out.println(2-1+1+"4"); // 24
				System.out.println("Batch 12" + (1+2) );
				//					"Batch 12" + 3 ==> Batch 123
				
			System.out.println(1+ "123" +4+5);
							// 1123 + 4+ 5 ==> 112345
			System.out.println("123" + (4+5) ); // 1239
			
			System.out.println(1+ ("1" +2)); //1 + "12" = > 112
			
			System.out.println(4+3-(9+3));
			//7 - 12 ==> -5
			
			System.out.println((1+2) + "3");
			
			//System.out.println((1+2) - "3");
			// 3 - "3" ==> err
			
			String BookName = "Like book \' gema of throne\'";
					System.out.println(BookName);
					
			String MyInfo = "My Name is: n\t\tCybertek";
			System.out.println(MyInfo);
			
			System.out.println('3'+3);
								// 51 + 3 ==> 54
			
			System.out.println("3" + 3); // 33
			
			System.out.println("3"+'3');
			//if we concat char to String, 
			//char is concated as character
			//					"3" +51 = 351
			
			
			
			System.out.println(12+'3');// 63
			
			System.out.println(2+3); //5
			System.out.println('7' + 3); // 55 +3
			
			System.out.println('7' + 9); // 64
			
			
	}

}
