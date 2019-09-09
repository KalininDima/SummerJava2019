package Day12_SwitchStatement;


public class SwitchStatement {
public static void main(String[] args) {
	
	/*
	 * 
	 * switch statement the similar does the similar thing like multi-branchelse if statement
	 * 
	 * switch(Expression)
	 * 	case CaseVale:
	 * 			statement1
	 * 			statement2
	 * 			statement3
	 * break: //used to break the case
	 * 		// closing statement => }
	 * 	exits the switch statement
	 * 
	 * if there no brake in switch:
	 * default:
	 * 		statement;
	 * 		statement2;
	 * 		brake;
	 * 
	 * 
	 * we can have as many cases we want in switch statement
	 * 
	 * break: used for exiting the switch statement.
	 * exiting the switch statement
	 * if we dont have break statemnt code will continue to run to next brake statement or }
	 * 
	 * case order doesnt matter
	 * 
	 * CaseValue must match with switch expression
	 * 
	 * cases issimmilar with else-if
	 * 
	 * default section is similar with else statement
	 * default section will get execute when there is no case that matches 
	 * with given exprerssion
	 * 
	 * default section can be placed any where with in switch statement
	 * 
	 * in switch statement , none if the blocks 
	 * 
	 * 
	 */
	
	
	
	//EX
	int score =1;
	if (score==1) { // must give boolean expression
		System.out.println("1");
	}
	else if (score ==2) {
		System.out.println("2");
	} else {
		System.out.println("invalid");
	}
	
	
	switch(score) { // must give an Epression:data
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		default:
			System.out.println("invalid");
			
	}
			String str="Java";
		switch (str) {
			default: // else
				System.out.println("Invalid");
			case "C#":
				System.out.println("C# programming language");
					break;
			//case "Python":
			//	System.out.println("Python programming lannguage"); // closed after breake
					
					
			}
			
		//EX2
		
	char ch='C';
	
	switch (ch) {
	
		default:
			System.out.println("Failed");
	
		case 'B':
			System.out.println("Passed with B");
		case 'C':
			System.out.println("Passed with C");
	
	
	 } 
	

	int number =10;
	if(--number > 10) {

		System.out.println("Hello Cybertek "+number);

		}else if(number ==9) {

		System.out.println("Hello World "+number);
		}
		/*
		 * switch (expression) {
		 * 				case casevalue:
		 * 						statements;
		 * 						break;
		 * 				
		 * 
		 */

		int num = 5;
		
		switch (num) {
		case 7:
				System.out.println("Sunday");
				break;
				// its used for exiting switch statement after the case executed
			
				default:
					System.out.println("Invalid Entry");
					break;
					//System.out.println("dfghj"); // break statement means closing statement,
					//cannot give any more statement
				case 5:
					System.out.println("Friday");
					break;
		
		}
		
		String days = "Tuesday";
					switch (days) {
					case "Monday":
						System.out.println("Monday is fun day");
						break;
					
					case "Tuesday":
						System.out.println("Tuesday great day");
						break;
						
					case "Wednesday":
						System.out.println("Wedbesday Great day");
						break;
						
						default:
							System.out.println("invalid");
							break;
						
						
					}
					
					
}
}
