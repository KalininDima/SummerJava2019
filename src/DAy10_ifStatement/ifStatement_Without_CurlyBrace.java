package DAy10_ifStatement;

public class ifStatement_Without_CurlyBrace {
	public static void main(String[] args) {
	
	/*
	 * single if statemnt:
	 * if (condition) {
	 * //somecodes
	 * }
	 * if statement with out curly braces:
	 *   single if statement:
	 *   if (condition)
	 *   	// only a single line of code statement
	 *   		without curly braces, block can only containe single line statement
	 */
	
	if (false) {
		System.out.println("Today is friday");
		System.out.println("Tomomrrow i day off");
		System.out.println("There is no java class tomorrow");

	}
	if (false)
		System.out.println("Today is friday bla bla bla");
	System.out.println("Tomorrow is n class");
	
	if (false)
		System.out.println("Hello");
		System.out.println("World");

		
		/*
		 *if - else statement
		 *		if(condition)
		 *				// single line of statement
		 * 
		 * 
		 */
		
		
		
		if (true) {
			System.out.println("Hello");
		//System.out.println("Good morning"); error
		}
		else {
			System.out.println("Hola"); //else must be declared right after statement
		}
		
		if (false)
			System.out.println("this is if");
		else
			System.out.println("This is else");
		
		
		/*
		 * multi-branch if statement:
		 * 		if (condititon1)
		 * 			// single line of statement
		 * 		else if (condtion2)
		 * 				//single line of statement
		 * 		else 
		 * 			//single line of statement
		 * 
		 */
		
		if (true)
			System.out.println("If Blocjk");
		else if (true)
			System.out.println("else if block");
		else
			System.out.println("Else block");
		// else block is not mandatory
		
}
	
	
	
}
