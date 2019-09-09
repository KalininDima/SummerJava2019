package Day09_Review;

public class Review {

	public static void main(String[] args) {
		
		/*
		 * relational operators:
		 * > : greater return true only if  x > y (x=10, y=9)
		 * >= : greater than or equal  true : either greater or equal
		 * < : less than x=10 y=9: only return true when Y < x
		 * <= : less than equal true : either less or equal
		 * == : equal		x=10, y=10	,true: x==y 
		 * != not equal     x = 9, Y=10; true: x!=y
		 * 
		 * 
		 * logical operators:
		 * 		&& :	true: if both conditions are true
		 * 		|| :	true: as long as one condition is true
		 * 
		 * 
		 */
		
		
		// > :
		
		System.out.println('Z' > 'A'); // true
		System.out.println('Z' >= 'A'); // true
		System.out.println('a' >='A'); // true ??
		System.out.println('a' < 'A'); //false
		System.out.println('A' <= 'A'); // !false
		System.out.println('A' <= 'a'); //true
							//
		
		System.out.println(false == false); // true
		System.out.println(false != false);
		System.out.println(!(false != true)); //true
							//!true==>false
		System.out.println(true == true && false != true);
							// true && true ==>true ??
		System.out.println(true != true || false == true);
		//                     false    ||   false ==>false)
		
		System.out.println("Monday" == "Friday");
		
		byte X = 10; int Y = 10;
		System.out.println(X==Y);//true, for primitives data types
		
		
		
	}
}
