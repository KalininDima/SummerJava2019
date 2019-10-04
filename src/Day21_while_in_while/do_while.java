package Day21_while_in_while;

import java.util.Scanner;
/*
do while:
			do{
				statements;
				}while(condition);
				compiler executes the do block first,,
				and then checks the condition, if the condition 
				is true keep executes, other wise, exits the loop
				
				do-while loops body gets executed at least once, 
				regardless of condition
			while vs do-while:
				while loop never gets executed if the
				condtions is false
				
				do-while gets executed one time if 
				the condition is false
*/

public class do_while {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	boolean A = false;
	
	while (A) {
		
		System.out.println("Hello");
	}
	do {
		System.out.println("Hello");
	}
	while(A);
	
	int x = 1;
	do {
		if (x%2==0) {
			System.out.println(x+" ");
		}
		x++;
	}while(x<=100);
	
	
	do {
		System.out.println("hello world");
		break;
	//	System.out.println("hello cybertek");
		//it ws already out of the loop at line 49
	}while(true);
	
	
	
	
}
}
