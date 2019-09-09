package Day07_Uneray_ShortHand;

public class quiz {
 public static void main(String[] args) {
	
	
	//q1:
	int a = 30;
		// int b = (long) a;
		int b = (byte) a ;
		System.out.println(b); //30

		//Q3; IT IS RULE FROM TOP TO BUTTOM
		
		//Q3:
			System.out.println("RESULT A " +0+1);
						      //"Result A 01"
			System.out.println("; Result B" +(1) +(2));
								//"; Result B12"
 
 
				//Q4:
				System.out.println("5 + 2 = " + 3 + 4);
									//5 + 2 = 34
				System.out.println("5 + 2 = " +(3+4));
									//5 + 2 = 7
 
				//Q5:
				float FloatNum = 100.98765432f;
				short ShortNum = (byte) FloatNum;
				System.out.println(ShortNum);
 
				
				//Q6
				
			//	byte bNum = 200; //error, because byte can be not higher than 127 > -128
				
				//Q7:
				
				int a1 = 200;
				int b2 = 2;
				System.out.println(a1 + b2 - a1 * b2 + a1 / b2); // -98
				
				
				//Q8 : 
				System.out.println((3+2) * 2 / 3 % 2 );
				// 5
				//10
				//3%2
				//1
				
				//Q9:
				//int num1 = 9, num2 = 0, num3 = num1/num2; error can not be diveded on zero
				//System.out.println();
				
				
				//Q10;
				long Lnum = 3_000L;
				double Dnum = (float)Lnum; // narrowing
				int Inum = (short) Dnum ; // int, short, byte
				
				System.out.println(Dnum); // 3000.0
				System.out.println(Inum);
				System.out.println(Inum % 1000);
			
 
				//Q10;
				 double result1 = 10 / 3; //3
				 double result2 = 10.0 / 3; // 3.33332333332323
						 
				//Q12:
				  String str = "10.5" ;
				  //int num = (int) str; // error, string not primimtive
				 
				  //Q13:
				  	int I1 = 10, I2 =20, I3 = 30;
				  			I1 = I1%5; // 10 % 5 = 0, I1 = 0
				  			I2 = I2%5; // 20 % 5 = 0 I2 = 0
				  			I3 = I1*I2; // 0
				  			System.out.println(I1+ "\t" + I2 + "\t" + I3);
				  			
						 
				System.out.println(10 / 3l);
				System.out.println(10 / 3d);
				System.out.println(10 / 3f);
				
				float yy = 10.7f;
				double dd = 10.3;
				
				
 }
		}

		
