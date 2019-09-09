package Day06_ArithmaticOperators;

public class ArithmaticOperators {

	/*
	 * +: addition, adds two numbers together
	 * -: subtraction, subtracts a number from another number
	 * *: multiplcation, multiplies
	 * /: devision,devides 
	 * 
	 * %: remainder, returns the remainder from division
	 */
	public static void main(String[] args) {
		
		int a=100;
		int b = a - 400; //-300
		System.out.println(b);
		int c = a + b ; //100 + -300 = -200
		System.out.println(c);
		
		
		int X =3, Y =5, Z = X * Y;
		
	System.out.println(Z);
		
	double Length = 100, Width = 10, Area = Length / Width;
	System.out.println(Area);
	
//	double resultNum = 9 / 0; //denominator cannot be zero
	
	
	double Num1 = 10/3f; //if without f, will be just 3.0.n 
	double Num2 = 10.0 / 3;
	double Num3 = 10 / 3;
	System.out.println(Num1 + " " + Num2+ " "+ Num3);
	
	
	int output = 12 + 6 / 3;
	System.out.println(output);
	
	
	
	System.out.println(5 + 2 * 4);
	int city1 = 212;
	int city2 = 3232;
	int city3 = 4343;
	
	System.out.println(city1 + "\n" +city2+ "\n" +city3);
	
	
	/* 10/3 ==> 3 with remainder of 1
	 * 12/5 ==> with remainder : 12 - 5*2 = 2
	 * 
	 * 20/3 ==> 6 : 20 - 6 * 3 =2 
	 * 
	 */
	
	int result = 10 % 3;
	System.out.println(result);
	
	/*
	 * 20,45,65,67,68
	 * even: can be devided by 2 without a remainder
	 * odd: devided by 2 , will have remainder
	 * 
	 */
	
	
	int number20 = 20 % 2; // even
	int number45 = 45 % 2; // odd
	int number65 = 65 % 2; // odd (65 - 32 * 2 ) = 1
	
	
	System.out.println( 4 + 17 % 2 -1 );
	System.out.println(number65);
	
	// come first VIP : % * / and ()
	//highest (),% * /, + - 
	
	
	System.out.println(3 + 4 * 4 + 5 * (4 + 3 ));
						//3 +4 * 4 + 5 * 7
						// 3 +16 + 35
						//19 + 35 = 54
	
	//    %: 
			// 10/4 ==> with remainder of (10 - 2 * 4 ) = 2

	System.out.println(10 % 4);//2
	
	System.out.println((4 +17)%2-1); //0
	
	
	}

	
}
