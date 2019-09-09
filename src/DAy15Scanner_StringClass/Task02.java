package DAy15Scanner_StringClass;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	/*
	 *Write a program that asks user to enter three numbers
	 *and returns the largest number
	 *Do it with ternary
	 */
	
	System.out.println("Enter num1 ");
	double n1 = input.nextDouble();
	
	System.out.println("Enter num2");
	double n2 = input.nextDouble();
	
	System.out.println("Enter num3");
	double n3 = input.nextDouble();
	
	double Largest = (n1>n2&&n1>n3) ? n1
			: (n2>n3&&n2>n1)? n2
			:n3;
	
	
	
	float z =10;
	
	//switch(z) {
	//case 10:System.out.println("monday");
	//case 11: System.out.println("sdf");
	
	
int i=10;
int j=20;
int k = j+=i/5;
System.out.println(i+":" +j+":"+k);
			
	
}
}
