package Day63_quiz;


class NoHolidaysException extends Exception{ // custom checked exception
}

class NoBreakException extends RuntimeException{ // custom unchecked exception
	public NoBreakException(String str) {
		super(str);
	}
}
public class Quiz16 {
	
	

public static void main(String[] args) {
	
	// throw new RuntimeException 
	
	
	int [] arr = {1,2,3};
	
	try {
		System.out.println(arr[100]);
	} catch (RuntimeException e) {
		System.out.println("runtime");
	}
//	 catch (IndexOutOfBoundsException e) {} chile cannot be after parent
		
	throw new NoBreakException("No breeeak");
}
}
