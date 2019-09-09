package Day04_Variables;

public class PrimitiveDaaTypes2 {

	/*
	 * Primitives; byte,short, int, long,  float, double, boolean, char
	 * 
	 * boolean : takes either True or False boolean expressions
	 * 
	 * char; declared with in 
	 */
	
	public static void main(String[] args) {
		
		boolean  result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3;
				
		System.out.println(result); //true
		System.out.println(result2); //false
		System.out.println(result3); //true
		
		//char 
		char char1= 'a';
		
		
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#'; 
		
	System.out.println("\n\n");
	
	//char with numbers 
	char char4 =67; //only time we use '' for char is where we are declaring single character
		// prints the character thats corresponding to 67 from ASCII table
	
	System.out.println(char4);
	
	char char5 = 'C'; // prints the character as its
	System.out.println(char5);
	
	char char6 = '{';
	System.out.println(char6);
	char char7 = 123;
	System.out.println(char7); // prints the cgaracter that has the number of 123 from ASCII Table
	
	//initializing char to other primitives: byte, short, int, long, float, double
		char Mychar1 = 'b';
		
		int MyInt = 'b'; // the number that represents b is initalized to the int
		
		System.out.println( MyInt); //98
		
		//byte Mybyte = MyChar1; // char's memory is 2 byte, byte'memory is 1 bytes
		byte MyByte2 = 'b'; //  b' s coresponding numbers of 98
		
		//short ShortNum = MyChar1;
		short ShortNum2 = 'b'; // b' s coresponding numbers of 98 from ASCII Table
		System.out.println(ShortNum2);
		
		long LongNum = Mychar1; // longs memory is 8
		long LongNum2 = 'b' ; //98
		
		System.out.println(LongNum);
		
		float floatNum = Mychar1;
		float floatNum2 = 'b';
		System.out.println(floatNum2); //98.0
		
		double doubleNum = Mychar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2); //98.0
		
	//java is case sensetive; A does not equal to a
		
		char mycharValue = 200;
		System.out.println(mycharValue);
	}
}
