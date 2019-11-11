package Day46_SupeKeyword;
class A{
	
	String name = "Madina";
	 
	public void methodA() {
		
	}
	
	public A (int a) {
		
	}
	
}

public class SuperKeyword extends A{
		//		sub				super
	
	public SuperKeyword(double B) {
	super(10);	// super class' constructor MUST be in the subclass
	}
	
	/*
	public SuperKeyword (int a) {
		
		super(10); // super class' constructor MUST be in the subclass
		
	}
	*/
	
	/*
	 String name = "Madina";
	  
	 
	 */
	
	public void methodA () {
		
		
		super.name = "Mahir";
		this.name = "Ishan";
		super.methodA();
		this.methodA();
	
	
	
}
	
}
