package DAy10_ifStatement;

public class Multi_Branch_ifStatement {

	public static void main(String[] args) {
		/*
		 * if-else if-else:
		 * 	if(condition1){
		 * 	//A ==>if condition1 is true
		 * 	}
		 * else if (condition 2){
		 * 	//B ==> if condition1 is false and condition 2 is true
		 * }
		 * else if{ condtion3
		 * //C
		 * }
		 * else{
		 * condtion4
		 * }//D
		 * 
		 * 
		 * 
		 */
		if (false) {
			System.out.println("if block");
		}
		else if(false){
		System.out.println("else if block");
		}
			else {
				System.out.println("else block");
		}
		
		/*
		 * Task1
		 * 90=<grade==> A
		 * 80<=grade<90 ==> B
		 * 70<=grade<80==>C
		 * 60<=grade<70 ==>D
		 * else==>F
		 * 
		 * 
		 */
		
		int grade = 85;
		if(grade >= 90) {
			System.out.println("You have made A");
		}
		else if (grade<90 && grade >=80) {
			System.out.println("You made B");
		}
		
		else if(grade <80 && grade >= 70) {
			System.out.println("You made C");
		}
		else if (grade <70 && grade >=60) {
			System.out.println("You made D");
		}
		else {System.out.println("You made F");
		}
		
		
		int grade2 = 70;
		
		if(grade>=60) {
			System.out.println("D");
		}
		else if (grade >=70) {
			System.out.println( "C");
		}
		else if (grade2 >= 80) {
			System.out.println("E");
		}
		// Here is bug
		
		
		/*
		 * 
		 * Task2
		 * 		1. write a program that:
		 * 			1. 0~12 ==> good morning
		 * 			2. 12~15 ==> good afternoon
		 * 			3. 15~23 ==> good night
		 * 
		 * 
		 */
		int hour = 23;
		if ( hour >=0 && hour <12) {
			System.out.println("good morning");
		}
		
		else if (hour > 12 && hour <=15) {
			System.out.println("Good afternoon");
		}
		
		else if (hour >15 && hour<=23) {
			System.out.println("Good night");	
		} else { System.out.println("noon");
		
		}
		
		 /* 
		  * Task:
		  * int num1, num2, num3,
		  * find the bigger number
		  *  if : 
		  *  num1==num2 num3>num1
		  */
		
		
		int num1=200, num2=300, num3=50;
		if ( num1 > num2 && num1>num3) {
			System.out.println(num1 + " is the bigger number");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2+ " is bigger number");
		}
		else if (num3>num2 && num3 > num1) {
			System.out.println(num3+ "is the bigger number");
		}
		else if (num3==num2&&num3>num1) {
			System.out.println(num3 + " and "+ num2+ "are the bigger");
		}
		else if (num3==num1&&num3>num2 ) {
			System.out.println(num3 + " and " + num1+ " are the bigger ");
		}
		else if (num2==num1 && num2>num3) {
			System.out.println(num2 + " and " + num1+ " are the bigger ");
		}
		else {
			System.out.println("all of them are equal");
		
		}
			
		
	}
	
	
	
}
