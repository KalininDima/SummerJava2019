package Day12_SwitchStatement;

public class if_statement_without_curlybrace {
public static void main(String[] args) {
	
	if (true) {
		System.out.println("Hello");
		System.out.println("Hello");
	} else {
		System.out.println("World");
	}
	
	
	//without curles
	
	if(true)
	System.out.println("Hello");
	//System.out.println("Hello");
	//without curly brace if block cannot hold more than one statement
	else
		System.out.println("World");
	
	if(true) { 
		if(true) {
			System.out.println("Hello World");
		}
		else {
			System.out.println("HeloCyber");
		}
	}
			System.out.println("invali");
	
	System.out.println("============");
	
	//nested if
	if (true)
		if(true)
			System.out.println("HelloWorld");
		else
			System.out.println("HelloCybertek");
	
	
	//multi-branch if :
	int grade = 80;
	if(grade >=90) {
		System.out.println("A");
	}
	else if (grade >= 80) {
		System.out.println("B");	
	}
	else if (grade >=70) {
		System.out.println("C");
	}
	
	
	
	if(grade <=100&&grade>=0)
		if(grade>=90) 
			System.out.println("A");
		else if(grade>= 80)
			System.out.println("B");
		else if (grade >=70)
			System.out.println("C");
		else//this else statement belongs to the "else-if statements
        System.out.println(); 
	else  // this else statement belongs to the pre condition
    System.out.println("Invalid");
    
	
	
	
}
}