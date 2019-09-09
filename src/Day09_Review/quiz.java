package Day09_Review;

public class quiz {

	
	public static void main(String[] args) {
		
	
	//Q1
	boolean a =!false;
				//true
	boolean b = !!!!false;
				// false
	
	//Q2
	boolean result= !false !=("Batch 12" !="Beast Batch Ever");
					//true	!= true
					  // false
	//Q3
	int x = 100;
	int y = x += 100/20; // 105, y= 105
	//xx=x+(100/20) = 105
	//   y=100 +=5 ==> 105
	System.out.println(x);
	System.out.println(105.1>105);// true
	
	//Q4
	//Q5
	boolean A = 128 > '9' || 128 == 127;
			//true		||	   //false
						//true
	//Q6:
	boolean StupidOperators=10>=20 && 'a'>'b';
	System.out.println();
					//               false && false ==> false		
	
	//Q7:
	int num1 = 9999999;
	int num2 = 10;
	System.out.println(num1 * num2 / 10 % num1);
	///						      999999%999999
	
	
	//Q8:
	int x1 = 100;
	int y1 = (byte) 100;
	System.out.println();//
	
	//Q9:
	
	int z = 100;
	System.out.println("Z > 100 is :"); // H is not to find for this line? error
	boolean H = z>100; // false
	
	
	//Q10:
	
	System.out.println(5 + 7 + "8");//128
	
	
	//Q11:
			System.out.println(1 +11 + "3" == "123"); //true
								//12 + "3 == "123"
								//"123"=="123"
			String str = "cybertek";
			str = str + 2019 + true+'A';
			System.out.println(str); //cybertek2019trueA
			
			
	//Q12:
			int numberA = 100;
				numberA+= 300;// 400
				
				System.out.println(numberA++ + " " + numberA); // 401
								// 400	              401       
				
	//Q13:
		int B = 100;
//		int C = B++ + ++B + C +B -- - --B - B; local variables must be initialized
		
		
	//Q14:
		System.out.println((10 * 2) / (5 * 4 ) * 1000 / 10 % 100)
		;
			
	
	
	
	
	}
	
}
