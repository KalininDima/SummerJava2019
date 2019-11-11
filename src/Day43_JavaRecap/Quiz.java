package Day43_JavaRecap;

public class Quiz {
/*
 * 
 Java Reveiw:
        1. static keyword
        2. initializer blocks
        3. Encapsulation
        4. static import
        5. Multi-class
        6. Access modifiers: public, private, default
    
next topics: OOP Inheritance, Method Overriding, Final
package: day43_JavaRecap
local Variables: variables that are declared within the method or blocks
            only accessible within the method or block
instance variable: belong to the object. each object has its own copy of instance variables
static keyword: any feature that has static keyword belongs to the class, also can be called through the class.  ( class members )
static members:
            1. static variables
            2. static methods
            3. static initializer block
            4. static inner class (nested class)
static variable: variable that's shared by class and objects, there is only one copy
static methods: methods that we can call it through the class name ( beong to class)
            Ex:     WebDriver driver = WebDriverFactory.getDriver();            
                static methods only accepts class members (static)
                none statics can ONLY be called through the object
Static initializer block : used for initializing static variable
				Declared in the class outside the Method. WITH STATIC KEYWORD
				
				static {
				statements;
				}
				its executed as soon as the class is loaded, ONLY 1 time
				
				instance initialize block : used for initializing  the instance variables
							declared in the class outside the method
							
				
import:
        import PackageName.className;  ==> to import a single class
this(): used for calling the constructors
            we can only used it in the constructor
this. : used for calling the instance variables
        this. we can used in any object instances
        
Encapsulation: hiding the instance variable 
		1.hide the data by giving private access-modifier.
		private: only visible (accessible) within the class
		 
		2.grants other classes get access 
		to the private instance variable through public getter/setters
		
		getter (read): instance method, returns the private instance variable
		
		return-type  of getter MUST match with the data-type of the
		 instance variable
				
		acces modifier needs to be public , because we want to 
		call method outside the classes
		
		setter(modify): instance method , return-type is void, passess a parameter
						the parameter, data-type MUST match with instance variable
		
		
		
	
	//q1 Instance variables are also called fields. each 
	 * objects has its own copies of instance variables
	 * -True
	 */
	
	//q2 Any feature that has static keyword belongs to the 
//	class members. Class members are shared by the class and objects
	//-True
	
	/*
	 * q3static blocks and constructors' execution depends on the
	 *  creation of the object
	 *  -False
	 */
	
	/*
	 Only the methods and variables can have the static keyword
	 -False
	 */

	
	
	
	//q4
	
	//q5:
	
	static int a;
	int b;
	
	
	
	public static void main(String[] args) {
	/*	Quiz obj1 = new Quiz();
		obj1.b = 10;
		Quiz obj2 = new Quiz();
		obj2.b = 30;
		System.out.println(obj1.b);//10
		System.out.println(obj2.b); // 30
		/*
		 * 
		 */
	}
 
}
