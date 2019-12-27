package Day63_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
/*
//List(I): does have index numbers , accept duplicates 
			 implemented by: ArrayList(C), LinkedList(C), Vector(C)

		ArrayList(C): array based, internally uses array
		 
		LinkedList(C): each objects are doubly linked 
					add() & remove() are faster than ArrayList
					get() is slower than arraylist
		Vector(C) : is synchronized --> Thread safe
					slower than LinkedList & ArrayList
					
					HAs a child class : Stack
					
					Stack : LIFO
							pop(): LIFO ==> Last In First Out
							removes tha last object from the stack
* 
* 
* Set(I); does not have index numbers , does not accept duplicates, size is automatically adjusted
* 
* implemented by: HashSet(C), LinkedHashSet(C);
* 
* HashSet: does not keep the order of the objects as its
*
* 
* LinkedHashSet: does keep the order of the objects as its
* 				doubly linked
* 
* extended by SortedSet(I)
* 
* SortedSet(I): sorts the objects in ascending order , no duplicates
* implemented by TreeSet
* 
* synchronized keyword : used for achiving thread safety in multi-thread
* synchronized ==> Thread safe ==>
* 
* multi-thread: multiple threads trying to get access to same resources
* 
* 
* 
*/
public class Collection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(100,200,333,1000,100,100));
		
		
		Set<Integer> set1 = new HashSet<Integer>();
			set1.add(100);
			set1.add(100);
			
			System.out.println(set1);
			
			
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		
	//	vector.remove(1);
		vector.set(0, 3);
		
		
		
		Stack<Integer> stack = new Stack <Integer>();
		stack.add(100);
		stack.add(300);
		stack.add(200);
		stack.add(500);
		
		System.out.println(stack.pop()); // 500
		
		System.out.println(stack);// [100,300,200]
		
		System.out.println(stack.pop());// 200
		
		// ArrayList<WebElement> list = new ArrayList<>();
		//list.add(Driver.findElement(By.xpath());
		
		//List<WebElement> list = driver.findElements(locator);
		
		int [] [] arr2D = {{1,2,3}};
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> listOflist = new ArrayList<>();
		//listOflist.add(1);
		listOflist.add(l1);
		
		Set<Integer> hashset = new HashSet<Integer>();
		hashset.add(100);
		hashset.add(90);
		hashset.add(80);
		hashset.add(70);
		hashset.add(70);
		
		System.out.println(hashset);
		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
						linkedHashSet.add(100);
						linkedHashSet.add(90);
						
						//SortedSet<Integer> sortedset = new HashSet();
						
						
		List<Integer> lists = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6));
	//	Collections.sort(lists);
		System.out.println(lists);
				
		SortedSet<Integer> sortedset = new TreeSet<Integer>();
						
		System.out.println(sortedset);
		
		
	}

	
	

}
