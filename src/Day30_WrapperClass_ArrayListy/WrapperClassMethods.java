package Day30_WrapperClass_ArrayListy;

public class WrapperClassMethods {
public static void main(String[] args) {
	
	
	 
	/* useful methods of Wrapper class:
	 Max_Value
	 Min_Value
	 parse methods:converts string values to primitives and its case sensetive
	 ValueOfmethods: converts String values to Wrapper class values and its case sensetive
	 */
	
	//max_Value:returns the maximum value of the primitives
	
	
	int maximum = Integer.MAX_VALUE;
	
	System.out.println(maximum);
	
	
	double maximum1 = Integer.MAX_VALUE;
	
	System.out.println(maximum1);

	byte maximum2 = Byte.MAX_VALUE;
	
	System.out.println(maximum2);
	
	char maximumChr = Character.MAX_VALUE;
	System.out.println(maximumChr);
	
	char ch = 12345;
	System.out.println(ch);
	
	
	// min_Value:returns the minimmum value of primitive
	
	int minimum = Integer.MAX_VALUE;
	System.out.println(minimum);
	
	byte minimum1 = Byte.MIN_VALUE;
	System.out.println(minimum1);
	
	
	//parse methods: converts String values to primitives,
	//returns the value as primitives
	//		perseInt("strValue"): takes the String and 
	//		converts the string to int
	
	Integer num1 = Integer.parseInt("123"); //auto-boxing
	
		System.out.println(num1+1);
	
		int num2 = Integer.parseInt("125"); //none
		System.out.println(num2+1);	
		
		//parseByte("strValue"): takes the string and 
		//converts the String value to byte
		
		int mum3=Byte.parseByte("19"); // but not more that can 
		//takes byte data type (128)
		
		System.out.println(mum3 +1);
		
		byte num3 = Byte.parseByte("18");// none
		
		Byte num4 = Byte.parseByte("18");// auto-boxing
		
		//parseShort("strValue"): takes the string and converts 
		//it to short primitives value
		
		short num5 = Short.parseShort("200");
		Short.parseShort("200");
		System.out.println(num5+1);
		
		Short num6 = Short.parseShort("200"); //auto-boxing
		System.out.println(num6+1);
		
		
		//parseLong ("strValue): takes string value and
		//converts to long primitive
		
		int num7 = (int)Long.parseLong("1222");
		long num8 = Long.parseLong("1222");
		System.out.println(num7);
		System.out.println(num8);
		
		//parseFloat("strValue"): takes string value and converts 
		//it to float primtive
		float num9 = Float.parseFloat("12.5"); //none
		System.out.println(num9);
		
		Float num10 = Float.parseFloat("12.5");//Auto-boxing
		
		System.out.println(num10 +1);
		
		//parseDouble("strValue"); takes string value
		//and converts it to double primitive
		
		float num11 = (int)Double.parseDouble("4.3332");
		Double num12 = Double.parseDouble("4.3332");
		System.out.println(num11);
		System.out.println(num12);
		
		double num13 = Double.parseDouble("3.32");
		System.out.println(num13);		
				
		Double num14 = Double.parseDouble("8.3");
		System.out.println(num12);
		
				
		//parseBoolean("strValue"):takes string value and 
		//converts to boolean primitives
		
		boolean A = Boolean.parseBoolean("CybertekBatch12");
					//any string values other than will return false
		
		System.out.println(A);
		
		boolean B = Boolean.parseBoolean("True"); //method ignores the case sensetivity
		System.out.println(B);
		
		boolean C = Boolean.parseBoolean("10>9");
		
		boolean D = Boolean.parseBoolean("True");
		
		//=========================
		
		int a = 10;
		double b = a;
		
//		Double c = a;// Double wrapper class is only Dedicated to double primitive
		
		int A1 =(int)Byte.parseByte("19");
		
		Short A3 = (short)Double.parseDouble("10.9");
		
		int A5 = 100;
		Float A6 = (float)A5; // Float wrapper class is only dedicated to float
		
		//ValueOf methods : converts String value to Wrapper class values
		
		int z = Integer.valueOf("1234"); //unboxing
		Integer z1 = Integer.valueOf("1234"); //none
		
		Integer z2 = (int)Integer.valueOf("1234"); //auto-boxing
		
		System.out.println(z2);
		
		boolean result1= ! Boolean.valueOf("TRue");// unboxing
		System.out.println(result1); // valueOf methods ignores the case sensitivity
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
