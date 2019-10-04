package Day21_while_in_while;

public class WarmUp {

	/*
	 1.write a java program that can count how many time the word "book" 
	   is appeard in String
	   Ex: input : I like books, i have books, I need book.
	   output
	 
	 */
	
	
		
		
	/*	String sentence = "I like books , I have books, I need book";
		//indexL					z,   z+4==>
		int count = 0;
		
		for  (int i = 0; i<sentence.length()-3;i++) {
						 //16   //17
			if ( sentence.substring(i,i+4).equals("book") ) {
				// substring(0,4)
				count++;
			}
		}
		System.out.println(count);
	*/
		
		public static void main(String[] args) {
			/*
	         while(condition){
	                    statements;
	            }
	         */
	        int a = 9;  // a=8
	        
	        while ( a > 8 ) {
	            
	            
	            System.out.println("Hello " + a );
	            
	            a--;
	            
	        }
	        
	        
	        
	        /*
	         1. write a java program that can count how many time the word 
	             "book" is appered in a String
	         */
	        
	        String sentence ="I like book, I read book, book book book";
	        //                  "I like , I read book"
	        //                  "I like , I read"
	        int  count = 0;// 1 + 1
	        
	        
	        while( sentence.contains("book") ) {
	            count++;
	            sentence = sentence.replaceFirst("book", "");  
	                // can eventually make the condition false
	        }
	        
	        System.out.println( count );
	        System.out.println( sentence );
	        
	        
	        
	        while(true) {
	            
	            System.out.println("hello");
	            break;  // forcefully exits the loop
	            
	        }
	        
	            int i = 0;
	        while ( true ) {
	            i++;
	            System.out.println("Hello: "+i);  // hello 1
	            if(i == 5) {
	                break;
	            }
	            
	        }
	        
	        
	        
	        
	        
	        
	    }
	    
	    
	}
