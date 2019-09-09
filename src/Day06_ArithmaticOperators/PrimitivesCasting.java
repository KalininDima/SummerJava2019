package Day06_ArithmaticOperators;

public class PrimitivesCasting {

	
	
	
	/*
	 * Casting: converting larger primimtive to smaller size
	 * 				datatype variable = (datatype) value
	 * 				
	 * 				castings ; Explicit & implicit
	 * primimtive:byte,short,int,long,float,double
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int a = 10;
		byte b = (byte)a; // explicit casting
		
		
		double DecimalNumber = 10.5;
		float FloatNumber = (int) DecimalNumber; // double > float причем тут инт??
				// FloatNumber = 10;
		
		System.out.println(FloatNumber);
		
		long LongNum = 300L;
		
		//	int intNum = (int)LongNum;
		int intNum = (short)LongNum;
		
		System.out.println();
	//	implicit cssting:
						byte ByteNum = 100;
						int IntNum2 = ByteNum;
						
							//same with:
						int intNum3 = (int) ByteNum;
						
		short ShortNum = 100;
		long longNum = ShortNum;
				//same with;
		long longNum2 = (long) ShortNum;
		
		
		
		
		// explicit casting ptactices:
				double LargestNumber = 100.8765;
						
						byte byteNum = (byte) LargestNumber;
					//100
			System.out.println(byteNum);		
		// 100
			
			 //float FloatValue = (short) LargestNumber;
			// почему десятичная дробь! 100.0
			float FloatValue = (float) LargestNumber;
							//	100.8765F
			float FloatValue2 = (int) LargestNumber;
			float FloatValue3 = (short) LargestNumber;//100
			float FloatValue4 = (long) LargestNumber;
			System.out.println(FloatValue);
			float FloatValue9 = 100;
			float FL = (short) FloatValue9;
			// short SN = 100f;
			// System.out.println(FL + SN);
			
			float FloatNumber2 = 500.67F;
			int myNumber = (short) FloatNumber2;
			System.out.println(myNumber);
			/*
				int Num1=100;
				int Num2 =200;
				int Num3 =300;
			*/
		
			//same example
			int Num1=100 , Num2=200, Num3 = 300;
			
			boolean result;
			// System.out.println(result); error
			
			char Character1 = 'A' ;
	}
	
	
}
