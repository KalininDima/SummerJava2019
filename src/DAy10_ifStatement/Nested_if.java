package DAy10_ifStatement;

public class Nested_if {
	public static void main(String[] args) {
		/*
		 * 
		 * Nested if statement:
		 * 		single if:
		 * 			if (condition1){
		 * 				//A
		 * 				if(condtion2) {
		 * 					//B
		 * 			}	
		 * 				}
		 * 			 A: as long as condition1 is true 
		 * B: if condiytion 1 & condition 2 are true
		 * 			
		 * 
		 */
		
		if (true) {
			System.out.println("Hello Cybertek");
			 if(false) {
				 System.out.println("Hello World");
				 
			 }
		}
		
		
		
		if (true) {
			System.out.println("Hello bstch 12"); //printed
			
			 if(false) {
				 System.out.println("Hello ");
			 }else {
				 System.out.println("Hello Team SDET"); // printed
			 }
		}
		
		
		/*
		 * 
		 * 60<=grade < 70 ==> D
		 * 70 <= grade < 90 ==> c
		 * 80<=grade < 90==>B
		 * 90<= grade <=100 ==>A
		 * 50<= grade <60 ==> F
		 * 40<=grade <50 ==>G
		 * 30<=grade <40 ==> H
		 * 20<=grade<30==> I
		 * 10<=grade <20 ==>J
		 * 0<=grade< ==> K
		 */
		int grade = 110;
		if(grade>=60) {
			System.out.println("passed");
			
			if (grade >=90&& grade <=100) {
				System.out.println("\twith grade  an A");
			} 
			else if (grade >=80 && grade < 90 ) {
				System.out.println("twith a grade B");
			}
			else if (grade >=70 && grade <80) {
			System.out.println("\twith a C");	
			} 
			else { //60<=grade<70
				System.out.println("\twith D");
			}
		}
		
				 // either less than 60 or greater than 100
			if(grade<=60) {
				System.out.println("You failed with a grade of F");
			}
			else { //Greater than 100
				System.out.println("Invalid score error 404");
			}
			}
		}
	
