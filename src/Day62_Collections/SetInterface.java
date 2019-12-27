package Day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
						list1.addAll(Arrays.asList(100,100,100));
						System.out.println(list1);
						
		Set<Integer> st1 = new HashSet<>();
		
		st1.add(100);
		st1.add(100);
		st1.add(100);
		st1.add(100);
		st1.add(100);
		
		
		
		System.out.println(st1);//100
	//	System.out.println(st1.get(0)); Set doesnt have indexes and not has get method
		
		System.out.println("===============");
		
		Set<Integer> hashset  = new HashSet<Integer>(); // hash set doesnt not keep objects order as it is 
		hashset.add(100);
		hashset.add(10);
		hashset.add(5);
		hashset.add(4);
		System.out.println(hashset);
		
		Set<Integer> linkhashset  = new LinkedHashSet<Integer>();
		linkhashset.add(100);
		linkhashset.add(10);
		linkhashset.add(5);
		linkhashset.add(4);
		System.out.println(linkhashset); //LinkedHashSet keep order with  values
		//doubly-linked : add() & remove() are faster than HashSet
		//					get
		
		SortedSet<String> treeset = new TreeSet<>();
					treeset.add("Z");
					treeset.add("Y");
					treeset.add("Y");
					treeset.add("R");
					treeset.add("W");
					
					System.out.println(treeset);
					
					// Task: remove dupcilates from an ArrayList, and sorted
								List<Integer> list = new ArrayList<>();
										list.addAll(Arrays.asList(10,9,8,7,6,5,4,34,10,10,10,4,4,4,4,3));
										Collections.sort(list);//how to sort List
										
										System.out.println(list);
										
								List<Integer> list2 = new ArrayList<>();
								list2.addAll(Arrays.asList(10,9,8,7,6,5,4,34,10,10,10,4,4,4,4,3));
								TreeSet<Integer> ts = new TreeSet<>(list2);
								System.out.println(ts);
								
		/*
		 * String str = "AAAAABBCCDDDD";
		 * write a programm tha can remove duplicates
		 */
								
								String str = "AAAAABBCCDDDD";
								String [] arr = str.split("");
								System.out.println(Arrays.toString(arr));
								TreeSet<String> restroom = new TreeSet<>(Arrays.asList(arr));
								
								String result = restroom.toString().replace("[","").replace("]", "").replace(", ","");
								System.out.println(result);
								
								
								
								
								
								
								//second solution
								
								String str2 = new LinkedHashSet<String>(Arrays.asList(arr)).toString();
								System.out.println(str2);
								
								
	}

}
