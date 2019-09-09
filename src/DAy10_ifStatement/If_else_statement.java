package DAy10_ifStatement;

public class If_else_statement {
/*
 * if & else statement:
 * 		if(condition){
 * 		//A // if block only gets executed if the condition is true
 *  	} else 
 *  	{
 * 		//B // else block only gets executed  if the condition is false 
 * 		}
 * we use it when more than 2 posibilites
 *if condition is true it will give us A, if fault it will gives B 
 *
 *multi-branch if statemnt: we use them when there are more than two possibilites
 *if(condition1){
 * //A
 * } else if  (conditiotn2){
 * //b
 * }else{
 * 	//c
 *}
 *if condition1 is true ==>A
 *if condtion2 is true ==> B
 *if condtion1 and cndition2 is false ==>C
 */
	
	public static void main(String[] args) {
		if (9>8) {
			System.out.println("9 is greater than 8");
			
		}
		
		if ( 9< 8 ) {
			System.out.println("9 is less than 8");
		}
		
		if(9==8) {
			System.out.println("9 is equal 8");
		}
		
		if (9>=8) {
			System.out.println("9 is gtreater or equal 8");
			
		} else { System.out.println("9 is less than 8");}
		
		//if 9 is not greater or equal to 8, then 9 is must be less than 8
		
		if (false ==!false) {
			System.out.println("if block");
		} else { System.out.println("else block");}
		
		/*
		 * Task1:
		 * if score < 60 ==> failed
		 * if score >=60 but score < 90 ==> pass
		 * if score >=90==> passed with distinction
		 * 
		 */
		
		int score = 99;
		if ( score >=60) {
			System.out.println("Passed");
		} else { System.out.println("Failed");}
		
	//	if (score >=90) {
	//		System.out.println("you have made A+");
		
		
		
		/*
		 * triangle: has three angles,
		 * 				and sum of three angles MUST equal to 180
		 * 
		 * 1. declare three varables angle1,2,3
		 * 2.write a program to check if the triangle is valid or not to 180
		 */
			
		int angle1  = 20, angle2 = 50, angle3 = 75;
		boolean valid =(angle1+angle2+angle3)== 180;
		
		if ( angle1+angle2+angle3==180 && angle1>0 && angle2 >0 && angle3>0) {
			System.out.println("valid triangle");
			
		} else { System.out.println("invalid");}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
