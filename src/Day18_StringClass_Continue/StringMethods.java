package Day18_StringClass_Continue;

public class StringMethods {
public static void main(String[] args) {
	
	/*
	 * 
	 * indexOf(str): returns the index number of the first
	 * occured character in the given String
	 */
	
	String A1 = "Batch 12 is a great batch";
	//
	int num = A1.indexOf("g");
	System.out.println(num);
	A1.indexOf("g");
	
	int num2 = A1.indexOf("eat"+2)+2;//eat2
	//negative number means the str is not exist in the String
	System.out.println(num2);
	
	
	String B1 = "today is tuesday, today we have class in the afternoon";
			int n1 = B1.indexOf("te");
			System.out.println(n1);
			
			
			
			String Address=" 7925 Jones Branch Dr, Mclearn, VA 22003";
			int beginIndex = Address.indexOf(",")+1+1;
			int endingIndex=Address.indexOf(", V");
			
			String cityName = Address.substring(beginIndex, endingIndex);
			System.out.println(cityName);
			
			String email = "RandomEmails@gmail.com";
			int begin2 = email.indexOf("@")+1;
			int end2 = email.indexOf(".");
			String emailType = email.substring(begin2,end2); 
			System.out.println(emailType);
			
			
			/*
			 * lastIndexOf():returns the last occured character' index
			 * number as and Int Value
			 * 
			 */
			
			
			String str = "ABCDABCD";
			int n2 = str.indexOf("B");
			int n3 = str.lastIndexOf("B");
			System.out.println(n2);
			System.out.println(n3);
			
			String myemail = "Myemail.school@gmail.com";
			int Begin = myemail.indexOf("@")+1;
			int End = myemail.lastIndexOf(".");
			String myEmailType = myemail.substring(Begin, End);
			System.out.println(myEmailType);
			
			
		
			
}
}
