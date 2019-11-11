package Day51_Abstraction;
/*
 Abstract method : can only be declared in abstract class and interface
 					hiding the implementation details (does not have body)
 					its meant to be overridden in subclass (non-abstract class)
 					cannot be : final , private,static;
 					abstract 
 				abstract keyword : can only applicate to classes & methods
 		
 					Abstract class vs Non-abstract class:
 						abstract class : 
 										we can have abstract methods mamd adll the non-abstract methods(anything that non abstract class can have,
 										abstract class can also have it)
 										
 										 we can have abstract methods
 										 a class thats meant to be extanded
 										 cannot be final
 										 cannot create object (object is concrete, abstraction is not concrete)
 						 
 						non-abstract class:
 						cannot abstract methods 
 						we can create objects
 						can be final (cannot be extended)
 					
 					
 					final keyword: can only be apllicable t ovariables, methods,classes.
 						variables : variable becomes constant
 						methods: the methods cannot be overridden
 						class: class becomes immutable, class cannot be a super  class , class cannot be extended
 						class: class 
 
 
 					
 					OOP:
 						1.ENCAPSULATION
 						2.INGERITANCE
 						3.ABSTRACTION
 						4.POLYMORPHISM
 						
 						Exceptions
 						Collections
 						
 						quiz topics : method overriding vs overloading (yester days note)
 						final keyword
 						inheritnce(this & super)
 						abstraction
 						
 						String Bulider, LocalDate, Methclass
 					
 						
 						
 */

abstract class Test{
    
    public Test(){
        
    }
    
    abstract void m();
    
    protected abstract void m(int a);
    
    public static void main(String[] args) {
        
    }
        
}
public class practice extends Test{
    
    // abstract void m();
    
    @Override
    void m() {
        practice obj = new practice();
    }
    
    @Override
    public void m(int a) {
        
    }
    
        final int num2 = 30;
        final static int num3 = 40;
    
    public static void main(String[] args) {
        final int num;  // constant
            num = 10;   
        System.out.println(num);
        
        
    }
}
final class A{
    
}
// class B extends A{}  final class cannot be super class
abstract class C{
    
    int num;
    static int num2;
    
    public static void main(String[] args) {
        
    }
    
    static {
        
    }
    
    {
        
    }
    
    abstract void absmethod();
    
}
abstract class D extends C{
    /*
    @Override
    void absmethod() {
        
    }
    */
	
	
	
	//final abstract void methodA();
	
	public abstract void methodB();
	protected abstract void methodC();
	abstract int method();
	
	//private
	
	class credentials{
		private final String username="123";
		//getter:(read only)return method
		public String getUserName() {
			return username;
			
		}
		
		//setter (modify); return type is void 
		public void setUserName(String username) {
			username = username;
			
		}
		
		
	}
}

