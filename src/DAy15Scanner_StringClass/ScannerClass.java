package DAy15Scanner_StringClass;
import java.util.Scanner; //imports scanner only from java.util package
import java.util.*;//imports all classes from java.util package
/*
 *package name :java.util
 *class name: Scanner
 */
public class ScannerClass {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		byte num=input.nextByte(); // returns the user input 
	System.out.println(num*5);		
	
	System.out.println("Enter short value ");
	short num2 = input.nextShort();		
	
	System.out.println("Enter int value");
	int num3=input.nextInt();
	
	System.out.println("Enter long value");
	long num4 = input.nextLong();
	
	System.out.println("Etner boolean value ");
	boolean result=input.nextBoolean();
	
	System.out.println("Etner float value ");
	float num5=input.nextFloat();
	
	System.out.println("Etner double value ");
	double num6=input.nextDouble();
	
	
	System.out.println("Enter your first name ");
	String str = input.nextLine();

	
	System.out.println("Enter number:");
	int x = input.nextInt();
	//WRITE YOUT CODE HERE
	//x=x>=5?"x":(String) "-x";
	System.out.println(x);
}
}
