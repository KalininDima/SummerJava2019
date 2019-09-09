package Day08_ShortHandOperators;

public class ShortHand {

	/*
	 * 
	 * += : addition assignment: x+=y ==> x=x+y
	 * -= : subtraction assignment: x-=y ++. x=x-y
	 * *= : multiplication assignment: x *= y ==> x =x*Y
	 * /= : division assignment: x /= y ==> x +x/y
	 * %= : Remainder assignment: x % y ==> x %=y;
	 */
	
	public static void main(String[] args) {
		
		
		//+=;
		int a= 9;
		
		//a = a + 3 ;// 12
		 a += 3; // a = a +3
				 
		System.out.println();
		
		double b = a += 5;
			//12 += 5 ==> 12 +5 = 17
		System.out.println(b);
		System.out.println(a);
		
		
		int c = a+=b; // a=34 c =34 b=17
		// 17 += 17 = 34
		
		System.out.println(c);
		
		int d = a+= c  ; // a=68, d=68, c=34, b=17
		
		int e = (d+=b) * 2; //170
				
		System.out.println(e); // d =85, b=17, e=170;
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		
		double f = b  +=d * 2;
		System.out.println(f);
		
		int g = 101;
		int h = g -= 1;
					//101 -=1 ==> 100		
		System.out.println(h);
		
		
		int i = g+= h+5;
		// 100 + 100 + 5 ==> 205
		System.out.println(i);
		
		int j = h+= g % i ; // h =100, j = 100
		//  100 += 205 % 205
		//100 += 0
		
		System.out.println(j);
		
		
		int k = j -= h * 2 % 5; // j=100
		// j -=200%5
		System.out.println(k);
		
		
		// *=: 
			int A = 100;
			A *= 200;
			System.out.println(A);
			//A = 20000
			
			int B = 100;
			B *= 100/10;
			
			System.out.println(B);
			
			B *= B-=1000;
			System.out.println(B);
			
			
			//  /=:
				int C = 1000;
				C/=5;
				System.out.println(C);
			int D = 10;
			//c /= D -10; denominator cant be zero
			System.out.println(C); // C = 200
			
			C /=D+10; // C / 20 ==> 200/20 ==> 
			System.out.println(C);
			
			// %=: 
			int z = 10%3;// ==> 10/3 = 3.... remainder: 10 - 3*3 = 1
			int E =10;
			E%=2; //e = 10%2
			System.out.println(E);
			
			int F = 100;
				F %=2; // F = F%2; ==> 0
			System.out.println(F); // if its 0 it means its even number
			
			
			
			System.out.println(-100%3);
			System.out.println(10.5 % 3 );
			
			
			int J = 300;
			int K = 10;
			
			J += J%= K;
			System.out.println(J);
			
			
			
			
	}
}
