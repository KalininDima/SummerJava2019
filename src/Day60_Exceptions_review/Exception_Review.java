package Day60_Exceptions_review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * uncheked exceptions : exceptions that ocure during runtime.
 * 					unexpected event
 * All the uncheked exceptions are extending RuntimeException class
 * 
 * RuntimeException is parent class of all uncheked exception
 * 
 * EX: NoSuchElementexception
 * 	   WebDriverException
 * 	   TimeOutException
 * 	   staleElementException
 * ...
 * 
 * 1. try&catch blocks: used for handling exceptions
 * 
 * try{
 * exception code;
 * } catch () {
 * 
 * } finally{
 * statement;
 * }
 * 
 * 
 * try block : gets excecuted if the exception is cheked
 * catch : gets executed if unexcepted event occurs (uncheked)
 * finally: always gets executed
 * 
 * mult-catch blocks:
 * Condition: parent exception type cannot be 
 * 
 * try{
 * 
 * }
 * catch (exception1 e) {
 * 
 * }catch( exception2 e) {
 * 
 * }
 * ...
 * 
 * EX:
 * 
 * try {
 * 
 * }
 * catch (RuntimeException e) {
 * 
 * } catch (ArithmaticException e) {
 * 
 * } compile error , parent exception type needs  to be after the sub exception type
 * 
 * try {
 * 
 * }
 * 
 * catch (NullPointerException e) {
 * 
 * }
 * catch (ClassCastException e) {
 * 
 * } compiles successfully
 * 
 * if the exception is checked exception, we should not be using multi-catch block.
 * checked exceptions needs to be handled right away
 * 
 * throws keyword : used for exception handling
 * 					Must be used with method signature
 * public void method() throws ExceptionType{  }
 * 
 * indicates that method might throw an exception
 * 
 * Caller will be responsible for handling the exception
 * mostly used to handle checked exception 
 * 
 * Exception handling sumary:
 * exceptions are either cheked or uncheked
 * 
 * two ways to handle exception:
 * 			1. try & catch : handles the exceptions immediatly
 * 							 exception code we give it in try block,
 * 							 catch block is responsible catch all the 
 * 						     
 *
 *			2. throws: used in method signature, indicates the method throw an exception.
 *				Caller is responsible to handle it
 *				We can throw multiple exception within method signature
 *
 *	
 *throw: used for throw exception manually
 *		throw ObjectOfException  ===> throw new ExceptionClass();
 *		
 *		after throw keyword , any code fragments that we give will be unreachable code
 *
 * keywords: return , break, continue, throw any codes that given after those , will be unreachable
 * 
 * 
 * 
 * 
 */
public class Exception_Review {
public static void main(String[] args) {
	
	
	//throw new ClassCastException(); // uncheked , compiler is okay with it
	
	// throw new FileNotFoundException(); // checked exception, compiler is not happens
	
	
	try {
//	 FileInputStream file = new FileInputStream("path of line");
		Thread.sleep(3000);
	 System.out.println("try b");
	} catch (InterruptedException e){
		System.out.println("catch b");
	} 
	
	System.out.println("=================");
	
	try {
	System.out.println(11/0);
	System.out.println("try block");
	}catch (ArithmeticException e) {
		e.printStackTrace();
		System.out.println("catch block");
	}
	
	System.out.println("next test step");

	
	System.out.println("============");
	
	int [] arr = {1,2,3};
	try {
	System.out.println(arr[4]);	
	}catch (NullPointerException e) {
		System.out.println(1);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(2);
	} catch (IndexOutOfBoundsException e) {
		System.out.println(3);
	} catch (Exception e) {
		System.out.println(4);
	}
	
//	method();	
	method2();
//	method5();	
}
public static void method() throws InterruptedException {
	Thread.sleep(3000);
}

public static void method2() {
	
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		
	}
}

public static void method3() throws Exception {
Thread.sleep(3000);

System.out.println("step 2");
System.out.println("step 3");

Thread.sleep(3000);

System.out.println("step 4");
System.out.println("step 5");

Thread.sleep(3000);

try {
int a = 10;
System.out.println(a/0);
} catch (Exception e) {
	
}


}

public static void method5() throws Exception {
	
	try {
	Thread.sleep(3000);
	}catch (Exception e) {
		
	}
	
	
}

}
