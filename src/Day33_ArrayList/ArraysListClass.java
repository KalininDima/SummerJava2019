package Day33_ArrayList;

import java.util.ArrayList;

public class ArraysListClass {
public static void main(String[] args) {
	
	
	/*
	 ArrayList: present in "java.util"
	 		does not support primitives, we can only store objects
	 		ArrayList size is dynamic
	 		ArrayList is an ordered collection of values (index number)
	 		we can add or remove objects from arrayList
	 		
	 declaration of ArrayList:
	 ArrayList<NonPrimitives> variableName = new ArrayList<NonPrimitives>();
	 ArrayList<NonPrimitives> variableName = new ArrayList<>();
	 
	 declaration of array:
	  					int [] arr = new int [5];
	  					
	 method of arrayList:
	 		add(object) : adds objects to arrayList
	 		
	 		get(index) : gets the data from the arrayList
	 		
	 		size(): return the length of arrayList as int
	 		
	 		clear(): 	  removes everything from arrayList
	 		
	 		set(index number, object): the given object will 
	 		replace the object at the given index number	
	 		
	 		equal(ArrauList): checks if the two arrayList have same objects not
	 		return boolean value
	 		
	 		remove(int): removes the given index
	 		
	 		remove (object): removes value
	  					
	 ArrayList vs Array:
 		ArrayList' size is dynamic, Array' size is fixed
 		ArrayList only supports non primitives , Array supports all
	  	Array can be multidimensional, ArrayList can not be multidimensional
	  					
	  
	 */

	
	//declaration of ArrayList
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> list2 = new ArrayList<>();
	
	//add:
		ArrayList<String> shoppingList = new ArrayList<>();
			shoppingList.add("apple");
			shoppingList.add("orange");
			shoppingList.add("Пивасик");
			
			System.out.println(shoppingList);
			
			
			
			
	//add(index,object): add the object at the given index number
				//shoppingList.add("Strawberry");
			shoppingList.add(1,"Strawberry");
				System.out.println(shoppingList);
			
			shoppingList.add(4,"Toyota Corolla"); // it does not skip indexes
			System.out.println(shoppingList);
			
			shoppingList.add(4,"Corolla"); // it does not skip indexes
			System.out.println(shoppingList);
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			numbers.add(0,5); // [5] arerayList does not skip indexes
			numbers.add(1,10);// [5.10]
			numbers.add(2,15);//[5,10,15]
			numbers.add(1,1);//[5,1,10,15]
			
			numbers.add(1,6); // [5,6,1,10,15]
			
			System.out.println(numbers);
			
		//get(index number) : returns the object
		ArrayList<String> names = new ArrayList<>();
			names.add("Homayara");
			names.add("Meri");
			names.add("Dima");
			names.add("Tabriz");
			
			String str1 = names.get(1);
			System.out.println(str1);// autoboxing
			
	
		//size(): returns the length of the arrayList as an Int value
		
				int length = names.size();
				System.out.println(length);
				for (int i = 0; i<names.size(); i++) {
					String each = names.get(i);
					System.out.println(each);
				}
				
				for (String each : names) {
					System.out.println(each+" ");
				}

				// clear():
						ArrayList<String> students = new ArrayList<>();
						students.add("Holly");
						students.add("Dima");
						students.add("Erhan");
						students.add("Nadira");
						students.add("Cihan");
						
						System.out.println(students);
							students.clear();
							
							
				// set(index number, object): 
							ArrayList<String> Javangers = new ArrayList <>();
							Javangers.add("Ferhat");
							Javangers.add(1,"Lexi"); // "Shawkrat"
							Javangers.add(1,"Asiya");
							Javangers.add("Alex");
							Javangers.add(0,"Sawfan"); // []
							
							// 
							Javangers.set(1,"Shawkrat" );
							
							System.out.println(Javangers);
							
				//contains(object): checks if the given object
				//is contained in the ArrayList and return boolean
				
				ArrayList<String> goodGuys = new ArrayList<>();
				goodGuys.add("Hakan");
				goodGuys.add("Ihsan");
				goodGuys.add("Tim");
				goodGuys.add("Ibrohim");
				goodGuys.add("Dilyar");
				
				boolean result = goodGuys.contains("Seyfo"); 
				System.out.println(result);
				
				//equals(ArrayList): checks if the two arrayList are 
				//equal or not, return boolean; 
				
				ArrayList<String> bad = new ArrayList<>();
				bad.add("Mihtar");
				bad.add("Indan");
				bad.add("Tim");
				bad.add("Ibrohim");
				bad.add("Dilyar");
				
				boolean result2 = bad.equals(goodGuys); // false
				System.out.println(result2);
				
				if (goodGuys.contains("Ibrohim")||bad.contains("Ibrohim"));//
					System.out.println("Ibrohim is good guy");




				// remove(int): removes the index
					ArrayList<Integer> lists = new ArrayList<>();
								lists.add(1);
								lists.add(2);
								lists.add(3);
								lists.add(4);
								lists.add(5);
								
								lists.remove(1); // [1,3,4,5]
								lists.remove(2);//
								lists.remove(1);//
								
								System.out.println(lists);
								System.out.println(lists.size());
								
								
				// removes (Integer) : removes the first matching object, at the same 
								//time returns boolean
								
								
				ArrayList<Integer> lists2 = new ArrayList<>();
					lists2.add(1);//auto-boxing index: 0
					lists2.add(2);//auto boxing index: 1
					lists2.add(3);//auto boxing index: 2
					lists2.add(4);//auto boxing index: 3
					lists2.add(1);//auto boxing index: 4
					
					Integer a =1;
					Integer b =1;
					lists2.remove(a);
					lists2.remove(b);
					boolean r1 = lists2.remove(a);
					System.out.println(lists2);
					System.out.println(r1);
					
					
				ArrayList<String> city = new ArrayList<>();
				city.add("Miami");
				city.add("Miami");
				city.add("Gotham");
				city.add("Azarbaijan");
				city.add("Istanbul");
				city.add("Urumqi");
				city.add("Miami");
				
				if(city.remove("Miami")) {
					city.remove(2);
					
				}
				city.add(3,"Azarbajan");
				System.out.println(city);
				
				ArrayList<Integer>     price = new ArrayList<>();           
	            price.add( 1 );// auto
	            price.add( 2 );
	            price.add( 3 );
	            price.add( 4 );
	            price.add( 5 );
	            
	            price.remove( Integer.parseInt("2") ) ;  // parse method retunrs primitive,
	            System.out.println(price);  // [1, 2, 4, 5]
	            
	            boolean r3 = price.remove( Integer.valueOf("3") );  // valueOf method returns wrapper class,
	            System.out.println(price);
	            System.out.println(r3);
}


}
