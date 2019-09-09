 package DAy14_Scanner;


public class Ternary {
public static void main(String[] args) {
	
	
	int num = 0;
/*	
	if (true)
		
		num = 100;
	else 
		num=50;
	
	*/
	 
	num = (true)? 100 : 50; //ternary returns a value
	int n = true? 100: 50;
	int y = (false)? 100: 50;
	
	 
	System.out.println(num);
	
	/*
	 * if (condition ==> (condition)?
	 * else `		==>    :
	 * else if 		==> :(condition) ?
	 * 
	 * 
	 */
	
	String Schoolname = "";
	boolean Batch12 = true;
	
	if (Batch12)
		Schoolname = "Cybertek";
	else
		Schoolname="Invalid";
		
		System.out.println( Batch12 ? "Cybertek":"Invalid");
	
		String BestSchool = Batch12 ? "Cybertek" : "Invalid";
		
		System.out.println(BestSchool);
		
		double d = 10;
		if(true) {
			d =10.5;
		}
	
		double z = true ? 10.5 : 0 ; // in tenrary, total number of 
		// ? and : has to be equal
		
		double interestRate = 0;
		boolean GoodCredit = true;
				
		interestRate = (GoodCredit == true) ? 0.5 : 0.9; 
		System.out.println(interestRate);
		
		
		byte grade = 60;
		boolean Passed = grade >=60 ? true : false;
		System.out.println(Passed);
		
		char FinalGrade = 'A';
		String Group = "";
		
		if (FinalGrade == 'A') {
			Group = "Early bird";
		} else if(FinalGrade=='B') {
			Group = "Group1";
		} else if (FinalGrade == 'C') {
			Group = "Group 2";
		} else {
			Group = "After Group";
		}
		
		
		
		 Group =	(FinalGrade == 'A') ? "Early bird":(FinalGrade == 'B') ?
				 	"Group 1" : "After Group 1";
		 System.out.println(Group);
		 
		 
		 Group = (FinalGrade=='A')? "Early Birds"
				 :(FinalGrade=='B') ? "Group 1"
						 :(FinalGrade == 'C')? "Group 2"
								 : "After Group 2";
		 
		 
		 
		 
		 int score = 80;
		 char Final =' ';
		 String GoupName = "";
		 if (score >= 80 && score <=100)
			 		Final = 'A';
		 else if (score >= 80 && score <= 89)
			 	Final = 'B';
		 else if (score >= 70 && score <= 79)
			 		Final = 'C';
		 else if (score >=60 && score <=69)
			 	Final = 'D';
		 else if (score >= 0 && score <=59)
			 	Final = 'F';
		 else 
			 Final = ' ';
		 
		 
		 
		 Final = (score>=80&&score<=100 )? 'A': 
			 			score>=80&&score<=89 ? 'B':
			 				score>=70 && score <= 79 ? 'C':
			 					score >=60 && score <=69 ? 'D':
			 						score >= 0 && score <=59 ? 'F':
			 							' ' ;
			 						
			 						
			 						//Solution 2
			 						/* Finals = (score < 0 || score >100) ? '?':
			 			                 (score >=90) ? 'A':
			 			                 (score >=80) ? 'B':
			 			                 (score >=70) ? 'C':
			 			                 (score >=60) ? 'D':
			 			                 'F';*/
			 			        
			 			        System.out.println(Final);
			 			        
			 			        
			int n1 = 100, n2= 300, n3 =400;
			int max = (n1 > n2&& n1 > n3) ? n1
					: (n2 > n1 && n2 > n3) ? n2
							:n3 ;
			 			        System.out.println(max);
			 			        
}
	
}
