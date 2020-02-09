package Day59_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Throws keyword : used for handling exceptions
 * 					used with method signature, indicates that method might throw exception
 * 
 * MUST be used with signature
 * 
 * EX:
 * public static void sleep() throws{
 * Thread.sleep(1000);
 * }
 * 
 * there will be exception thrown with the method. 
 * Whoever calls the method, they must handle it
 * 
 * CALLER still has to deal with exception, its caller' responsibility to handle the exception
 * 
 * method can throw more than one exception
 * EX: public void method() throws Inerrupted, IOE ...{}
 * 
 * MAINLY used for checked exception
 * 
 * 
 * throw keyword :
 * used for manually throw an exception
 * 
 * create object : new ClassName();
 * throw objectOfException;
 * 		EX: throw new RuntimeException();
 * after throwing an exception, any code we give will be unreachable
 * When we throw checked exception , code will not compile 
 * 
 * throw vs throws
 * final vs finall
 */
public class throwsKeyword {
	public static void main(String[] args) {
		sleep2(2000);
	//	sleep(3000); the method signature contains throws
	//	Thread.sleep(4000);
	//	method1();
		
		method3();
	}
	
public static void sleep(long milliSec) throws InterruptedException{
	Thread.sleep(3000);
}

public static void method1() throws InterruptedException{
	sleep(3000);
	
}

public static void test() throws Exception{
	Thread.sleep(3000);
	System.out.println(9/0);
	System.out.println("Hello");
	System.out.println("World");
	System.out.println("Cybertek");
	Thread.sleep(5000);
	System.out.println(10/0);
}
public static void sleep2(long milliSec) {
	try {
		Thread.sleep(milliSec);
	} catch (Exception e) {
		
	}
}

public static void method2() throws InterruptedException, FileNotFoundException
{
Thread.sleep(3000);
FileInputStream fil = new FileInputStream("");
}

public static void method3() throws RuntimeException{
	System.out.println(9/0);
}
}
