package day27_ForLoppAnArray;


public class VoidMethods {

	
	/*
	 
	 Methods: 
	 
	 		Grouping a series of statements 
	 		together to perform a specific tasks
	 		
	 		methods can make our codes reusuable.
	 		( dont need to repeat the same set of statements)
	 		
	 Method declaration:
	 
	 public static void main(String [] arr){} - its main method
	 
	 acces-modifir specifier return-type name() {statements;}
	 	public		static		void	 main() {}
	  
	  during the java course we will learn:
	  
	  access-modfiers: public,protected,default,private
	  specifiers: static, abstract,final
	  return-type:void and other data types (int,double....)
	
	for now we will use only public and static for the access
 	modofiers and specifiers
	  
	return Type:
			1. void methods: the methods does
			 not return any value
			 
	calling methods: we call the methods by their method name
	
	methods with parameters:
			sometime method needs specific 
			information (from user to user) to perform its task, 
			then we need to declare 
			the method with parameters
			EX:
			   int[] arr = {4,3,2,1};
			 	Arrays.sort(arr);
			 		array is he argument, and sort method'
			 		functionality is ti sort the given array
		
	
	 */
	
	public static void main(String[] args) {
		
		myFirstMethod();
		/*method is grouping a series of 
		statements to perform specofoc task 
		benefits:reusable, can avoid repeating 
		the same set statementa
		*/
	one_to_100();
	
		
	}
	
	public static void one_to_100(){
		for (int i=0; i<100; i++) {
			if (i % 2!=0) {
				continue;
			}
			System.out.print(i+" ");
		}
			 
	}
	
	public static void myFirstMethod () {
	//	public static void main(String[] args) {} methods must be declared within 
		//class not another method
		System.out.println("hello wrld");
		System.out.println("helo cyber");
		System.out.println("halo krushed");
	}
	
	
	
	
	
	
	
	
	
}
