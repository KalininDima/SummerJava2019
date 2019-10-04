package Day19_ForLoop;

import java.util.Scanner;
/*
 * warmup task:
    Given:  username: cybertek.batch12@gmail.com
            password: Javengers
    write a program for the login functionality of the gmail account. (user input is required)
        - username can be entered either in upper or lower case
        - password MUST be entered as it is
        - if the username does not end with "@gmail.com":
                    print "it's not a valid email"
        - if username ends with gmail but username or password did not match:
                    print "Invalid username or password"
        - if the username and passwords are correct:
                    print "loged in successfully"
 */
public class Warmup {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	
	System.out.println("Enter your email address");
	String user = sc.nextLine().toLowerCase();
	System.out.println("Enter your password");
	String pass= sc.nextLine();
	
	String username = "cybertek.batch12@gmail.com";
	String password = "Javangers";
	if(user.endsWith("@gmail.com")) {
		if (user.equalsIgnoreCase(username) && pass.equals(password)) {
			System.out.println("Loged in successfully");
		}else {System.out.println("invalid username");}
	} else {
		System.out.println("its not a valid email address");
	}
	//or, second solution :
	/*
	 * 
	 *  if(user.endsWith("@gmail.com") ) {
                
          if(user.equalsIgnoreCase(username) && pass.equals(password) ) {
            System.out.println("Loged in successfully");
             } else {
                    
           if(!user.equalsIgnoreCase(username) && !pass.equals(password)) {
          System.out.println("both username and password are incorrect");
                    } else if(!user.equalsIgnoreCase(username)){
                        System.out.println("Invalid username");
                    }else {
                        System.out.println("Invalid password");
                    }
	 * 
	 * 
	 * 
	 */
}
}
