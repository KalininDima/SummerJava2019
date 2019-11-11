package Day48_MethodOverRiding;


class Mahribana{
	
	void methodA() { // the method we are going to 
		//override MUST be inheritable to the sub class
		System.out.println("Method A");
	}
	
	public String methodB() {
		return "B";
	}
	
	/*
	public String methodB() {
		return "C";
	}
	*/
	
	protected double salary (double bonus) {
		return bonus+10000;
	}
}
public class AccessModifiers extends Mahribana {
	
	public double salary (int onus) {
		return onus + 200000;
	}
	/*
@Override
	void methodA() {
		System.out.println("Method A");
	}
	
	override methods access
	modifiers need to be same or more visible
	*/
	
	@Override
	protected void methodA()
	{
	System.out.println("Method A");
	}
	
	public String methodB(){
		return "C";
	}
	
	
}
