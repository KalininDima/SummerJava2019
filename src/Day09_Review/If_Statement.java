package Day09_Review;

public class If_Statement {
public static void main(String[] args) {
	
	/*
	 * if statements:
	 * 			single if statement:
	 * 				if (boolean expression) {
	 *                        some codes to run
	 * 				}
	 * 					if block only gets executed if the condition is true
	 * 
	 * 				if (condtion) {
	 * 						
	 * 
	 * }
	 * 
	 */
	
	if (9>10) {
		System.out.println("Hello");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow is day off");


}
	int a= 1000; // 1001
	if (a++ ==1001) {
		//1000==1001 ==>false
			a=2000;
			System.out.println("a is increased");
			
			
			
	}
	
	
	int X = 987654320;
	if (X%2 == 0) {
		
		System.out.println(X);
		System.out.println("its an even number");
		
		
	
	}
	
	if( X%2 != 0) {
 
		System.out.println(X);
		System.out.println("its an odd number");
		
		
	}
	
	int Y = 23456780;
	if (Y % 5 == 0) {
		//
		System.out.println(Y+" can be divided by 5\n\n");
	}
		if ( Y % 5!= 0) {
			System.out.println(Y + " cant be devided by 5\n\n");
			
		}
			String CEO = "Main Boss";
			String Kuzzat = "Main Boss";
			
			System.out.println(CEO==Kuzzat);// true

			
			if(Kuzzat == CEO) {
				//true
				System.out.println("Great Person in the World");
				System.out.println("First in block");
				
			}
			if(Kuzzat != CEO) {
				//false
				System.out.println("Great Person in the World");
				System.out.println("Second in block");
				
				
			}
			
			double TotalNumber  =100;
			boolean Cybertek = true;
			boolean BestSchool = true;
			if (Cybertek == BestSchool) {
				//
					TotalNumber += 500;
					
			}
			if (Cybertek !=BestSchool) {
				//
				TotalNumber -= 50; //TotalNumber = 
				
				
			}
			System.out.println(TotalNumber);
			
			/*
			 * 1. declear a variable, and initialize user age
			 * 1.write a program a program if the user is eligible to vote for Donald Trump
			 * 			vote age:18
			 * 
			 * 
			 * 
			 */
			
			byte PersoneAge = 78;
			byte voteAge = 18;
					
					if (PersoneAge >= voteAge) {
						//true
						System.out.println("Yes you  are elegible to vote");
						System.out.println("Have fun with building the wall");
						System.out.println("MAGA");
					}
					
					if(PersoneAge < voteAge) {
						//false
						System.out.println("You are not eligible to vote, go grow up");
						
						
						
					}
		}
	}
