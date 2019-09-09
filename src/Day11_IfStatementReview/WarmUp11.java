package Day11_IfStatementReview;

public class WarmUp11 {
public static void main(String[] args) {
	
	
	
	/* 
	 * 1.declare an int variable "Year"
	 * Write the Java prigramm that can check if the year is a Leap year
	 * Leap year ==>is a Year by divided by 4. it has 366 days.
	 * 
	 * 2.Grade calculator:
	 * A==>90-100
	 * B==>80-89
	 * C==>70-79
	 * D==>60-69
	 * F==>0-59
	 * 
	 * else-if :more than to option
	 * if : just one option
	 * else : declare only with IF
	 * if (condition 1) {
	 * A
	 * }
	 * else if ( condition 2 ) {
	 * B
	 * }
	 * else if (condtion3) {
	 * C
	 * }
	 * else {
	 * D
	 * }
	 * A only gets executed : if condtion 1 is true
	 * B onlu gets executed: if  condtion 1 is false and cjondition 2 is true
	 * C only gets executed: if condtion 1 is false, condtion 2 false and condtion 3 is true
	 * D only gets executed: if all condtions are false
	 * 
	 * 
	 * Nested if : if condition can be evalute to multiple scenario
	 * 
	 * if ( condtion1) {
	 * A
	 * 		if (condition2) {
	 * B
	 * }   
	 * 		}
	 * 
	 */
	
	int Year = 2000;
	boolean LeapYear = Year%4 == 0;
	
	if (LeapYear) {
		
		System.out.println("Year " + Year + " is a leap year");
	} else {
		System.out.println("Year " + Year + " is not a leap year");
	}
	
	int grade = 55;
	boolean A = grade >= 90 && grade <= 100;
	boolean B = grade>= 80 && grade < 89;
	boolean C = grade>=70 && grade <= 79;
	boolean D = grade>=60 && grade <= 69;
	boolean ValidGrade = grade >=0 && grade <=100;
	
	 if(ValidGrade) {
         // in order to multi-brach if gets executed, first ValidGrade has to be true
         
         if(A) {   //  100 >= grade >= 90
             System.out.println("You made A");
         }
         else if(B) {  //  90> grade >= 80
             System.out.println("You made B");
         }
         else if(C) { //  80> grade >= 70
             System.out.println("You made C");
         }
         else if(D) {  //  70> grade >= 60
             System.out.println("You made D");
         }
         else {  // 0 =< grade < 60  
             System.out.println("You made F");
         }
         
     } 
     else {   // grade < 0  && (||) grade >100
         
         System.out.println("Invalid Grade");
     } 
         
         
	 /*
	  * 
	  * declare an int variable called Age
	  * declare  a boolean variable "GoodPErson"
	  * 
	  * if goodperson is false:
	  * age >= 18 => cigra
	  * age >=21 => Hookah
	  * age >=25 = > alcohol
	  * 
	  * age < 18=> milk
	  * 
	  * age: 23
	  * 
	  * else // bad for your health
	  * 
	  */
         
	 	int age = 30; 
        boolean GoodPerson = true; 
         
        if (age >= 18) {
        	if (GoodPerson) {
        		System.out.println("Alcohol bad for your health");
        		
        	}
        	else { // GoodPErson=false, && age >=18
        		System.out.println("You can buy ciga");
        		if (age>=21) {
        			System.out.println("You can buy hookah");
        		}
        		else if (age >= 25) {
        			System.out.println("You can buy alcohol");
        		}
        	}
        	
        } else {
        	System.out.println("Go drink milk");
        	}
        
        
        /*
         * 1. write a program that can find the number of days in a month
         *  (Assume that Feb has 28 days)
         * 
         * int month = 0~12;
         * 1	2	  3		4   5	 6    7    8	9	 10   11	12
         * Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
         * 31    28	  31   30   31   30   31   31   30   31   30   31
         * 
         * MUST use nested IF
         * 
         * 28 days: 2
         * 30 days: 4,6,9,11
         * 31 days: 1,3,5,7,8,10,12
         * 
         * even number of 30 days: 4 & 6
         * odd number of 30 days : 9 & 11
         * even number of 31 days: 8,10,12
         * odd number of 31 days: 1,3,5
         * 
         */
        int month = 5;
        if (month > 0 && month < 13) {
        	if (month == 1) {
        		//before August 
        		System.out.println("31 days");
        	}
        	else if (month == 2) {
        		System.out.println("28 days");
        	}
        	else if( month == 3) {
        		System.out.println("31 days");
        	}
        	else if(month == 4) {
        		System.out.println("30 days");
        	}
        	else if (month==5) {
        		System.out.println("31 days");
        	}
        	else if (month==6) {
        		System.out.println("30 days");
        	}
        	else if ( month ==7) {
        		System.out.println(" 31 days");
        	}
        	else if (month %2 ==0 ) { //month greater than 7, if its even number ==> 31 days
        		System.out.println("31 days");
        	}
        	else { // months greater than 7, if it's odd number ==> 30 days
        		System.out.println("30 days");
        	}
        }
        else {
        	System.out.println("Invalid Entry");
        }
        
        /* 
         * 28 days:2
         * 30 days: 4,6,9,11
         * 31 days: 1,3,5,7,8,10,12
         * 
         * 
         */
 int month2= 2;
		 if(month2>0 && month2<13) { //1~12
			 
		
		 if (month2 ==2) {
			 if (Year %4 ==0) {
				 System.out.println("29 days");
			 }
			 else {
				 System.out.println("28 days");
			 }
			 System.out.println("28 days"); //month=2
		 }
		 else if (month2==4 || month2 ==6) { // month2=4 or month2=6
			 System.out.println("30 days");
		 }
		 else if (month2==9 || month2 ==11) { // month2=9 or month 2==11
			 System.out.println("30 days");
		 }
		 else { //month2:1,3,5,7,8,10,12
			 System.out.println("31 days");
		 }
		 } else {
	System.out.println("Invalid Entery");
      }
	
	// if-else && else-if
		 if(true) {
			 System.out.println("hello");
		 }
		 else {
			 System.out.println("batch 12");
		 }
		 
		 if(true ) { //true
			 System.out.println("Hello");
		 }
		 else if (false) { // false
			 System.out.println("Batch 12");
		 }
		 else { //never gets execute
			 System.out.println("cybertek");
		 }
		 
		 
		 
		 
		 /*
		  * if(true) {
		  * 
		  * }
		  * else{
		  * 
		  * }
		  * else if (false){//error, else if must be decleared after the if block
		  * 
		  * }
		 */
		 
		 
		 
		 int x = 10;
		 
		 if (x>0) {
			 
			 System.out.println("greater than 0");
		 }
		 if (x>5) {
			 System.out.println("greater than 5");
		 }
		 if (x==10) {
			 System.out.println("equal");
		 }
		 
		 if (x>0) {
			 
			 System.out.println("greater than 0");
		 }
		 else if (x>5) {
			 System.out.println("greater than 5");
		 }
		 else if (x==10) {
			 System.out.println("equal");
		 }
		 
		 
		 System.out.println("============");
		 
		 if (true) {
			 // only be used for 1 condition
		 }
		 
		 System.out.println("=====");
		 
		 if (true) { // for 2 condition
				 
		 }
		 else {			 
		 }
		 
		 System.out.println("=====");
		 
		 if (true) { //for more than 2
			 
		 }else if (true) {
			 
		 }
		 else if (true) {
			 
		 }
		 else {
			 
		 }
		 
		 
		 	System.out.println("=====");
		 	
		 	if (true) { //if the condition has multiple scenarios
		 				//if we have precondition
		 		
		 		if(true) { //// execution of this block depends on the first condition
		 			
		 		}
		 	}
		 	
		 	
		 	
}
}