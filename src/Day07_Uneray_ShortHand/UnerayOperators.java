package Day07_Uneray_ShortHand;

public class UnerayOperators {

	public static void main(String[] args) {
		
		
		System.out.println(12.8 / 3l);
		System.out.println(12.8 % 3l);
		
		
		/*
		 * +: positive
		 * -: negative
		 * ++: increment
		 * --: decrement
		 * 
		 * for + & -:
		 * + - ===> -
		 * - - ===> +
		 * + + ===> +
		 * - + ===> -
		 * 
		 * 
		 * increment: increases the value by 1.
		 * 				increment are :
		 * 						1. pre increment:
		 * 							operator is placed before the variable and 
		 * 							increase by 1 immediatly;
		 * 							int num1 = 100
		 * 							++num1;
		 * 									//101
		 * 
		 * 						2. post increment: operator is placed after the variable
		 * 							and it will pass the current vallue first, 
		 * 							then it will be incremented by 1
		 * 								int IntNum = 100;
		 * 								System.out.println(IntNum ++); //100 
		 * 								System.out.println(IntNum); //101 
		 * 
		 * 							
		 * 
		 * decrement: decreases the value by 1.
		 *						1.pre decrement: operator is placed before the variable. 
		 *						Decrase value by 1 immediately
		 * `						int z = 100;
									System.out.println(--Z) //99
		 * 						2.Post-decrement: operator is placed after the variable
		 * 							it will pass curent value first and than decreased by 1. 
		 * 
		 */
		 
		int a = 10;
		int b = -10;
		System.out.println(b);
		int c = + b; // + (-10) ===> 10
		
		System.out.println(c);
	
		int d = -c; // - (-10) ===>10
		
		int f = - (10);
	
		int num1 = 100;
		++num1;
		int num2 = ++num1; //102
		System.out.println(num1);
		
		
		
		int IntNum = 100;
		System.out.println(IntNum ++);
		System.out.println( IntNum );
		
		int IntNum2 = IntNum ++; // IntNum2 = 
		System.out.println(IntNum2);
		
		System.out.println(IntNum);
		
		int x = 100;
		int y = x ++ - 1;
		// y = 100 - 1 = 99
		
		System.out.println(y);
		System.out.println(x);
		
		int z = 100;
		
		System.out.println(--z);//99
		
		int Y = 95;
		System.out.println(Y --);
		
		
		int T = 25;
		System.out.println(++T);//26
		System.out.println(--T);//25
		
		
		
		
		
		
		
		
	}
	
	
	
}
