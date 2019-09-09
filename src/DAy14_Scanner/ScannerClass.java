package DAy14_Scanner;
import java.util.Scanner;
// this imports Scanner class only from java.util package
// everhing in scanner class is imported
//import hava.util* // // this imports all the class from Java.util package
public class ScannerClass {


	public static void main(String[] args) {
	/*
	 * 1. Write a ptogram that can display
	 * 				if the day is or Tuesday:
	 * 							Java class days
	 * 				if the day is Thursday of Friday:
	 * 										Selenium Calss Days
	 * 
	 * 
	 * 
	 */
	Scanner input = new Scanner (System.in);
		String  day = "Tuesday";
		
		switch (day) {
		case "Monday":
		case "Tuesday":
					System.out.println("JAVA");
					break;
		case "Wednesday":
		case "Saturday":
					System.out.println("SQL");
					break;
			
		case	"Thursday":
		case "Friday":
					System.out.println("Selenium");
					break;
	
			default:
				System.out.println("Day off");
					
		}
		
		System.out.println("Enter a bite value ");
					byte byteNum=input.nextByte();
		System.out.println("You have entered: " + byteNum);
		
		System.out.println("Enter a Byte Value 2");
		byte byteNum2=input.nextByte(); // only allows user to enter byte value
		
		System.out.println("You have entered: " + byteNum2);
		
		System.out.println(byteNum+byteNum2+" Addition is " + (byteNum+byteNum2));
		
	}
	
	
	

}
