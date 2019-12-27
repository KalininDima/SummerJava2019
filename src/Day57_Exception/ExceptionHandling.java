package Day57_Exception;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		try{
			 * exceptions statements/code
			 * } catch (ExceptionClass name) {
			 * 
			 * statements
			 * 
			 * }
		*/
		
		int [] number = {100,200,300};
		try {
			System.out.println(number[5]);
			System.out.println("Cheked exception");
		}
		catch(ArrayIndexOutOfBoundsException anyname) {
			System.out.println("Uncheked exception");
		}
		System.out.println("================");
		try {
			Thread.sleep(2000);
			System.out.println("Try block, Cheked Exception");
		} catch (InterruptedException e ) {
				System.out.println("Catch block, uncheked exception");
		}
		
		System.out.println("Work Done");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
			list.addAll(Arrays.asList(1,2,3));
			
			try{
				System.out.println(list.get(10));
				System.out.println("cheked Exception occured in arrayList");
			} catch (RuntimeException b)
			{
				
			}
	//parent exception class can handle child class' exceptions
			/*
			  
			 
			try {
				Thread.sleep(2000);
			} catch (RuntimeException e) {
				
			}
			*/
			
			try {
				Thread.sleep(2000);
			}catch(Exception r) {
				 
			}
	
			int [] nums = {1,2,3};
			
			try {
				int a = 100;
				System.out.println(nums[10]);
			} catch (Exception e) {
				System.out.println("checked exceptions");
			}
}
}