package Day13_Review;

public class assesment3 {
public static void main(String[] args) {
	
	//task1
	int num =9;
	
	if (num++ == 10) { // line1
		
		System.out.println("Hello world" + num);
	}
	else {
		System.out.println("Hello Univers" + num); 
	}
	
	//T2
	int score = 0;
	
	if(score==0) {
		//0==0=> true
		score+=50;
	}
	if (score!=0) {
		//score+=50;
	}
	System.out.println(score);
	
	//T3
	char grade ='A';

	boolean Passed = grade == 'A' || grade =='B';
								// 'A' || 'A' =='B'
				//					true||false=true
	
	
	boolean Passed2 =grade == 'C' || grade =='D';
	// 					'A =='C'  || 'A' =='D';
	//						false || false ==> false
	 

	if( Passed || Passed2) {
// true || false ==> true
	System.out.println("You've passed the exam");

	}

	else {

	System.out.println("You failed");
	}
	
	
	
	//T4
	boolean A = true, B =  !false;

	if(B) {

	System.out.println("B");

	}

	else if(A) {

	System.out.println("A");

	}

	else {

	System.out.println("C");

	}

//Q5:
	
	boolean result = true;

	if(result) {

	System.out.println("it's true");

	}

	else {

	System.out.println("it's false");

	}

//	else if(result) {   // error, multi-branch statement else if must be after if

//	System.out.println("None of the above");

//	}

//Q8:
	boolean A1 = true, B1 = !A1;
					     //B1 = false
	if(A1) {

	if(B1) {

	System.out.println("Monday");

	}else {

	System.out.println("Tuesday");

	}

	}

	else {

	if(A1) {

	System.out.println("Thursday");

	}else {

	System.out.println("Friday");

	}

	}
	
	
	//Q9
	
	int number =10;

	if(--number > 10) {

	System.out.println("Hello Cybertek "+number);

	}else if(number ==9) {

	System.out.println("Hello World "+number);

	}
	//Q10
	
	boolean X = true;

	boolean Y = !X==false;

	boolean Z = Y;

	if( X ) {

	System.out.println("Hello Everyone");

	} if( Y ) {

	System.out.println("Today is great day");

	} if( Z ) {

	System.out.println("We have picnic on Saturday");

	}
	
	//nested if : precondition.
	//            if a condition can be evaluate a multiple scenarios
	/*
	vote age:
	age >= ==> eligible to vote
	
	age >=70 ==> can vote three times
	70> age >= 60 ==> can vote twice
	50> age >= 80 ==> can vote one time
	
	
	*/
	
	
	int age = -9;

	if( age>= 0 && age <=110) {
		
	if (age > 18) {
		if ( age >= 70) {
			System.out.println("can vote three times");
			} 
		else if (age >=50) {
			System.out.println("can vote two times");
			}
		else {
			System.out.println("can vote one time");
			}
	} else {
		System.out.println("not Eligible to vote");
	}
	
	} else {
		System.out.println("invalis entry");}
	

}
}