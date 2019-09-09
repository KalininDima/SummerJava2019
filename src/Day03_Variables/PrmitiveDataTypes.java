package Day03_Variables;

public class PrmitiveDataTypes {
/*
Byte: we can assign numbers thats no  decimal (whole numbers).  -128 < byte < 127

Short: we can only assign whole numbers. Must be with in -32768 < short < 32767

int: we can only assign whole number. Must be in -2147483648 < int 2147483647

long: we can only assign whole number. Must be within -9223372036854775808 < long <9223372036854775807,
 at the end of value we can give l or L
 	byte < short < int < long
	small one can be assigned to larger one
	
	the variables dataType must be larger in order to contain another datatype
	
float: we can assign decimals.
	(Decimals MUST HAVE f OR F LETTER at the end)
	
Double: (used more often): we can assign decimals.

	float < double

*/ 

	
	
	public static void main(String [] agrs) {
		byte lenght = 3;
		System.out.println(lenght);
		
		byte Width = 4; 
		
		//byte 9num = 100; its must start from a-z.
		
		byte num_and$ = 90; //not allowed any specials characters in name of Variable
		
		//byte num2 = A - only digits in value of variable
		
		//byte lenght =3; variable name must be unique
		
		//byte Public = 199; variable name cannot be java reserved words "Public" its reserved word
		
		
		//byte myNum1 = -129; //out of byte' range
		
		byte mynum2 = 127;
		
		short num2 = 1000;
		
		// short num2 = &; we can only assign whole numbers
		
		short num3 = 10000;
		
		int num4 = -1111111;
		// 100,000,000 (comas not allowed )
		int num5 = 1_000_000_00; //easier to read
		
		long LongNumber = 10L;
		
		//int inNumber = 10; 
		
		byte byteNumber = 10;
		short shortNumber = byteNumber;
		
		short shortNumber2 = 28;
		// byte bytenumber2 = shortNumber2; short is greater than byte
		
		int intNumber = -19876;
		long longNumber2 = intNumber; //long is greate than int
		
		//left side of the = has  to be equal or greater than the right side of =
		
		//int exampleNum1 = 10.5
		float exampleNum2 = 10.5f;
		float exampleNum3 = 30.4F;
				
		double doubleNumber = 10.5;
		
		
		double doubleNumbder2 = 30.2;
		
		// float floatNumbder4 = doubleNumbder2 ; double datatype is larger than float

		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
	
		
		
		float fNum = bNum;
		float fNum2= sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		
		
		double dNum = bNum;
		double dNum2 = sNum;
		System.out.println(dNum);
		
		
	}
}
