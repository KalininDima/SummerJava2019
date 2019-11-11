package Day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {
public static void main(String[] args) {
	
	
	/*
	 remaining method of arrayList:
	 		indexOf(object) : returns the index number
	 		 of the object
	 		 
	 		 lasyIndexOf():
	 		 
	 		 converting array to arrayList
	 		 
	 		 removeAll(), addAll()
	 		 
	
remaining methods of arrayList:
            indexOf(object) : returns the index number of the 
            object from the arrayList, retuns int 
            
            lastIndexOf(Object): returns the last index number of 
            the object from the arraylist, returns int
            
            Arrays.asList(Object Array):  used for converting 
            object arrays to List interface
   
            we will learn List Interface in future
            
            addAll(Interface): used for storing multiple objects 
            to ArrayList
	 
	 		removeAll: removes all the matching objects
	 		
	 		sorting the array:
	 				Arrays.sort(VariableName);
	 				
	 				Arrays class id presented in java.util package
	 				
	 		sorting the arrayList:
	 				Collections.sort(VariableName);
	 				
	 				Collections class is presented in "java.util" package
	 		
	 */
	ArrayList<Integer> list = new ArrayList<>();
    list.add(  1  ); // auto boxing 
    list.add( Integer.valueOf("33") );  // none
    list.add( Integer.parseInt("100") ); // auto boxing
    list.add(200);
    list.add(20);
    list.add( 1 );
    
    
// indexOf(object): returns the index number of first matching object from the arrayList    as an int
     // if it returns negative number, it means the given object is not exist in the arraylist
    
    
    int a = list.indexOf( 11 );  // auto boxing
    System.out.println( a );   
    
        int a2 = list.indexOf(200);
        System.out.println(a2);


// lastindexOf(object):  returns the last occured object' index number (last index number) as an int
        int a3 = list.indexOf(1);   //0
        
        int a4 = list.lastIndexOf(1);  // 5
        System.out.println(a3);
        System.out.println(a4);
        

        
// converting array to arraylist
Integer[] arr = {1, 2, 3, 4, 5};

ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList( arr ) ); // A
        list2.add(100);

System.out.println(list2);




String[] arr2 = { "Java", "Python", "C#", "C++"};
    

ArrayList<String> list3 = new ArrayList<>( Arrays.asList(arr2) );

// isEmpty(): checks if the arraylist is empty and returns boolean expression   
    System.out.println( list3.isEmpty() );
    list3.add("F");
    
    System.out.println(list3);  
    

    int[] arr3 = {1,2,3,4,5};
//  ArrayList<Integer>  list4  =  new ArrayList<>( Arrays.asList(arr3));
                // only the object arrays can be converted
        

// addAll(InterFace): 
    String[] allaNames = { "Hakan", "Alexis", "Rahwa", "Erhan", "Holy"};
    
    ArrayList<String> names = new ArrayList<>();
        names.addAll(  Arrays.asList( "Almaz" , "Ibrohim" , "Tabi" )  );
        
        names.addAll( Arrays.asList(allaNames) );
        System.out.println(names);
    
        
//RemoveAll (Interface):
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(1,1,1,1,1,12,2,2,2,2,3,3,3,4,4));

        numbers.removeAll(Arrays.asList(1));
        System.out.println(numbers);
        
        //removed() method  - do not in the loop.
      /*  Exemple why:
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1,1,1,1,1,2,2,2,3,3,3,4,4,43,3,2,1));
        
        for (int i = 0 ;i<list5.size();i++) {
        	if(list5.get(i) == 1) {
        		list5.remove(i);
        	}
        }
         
        */
        
        //arrrayList sorting:
        			Integer[] array = {1000,900,80,754,23,245};
        			
        ArrayList<Integer> price = new ArrayList<Integer>();
        			price.addAll(Arrays.asList(array));
        			
        		Collections.sort(price); //sorting the arrayList in ascending order
        		System.out.println(price);
        
}


}
