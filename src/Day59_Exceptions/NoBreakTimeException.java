package Day59_Exceptions;
/*
 * Custom exception: we can a class that 
 * extends exceptions to make it an exception class
 * How we create an unchecked exception?
 * 		create a class that extends RuntimeExeption class
 * 
 * how we create  a custom checked exception
 * 	create a class that extends checked exception
 */
public class NoBreakTimeException extends RuntimeException{

	public NoBreakTimeException() {
		
		super("Too much breas have occured in java course");
		
		System.out.println("Why do you need break?");
	}
	
		
}
