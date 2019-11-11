package Day48_MethodOverRiding;

class Creentials{
	private final String UserName= "User";
	private final String Password = "Batch12";
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String UserName) {
		//this.UserName = UserName final variable cannot be re-assigned;
	}
	
}
class Holly{
	final public void printName() {
		System.out.println("Dima");
	}
}
public class FinalKeyword extends Holly {
	/*
	@Override
	public void printName() {
		System.out.println("kedr");
		
		final methods cannot be override methods;
	}
	*/
	int AGE;
public static void main(String[] args) {
	
	final String SSN = "123456";
	//SSN = "654321"; final variable cannot be reassigned
	final String DateOfBirth;
	
	System.out.println(SSN);
	
	
	FinalKeyword obj = new FinalKeyword();
	System.out.println(obj.AGE);
	
	
}
	public static void add (int a , int b) {
		System.out.println(a+b);
	}
	
	public static double add (double x, double y) {
		return x+y;
	}
	
}
