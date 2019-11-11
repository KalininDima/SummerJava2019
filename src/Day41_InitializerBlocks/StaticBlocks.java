package Day41_InitializerBlocks;

public class StaticBlocks {
/*
 
initializer blocks:
            1. static initializer block
            2. instance initializer block
            3. constructor vs instance initializer block
            4. static import
Thursday: Encapsulation
package: day41_initializerBlocks
static member: 1. static variable
               2. static methods
               3. static initializer block
               4. inner class (nested class)
static variable: declared in the class, outside any method, WITH static keyword ( class variables )
            shared by the class and all the objects of the class
            
static method: a mtheod that can be called using class name
            static method belongs to the class
static initializer block: used for initializing static variables
            static{
                 statments;
            }
        static initializer block is executed as soon as the class is loaded, only executed 1 time
        static block' execution DOES NOT depend on the object
        we can have multiple static blocks in java, first come first serve

*
*
*
*/
	
	public StaticBlocks() {
		System.out.println("constructor");
	}
	
	static {
		System.out.println("static block");
		System.out.println("static block1");
	}
	public static void main(String[] args) {
		
		StaticBlocks obj1 = new StaticBlocks();
		StaticBlocks obj2 = new StaticBlocks();
		System.out.println("main");
	}
	
	static {
		System.out.println("static block new ");
		System.out.println("static block new2");
	}
}
