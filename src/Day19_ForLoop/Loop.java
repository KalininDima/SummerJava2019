package Day19_ForLoop;

public class Loop {

	public static void main(String[] args) {
		/*
		for (initialization;condtion;iterator){
		
		statements what we  want repeat
		loop:used for repeats the steps multiple times
		}
		
		for loop:
				for (initialization:condtion;iterator){
				statements
				}
		Statements with in loops body will
		 repeat untill condition becomes false
		 
		 
		 initialization:usually the times of the 
		 number that we want execute ti the loop
		 		EX: int i = 0;
		 
		 condition: condition is created based
		  on initialization
		  		EX:i<10
		  		
		 iterator: co-releated to the condition,
		 runs long enough and either increases or 
		 decreases the value of initialization, 
		 then eventually condition becomes false
		 		EX:i++, i++2, i++3
		 		
		 		ITERATOR IS NOT MANDATORY, BUT IT WILL GIVE 
		 		LOGICAL ERROR.
		 		
		*/
		
	//	for (int i = 0; true;++i) {
	//		System.out.println("Hello");
	//	}
		
	for (int i=10; i<=10; i++) {
		System.out.println("Value of i is "+ i);
	}
		System.out.println("Loop done");
		
		for (int i=10; i<=10; i+=2) {
			System.out.println("other loop");
		}
			
		
		
		/*
		 Task01:
		 
		 */
		for(int i=1;i<=10;i++) {
			
		System.out.println("the square of "+i+" is"+ (i * i));
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
