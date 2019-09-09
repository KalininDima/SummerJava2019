package Day16_Recap;
import java.util.Scanner;
public class WarmUP {
	public static void main(String[] args) {
		
		/*
		 * Write a java program that asks user to enter first and last names, 
		 * then printout the users full name in all capital letteres
		 * 		fullname: LastName FirstName
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter first and last name");
		String firstname = scan.nextLine().toUpperCase(),
				lastname = scan.nextLine().toUpperCase();
		String fullname = firstname+" "+ lastname;
	//	fullname=fullname.toUpperCase(); another way
		// String fullname = firsname.concat(" "+lastname);
		System.out.println("Your full name "+fullname);
		
		
		//kahoot
		
		//Q1:
		int x=0, y=0;
		switch (x+1) {
		case 0: y=0;
		case 1:y=1;
		default: y=-1;
		//-1
		}
		
		
		//Q3
		int i=0 , j=0;
		switch(i) {
		case 2:j+=6;
		case 4:j+=1;
		default:j+=2;
		case 0: j+=4;
		}
		
		
		//Q4
		/*int Batch = 12;
		switch(Batch) {
		case 014:
				System.out.println("Cybertek");
				break;
		case 012:
				System.out.println("Best");
		default:
			System.out.println("Batch");
		
		}
		*/
		
		
		//Q5:
		char ch='a';
		switch(ch) {
		
		case 'a':
		case 'A':
			System.out.println(ch);
			break;
		case 'b':
		case 'B':
			System.out.println(ch);
			break;
		case 'c':
		case 'C':
			System.out.println(ch);
			break;
		case 'd':
		case 'D':
			System.out.println(ch);
			break;
			
		}
		
		//Q6
		
		int day = 4;
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			
		}
		
		
		//Q8
		int x1 =5, y1=19;
		
		int z = y1-x1>x1-y1?y1-x1:x1-y1;
		System.out.println(z);
		
		
		//Q9
		int sum =2, price =100;
		
		sum *= price>=100? price*=2:price; // price=200
		//         true?price=price*2:100
		//sum*=200==>=sum*200=400
		
		//Assignment
		
		/*boolean OPT=true;
		switch(OPT) {
		case true:
				System.out.println("True");
		default:
				System.out.println("Done");
				}
				*/
		
		
		
		//A2
		float f1=(12_345.1>123_45.0)?12456:12456.02f;
				//	12345.1 >12345.0 ? 12456
		float f2 =f1+1024;
		System.out.println(f2);
		//12456+1024=
		
		/*
		 * in accounting: 1,000,000,000//error
		 * _000_000_000//allow
		 */
		
		
		//A3
		
		int i1 = 10, j1=20,
				k=j1+=i/5;
		
		//k=j1+=2;
		//     j1+=2==>j1=j1+2==2
		//k=22
		System.out.println(i1+" : "+j1+" "+k);
			
		
		//A4
		byte b =1;
		switch(b) {
		
		case 1:
			System.out.println("one");
		break;
		}
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
	}
	
	
	
	

