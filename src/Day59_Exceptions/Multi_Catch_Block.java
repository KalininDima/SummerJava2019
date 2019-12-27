package Day59_Exceptions;

import java.util.NoSuchElementException;

/*
 * Multi catch block :
 * 			we can have multiple catch blocks with one try block
 * 
 * CONDITION: parent aception type needs to be after its sub 
 * exception type, otherwise code will be unreachable
 * 
 * CANNOT BE CONFLICTED
 * 
 * Exception > RntimeException>Arithmetic.....
 * 
 * 			try{
 * 
 * 			}catch(exception1 name){
 * 
 * 			}catch (exception2 name)
 * 					
 * EX:
 * try{
 * 
 * } catch (ArithmaticException e){
 * 
 * }
 * 
 * in multi-touch block whichever handles
 * the exception first will gets excecuted
 * 
 * 
 */
public class Multi_Catch_Block {

	public static void main(String[] args) {
		
		/*
		System.out.println(9/0);
		try {
			
		}catch(RuntimeException e) {
			System.out.println("Arithmetic exception");
		} catch(ArithmeticException e) {
			
		}
		*/
		
		int [] arr = {1,2,3};
		
		try {
			System.out.println(arr[100]);
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception");
		}catch (ClassCastException r) {
			System.out.println("Class cast exception");
		}catch (NoSuchElementException w) {
			System.out.println("No such element");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		
		System.out.println("=================");
		
		try {
			System.out.println(11/0);
		} 
		catch (ClassCastException e){
			System.out.println("Classcast");
		}
		catch (ArithmeticException e) {
			System.out.println("Arhmeic");
		} catch (RuntimeException d) {
			System.out.println("Runtime");
		} catch (Exception f) {
			System.out.println("EXception");
		}
		
		System.out.println("Hello");
		try {
		System.out.println(10/0);
		} catch (Exception e) {
			// code here
			System.out.println("unexcpected event occured at line 81");
		} 
		System.out.println("World");
		System.out.println("Test Completed");
		
	}
	
	
}
