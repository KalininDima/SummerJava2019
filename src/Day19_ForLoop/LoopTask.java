package Day19_ForLoop;

public class LoopTask {
public static void main(String[] args) {
	/*
	 initialization: starting point   int i =10...
	 Condition: created based on the initialization i>0...
	 iterator: co-related the the condition 
	 			Need to be
	 
	 if the condtion of the loop is true , 
	the loop will be keep executed untill false
	*/
	for(int i=1;i<=10;i++) {
		System.out.println("the square of "+i+" is"+ (i * i));
		}
	
	/*
	 Task02
	 write a program that displays
	  each odd numbers between 1to 32
	 */
	for (int i = 1;i<33;i++) {
		if (i %2==0) {
			System.out.print(i+" ");
			
		}
	}
		//task3:
	for (int i = 1; i<=32;i++) {
		if(i%2!=0) {
			System.out.println(i+" ");
		}else {System.out.println(i+" ");
			
	}
	}
	
	String str = "Cybertek";
    //            01234567
    //  "avaJ"
    String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
    
    String Reversed ="";
    for(int i = str.length()-1 ; i >= 0; i--) {
        Reversed += str.charAt(i);
    }
    
    System.out.println(Reversed);

}
}
