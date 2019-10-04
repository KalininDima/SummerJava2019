package Day29_ReturnMethods;

public class SystemExit {
//System. exit(0): java stops
	public static void main(String[] args) {
		
		
		System.out.println(number() );
		
		System.out.println("Done");
		System.out.println("comleted");
		
	}
	
	public static int number () {
		
		if (true) {
			System.exit(0); //exits all the java execution
		}
		
		return 5;
		
	}
	
	public static void method1 () {
		System.out.println("Hello World");
		System.exit(0);
	}
	
	
	
	
}
