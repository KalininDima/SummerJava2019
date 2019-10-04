package Day30_WrapperClass_ArrayListy;

import java.util.ArrayList;

public class ArrayListClass {
public static void main(String[] args) {
	
	/*
	 ArraysList class:
	 
1. presented in "java.util" package
	 import java.util.ArrayList;
2.ArraysList does not support primitives	
3.ArraysList simillar to Array, we store Objects ONLY
all the Values in ArrayList are objects (none primitives). 	
	 			
Decleration of arrayList:
	ArrayList<ClassType> variableName = new ArrayList<>();
	 				
	Methods of ArrayList :
		add(value): adds values to arraylist, if the value
		
		get(indexNum): gets the specific values from arrayList
		
	 	size(): returns he length 
	 	(total number of values) from the ArrayList
	 	
	 	clear() : clears the array, removes all the values out from the arrayList
	 			
	 	sorting Array:
	 			Arrays.sort(variableName);
	 			
	 	sorting the ArraysList:
	 			Connection.sort(variableName)
	 			cpllections present in Java.util
	 			
	 	ArrayList vs Array:
	 	1. Arrays size fixed , ArrayList' size is dynamic
	 	2. Array supports primitive and non primitive
	 	3. ArrayList does not support primiteves
	 	
	 			
	 */
	
	int [] array1 = new int [1];
	ArrayList<Integer> list = new ArrayList<>();
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
					list2.add(10);// auto boxing
					list2.add(20);//
					list.add(30);//
	//index			[10,20,30]
					//0  1  2
					
					
	System.out.println(list2);
	System.out.println(list2.get(1)); // 20
	
	//System.out.println(list2.get(4));
	
	System.out.println(list2.size());//3
	
	list2.clear();
	
	System.out.println(list2);
	
	System.out.println(list2.size());
	
	
}
}
