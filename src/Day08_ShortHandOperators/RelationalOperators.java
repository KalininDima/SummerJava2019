package Day08_ShortHandOperators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		
		/*
		 * Relation Operators:
		 * 
		 * > : greater than
		 * >= : greater than or equal
		 * < : less than
		 * <= : less than or equal
		 * == : equal
		 * != : not equal
		 * = :assign
		 * ! : explanation mark in java means the logical opposite
		 * NOT
		 */
		System.out.println(10 > 9); // 
		boolean resultA = 10 > 9 ;
		System.out.println(resultA);
		System.out.println(10 >= 9);
		
		boolean resultB = 10 >= 9;
		System.out.println(resultB);
		
		boolean resultC = 10 <=9; //
		System.out.println(resultC);
		
		boolean resultD = 1100<1200;
		System.out.println(resultD);
		
		boolean resultE = 1000<1000;
		System.out.println(resultE);
		
		boolean resultF = 1000<=1000;
		System.out.println(resultF);
		
		
		//==
		
		boolean resultG =19 == 19;// equal
		
		System.out.println(resultG); // true
		
		// !: not
		
		boolean resultH = 20!=20;
		System.out.println(resultH);
		
		boolean A =!false;
		System.out.println(A);
		
		boolean B = !true ; 
		System.out.println(B);
		
		/*
		 * 
		 * in java:
		 * 		true == true, false ==false
		 * 		!False equal to true, !true equal to false
		 * so therefore :
		 * 
		 * !false does not equal !true and true equal !false
		 */
		
		
		boolean C = !false != !true;
		System.out.println("C " +C);
		
		//boolean D = true = !false;
		//System.out.println(D);
		
		long a = 30L;
		long b = (short) a ;
		System.out.println("L"+b);
		
		//double a1,b1,c1 = 10.5;
		//System.out.println(b1);
		
		
	/*float    a2   =  100.987_6543f;

		short  b2  =  (byte) a2 ;

		byte  c2   = (byte) b2;

		System.out.println(c2);
		
		
		System.out.println(10/3.0);
		
		System.out.println (  (int)(10.0/3)   );
		
		
		int  x =  10;

		int  y =  x++;

		System.out.println( y++  + "  " +  x++  + "  " + y);*/
		
		
		
		boolean c = !false != !true;
		
		// practice! (not)
		
			boolean g = false;
			System.out.println(!g);
			System.out.println(!true == false);
			//              false ==false ==> true
			
		boolean h="Batch12" == "Batch13 " ; // false
		
		System.out.println("batch12" == "Batch12");// true
		System.out.println("cybertek" != "club");// true
		System.out.println();
		
	}
}
