package Day05_Recap;

public class Primitives_review {

	/* 
	 * 		Primitives:
	 * 			byte: only takes whole number
	 * 			shirt: only takes whole number
	 * 			int (used mor often): only takes whole number
	 * 			long: only takes whole number
	 * 
	 * 			float: can take decimals (MUST have F or f at the end 
	 * 			double: can take decimals
	 * 
	 * 			boolean: true or false boolean expression
	 * 
	 * 			char: character within single quote '' takes numbers as well.
	 * 
	 * 			Range : double > float > long > int > short > byte
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
			
		
	//	System.out.println(bNum); //java application are executed from top to bottom
			byte bNum = 127;
				// byte range: -128 to 127
			//byte bNum2 = 126.5; //byte only takes whole numbers
			
			short sNum2 = 1000;
			// short sNum = 126.5; //short only takes whole numbers
			
			// bNum = sNum2; // short is greater than byte
			
			sNum2 = bNum; //sNum2 = 127 
			System.out.println(sNum2);
			
			short sNum3 = 127;
		//	byte bNum = sNum3; short > byte
			
			int intNum = 1000;
			
			//int intNum2 = 100.5; // int takes whole numbers
			
			// byte ByteNum = intNum; // int > byte
			   //short ShortNum = intNum: // int > short
				 short ShortNum2 = 105;
				 intNum = ShortNum2;
				 
				 System.out.println(intNum);
				 
			long LongNum = 100l;
			long LongNum2 = 100L;
			
		//	byte ByteNum3 = LongNum;
		//	short ShortNum4 = 100l;
		//	int IntNum3 = 100L; long > int, byte, short
			
			byte a = 10;
			int b = 30;
			short c =40;
			
			long LongNumber = a;
			long LongNymber2 = b;
			long LongNumber3 = c;
			
			
			// float:
			
				float floatNumber = 10.5f;
				float floatNumber2 = 20.5f;
			
					
				 short a1 = 10; byte b1=20; long c1= 30; int d1 = 40;
				 
				 float Floats = a1;
				 float Floats2 = b1;
				 float Floats3 = c1;
				 float Floats4 = d1;
				 
			// double: takes all the whole and decimal numbers
				 	double DoubleNum1 = 10L; // long is smaller than double
				 	
				 	double DoubleNum2 = 10.5F; 
				 
				 	
			// boolean:
				 	boolean result = true;
				 	boolean result2 = false;
				 			
				 	boolean result3 = 9 > 10;
				 	
				 	
				 	char specialChar = 55000;
				 	System.out.println(specialChar); // output sign i;
				 	
				 	
				 	
				 	// practice:
				 	
				 	/*
				 	 * 8, 9,  #,   @,  8.5 , 5.5F, 128, 4000, 9 > 10, true, false.
				 	 * 
				 	 * 
				 	 * 
				 	 */
				 	
				 	//8 and 9:
				 	byte Bnum = 8; short sNum = 8; int INum = 8; long lNUM = 8L; float FNum = 8f;
				double Dnum = 8;
				char character = 8; 
				 	
				 	
				 	System.out.println(Bnum); //8
				 	System.out.println(sNum); //8
				 	System.out.println(lNUM); //8
				 	System.out.println(INum); //8
				 	System.out.println(FNum); //8.0
				 	System.out.println(Dnum); //8.0
				 	System.out.println(character); //8
				 	
				 	//# & @
				 	char character2 = '@';
				 	char character3 = '#';
				 	
				 	System.out.println(character2);
				 	System.out.println(character3);
				 	
				 	
	
	
				
				 	
				 	
	
	}
	
	
}
