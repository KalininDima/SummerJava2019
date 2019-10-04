package Day24_JavaRecap;

public class ArraysClass {
public static void main(String[] args) {
	/*
	 Array Declarations:
	  				DataType[] Variable = {Value, Value2,....}
	 				DataType Variable[] = {}value1,value2,....}
	 				Arrays Have index numbers, in order to retrive 
	 				a value from an array:
	 					VarriableName[IndexNum of Value]
	 					
	 				Arrays size is fixed , Arrays size must be initialized. 
	 				There are two ways to initialize
	 				Arrays size:
	 					1. By giving value:
	 								int [] arr = {1,2,3};
	 								it initialize the size and  
	 								at the same time it gives value to the 
	 								index of the array
	 					2. By new keyword:
	 								int [] arr = new int [size number];
	 								it initialize the size of the
	 								 array ONLY does size
	 								
	 								
	 								
	 								
	 */
	
	int a =10;
    int[] arr = { 10, 20, 30 };
    
    int  arr2[] = {10, 20, 30};
    
    char[] arr3 = {'A', 'B' , 'C' };
    
    String arr4[] = {"Ibrahim", "Filiz", "Aysel"};
    //      index :    0           1         2
    
//  String name = arr4[3];  // index 3 is not exist
    String name = arr4[2];
    System.out.println(name);
    
    
    /*
     initialize the size of arry:
            int[] arr = new int[size]
     */
    
    String[] MyNumbers = new  String[5];
    for(int i=0; i <  MyNumbers.length; i++  ) {
        System.out.println( MyNumbers[i] );
    }
    System.out.println("    ");
    /*
     default values:
        int, byte, short, long ==> 0
        double & float ==> 0.0
        boolean ==> false
        char ==> space
        
        String ==> null
     */
    
    
    // Assign values: 
     int[] ch = new int[3];
     ch[0] = 10;
     ch[1] = 20;
     ch[2] = 30;
     
//   ch[3] = 40;
//   System.out.println( ch[3] );
     
      
     for(int i=0; i < ch.length; i++ ) {  
         System.out.print(ch[i]+" ");  // 10 20 30
     }
     System.out.println();
     
     
     
     
     ch = new int[4];  
// reinitialized it's size,  
     //and preveious values of array are lost
     
     for(int i =0; i < ch.length; i++) {
         System.out.print(ch[i]+" ");  // 0 0 0 0
     }   // array's size is fixed
     
     System.out.println();
     
     //combone two warrays
     int[] array1 = {1,2,3};
     int[] array2 = {4,5,6};
     
     int[] array3 = new int[ array1.length + array2.length];
     //now this array has ehough capacity for elements array 1 and array 2
     for(int i=0; i <array1.length; i++) {
         array3[i] = array1[i];  
         
         // assigning array1' each index to the array3
     }         
     
     for(int i =0; i < array2.length; i++) {
    	 array3[i+array1.length]=array2[i];
     }//assignig all the values of array2 to array3 remaining 
	for (int i=0;i<array3.length;i++) {
		System.out.print(array3[i]+" ");
	}
	
}
}
