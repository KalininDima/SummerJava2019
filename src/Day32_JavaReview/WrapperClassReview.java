package Day32_JavaReview;

public class WrapperClassReview {
public static void main(String[] args) {
	
	/*
	 primitives									Wrapper Class: java.util
	 byte				autoboxing					Byte	
	 int		============================>		Integer
	 short											Short
	 long		unboxing							Long
	 float		<=======================			Float
	 double											Double							
	 boolean										Boolean
	 char 											Character
	 
	Wrapper class vs primitives:
	 		1. Default values:
	 		primitives: byte,short,int,long ===> 0
	 					float,double ===> 0 
	 					boolean ==> false
	 					char==>space
	 					
	 		All wrapper class: null
	 		
	 		2. Wrapper class only accepts its own primitive values
	 
	 		3. Wrapper classes have method, primitives dont.
	 		
	 		4. Wrapper class takes object, primitives takes values
	 		
	 	methods:Max_values, Min_values, parse methods, valueOf methods.
	 			max_value:returns the maximum value of the data-type
	 			min_value: return the minimum value of the data type
	 			parse methods: converts String to primitives
	 			valueOf methods: converting String to wrapper class
	 			
	 	
	 	
	 */
	
	
	
int a = 10;
Integer b = 10; // Integer only accepts int primitive values
byte c = 20;
//Integer b2=c; //Integer only accepts int primitives values

long L = b; // Integer is within the range of long


boolean result = 9>0 + 1;
Boolean result2 = result; // auto - boxing

boolean result3 = result2;// unboxing

Boolean result4 =result2; // none
boolean result5 = result3; // none

/*
 methods:
 		max_value
 		min_value
 		parse methods
 		valueOfmethods
 
 */


int max = Integer.MAX_VALUE;
//int max2 = Double.MAX_VALUE; // because int != Double err
System.out.println(max-1);

System.out.println(Double.MAX_VALUE);//
System.out.println(Byte.MAX_VALUE);// 127


int min = Byte.MIN_VALUE;// -128
int min2 = Short.MIN_VALUE;//-
System.out.println(min);
System.out.println(min2);

//parse methods: ignore and case sensetivety
	short s1 = Short.parseShort("1234");
	System.out.println(s1+1);
	
	double d1 = Double.parseDouble("78.5");//

	
	
	boolean r1 = Boolean.parseBoolean("8<4");// none
	System.out.println(r1);
}



}
