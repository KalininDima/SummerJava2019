package Day13_Review;

public class QuizReview {
	public static void main(String[] args) {
		
		//Q1:
		
		if (!true != !false){
			// false!=true==>true
			System.out.println("Cybertek");
		}else {
			System.out.println("Batch 12");
		}
		//Q2:
		boolean resultA= 9>=9 || 10<=10,
				resultB='A'>=128&&'B'<128;
		//resultA = true || true=> true
			// resultB= false && true => false
		if (resultA) {
			if (resultB ) {
				System.out.println(resultA);
			} }else {
				System.out.println(resultB);
			}
		//false
		
		//Q3:
		if(true) {
			
		}else if (false) {
			
		}// else block not mandatory
		
		//if(true) {
			
		//}else {
			
		
		//Q4:
		int num=9;
		if(++num <10) {
			System.out.println(num+"Helloworld");
		}
		else {System.out.println(num+"Hello Universe");
		
		}
		
		
		//Q5:
		int x=1,y=0;
		
		if (x++>++y) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Welcome");
		}
		System.out.println("Log" +x+":"+y);
		
		//Q6:
		//Q7:
		boolean result = true;
		int N = 100;
		if (result) {
			N/=10;	
		}
		
		//Q8:
		
		boolean X = true;
		if(X==false) {
			System.out.println("one");
			//true==false==>false
		}else if(X== false != true) {
			System.out.println("Twoe");
		}
		
		else if (X == true) {
			System.out.println("Three");
		}
		else if (X!=false) {
			System.out.println("Four");
		}
		
		//Q10:
		int n='B'; // corresponding number of the character
		//n=66
		System.out.println(n);
		System.out.println('B'); // char printed that it is
		
		if (n>128 || n <=129) {
			//false || true ==> true
		}
		else {
			System.out.println('A');
		}
		
		//tasks
		
		
		
		
		
		
		
		/*
		 * = : assignemnt
		 * == : equal
		 */
		
		//Q9:
		
		
	}

}
