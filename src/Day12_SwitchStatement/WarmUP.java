package Day12_SwitchStatement;

public class WarmUP {

	public static void main(String[] args) {
		/*
		 * Warn up:
		 * 
		 * declare 3 numbers
		 * if n1 and n2 are equal ==> n1&n2 are equal
		 * 
		 * if n2 and n3 are equal ==> n2&n3 are equal
		 * 
		 * if n1 and n1 are equal ==> n3&n1 are equal
		 * 
		 * if all equal ==> all equal
		 * 
		 * if none of them are equal ==> none of them are equal
		 * 
		 * 
		 */
		
		int n1=2, n2=3, n3=4;
		
		
		if  (n1==n2 && n1!=n3) {
			System.out.println("n1 and n2 are equal");
		}
		else if (n2==n3 && n2 != n1) {
			System.out.println("n2 and n3 are equal");
		}
		else if (n3==n1 && n1!=n2) {
			System.out.println("n3 and n1 are equal");
			
		}
		else if (n1==n2 && n3==n2) {
			System.out.println("All numbers  are equal are equal");
		}
		else {
			System.out.println("none of them not equal");
		}
		
		
		//2 solution
		
		int a=1,b=3,c=3;
		
		if (a==b&&b==a) { 
			System.out.println("all equal");
		} 
		else if(a==b) {
			System.out.println("a and b are equal");
		}
		else if(b==c) {
			System.out.println("b and c are equal");
		}
		else if (a==c) {
			System.out.println("c and a are equal");
		}
		else {
			System.out.println("all of them not equal");
		}

	
	//3 solution
	   int A=1,B=2,C=3;
		
	   if (A==B && B == C) {   
		   System.out.println("all equal");
	   } else {
		   if(A==B) {
			   System.out.println("A nad B equal");
		   }
		   else if (A==C) {
			   System.out.println("A and C are equal");
		   }
		   else if (C == B) {
			   System.out.println("C and B are equal");
		   }
		   else {
			   System.out.println("none of them are equal");
		   }
	   }
	   //4 solution
	   
	   int A1=1,B1=2,C1=3;
		
	   if (A1==B1 && B1 == C1) {   
		   System.out.println("all equal");
	   } else {
		   if(A1==B1) {
			   System.out.println("A nad B equal");
		   }
		   else if (A1==C1) {
			   System.out.println("A and C are equal");
		   }
		   else if (C1 == B1) {
			   System.out.println("C and B are equal");
		   }
		   else {
			   System.out.println("none of them are equal");
		   }
	   }
	   
	   /*Task
	    * 60~69 =>D
	    * 70~79 =>C
	    * 80~89 =>B
	    * 90~99=>A
	    * 59<=F
	    * 
	    */
	int grade = 220;
	if (grade >=0 && grade <=100) {
	if (grade>=60) {
		if(grade>=90) {
			System.out.println("A");
		}
		else if (grade>=80) {
			System.out.println("B");
		}
		else if (grade>-70) {
			System.out.println("C");
		}
		else { System.out.println("D");
		}
	}else {
			System.out.println("failde");
		}
	}else {
		System.out.println("invalid entry");
	}
	
	
	}
}
