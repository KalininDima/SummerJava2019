package Day41_InitializerBlocks;

public class StaticVSinsVSCons {

	static {
        System.out.println("static block");    
        // static block execution does not depend on the object
                // executed as soon as the class is loaded, ONLY ONCE
    }
    
    {
        System.out.println("instance block");
        // instance block' execution depends on the object
        // when object is created, instance block runs first, then constructor
    }
    
    public StaticVSinsVSCons() {
        System.out.println("Constructor");
        // instance block' execution depends on the object
        // when object is created, constructor runs after the instance block
    }
    
    public static void main(String[] args) {
        
        StaticVSinsVSCons obj = new StaticVSinsVSCons();
        StaticVSinsVSCons obj2 = new StaticVSinsVSCons();
        StaticVSinsVSCons obj3 = new StaticVSinsVSCons();
        
        // constructor and instance block' execution depends on the creation of object
    }
    
	
}
