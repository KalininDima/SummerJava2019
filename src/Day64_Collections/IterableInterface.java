package Day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class IterableInterface {

	
	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1,2,1,21,2,3,43,4,5,6,1,1,4,6));
		
		for (int i =0;i<list.size();i++) {
			
			if (list.get(i)==1) {
				list.remove(i);
			}
		}
			System.out.println(list);
			
			List<Integer> list2 = new ArrayList<>();
			list2.addAll(Arrays.asList(11,1,1,1,1,1,1,2,2,2,3,4,4,1,1));
			Iterator<Integer> it = list2.iterator();
			
			boolean a = it.hasNext();
			System.out.println(a);
			
			System.out.println(it.next());
			
			
			System.out.println("==============");
			
			List<Integer> list3 = new ArrayList<>();
			list3.addAll(Arrays.asList(1,1,1,1,1,2,2,3,4,534,2,1,1,1,1,1));
			//remove all data elements that are equal to 1
			
			Iterator <Integer> it3 = list3.iterator();
			while(it3.hasNext()) {
				int num = it3.next();
				if (num==1) {
					
					it3.remove();
			}
			}
			System.out.println(list3);
			
			System.out.println("=================");
			
			
			Set<Integer> set = new LinkedHashSet<Integer>();
			set.addAll(Arrays.asList(10,20));
			
			Iterator<Integer> iterate = set.iterator();
			System.out.println(iterate.hasNext());//true
			System.out.println(iterate.next());
			
			System.out.println(iterate.hasNext());// true
			System.out.println(iterate.next());
			
			System.out.println("=============");
			String [] name = {"Erhan", "Eholly", "Nadire", "Yusuf", "Ibrohim", "Tabriz"};
			
			Set<String> names = new LinkedHashSet<String>();
			names.addAll(Arrays.asList(name));
			
			Iterator<String> removeE = names.iterator();
			
			while(removeE.hasNext()) {
				String str = removeE.next();
				if(str.toLowerCase().contains("e")) {
					removeE.remove();
				}
			}
			
			System.out.println(names);
			
			// for (intialization; condition; iterator)
			
			List<Integer> myList = new ArrayList<Integer>();
			myList.addAll(Arrays.asList(100,200,3004,5595,494,13));
			
			for (Iterator<Integer> itr = myList.iterator(); itr.hasNext();) {
				int numbers = itr.next();
				if(numbers>100) {
					itr.remove();
				}
			}
			
			System.out.println(myList);
			
			String [] students = {"Erhan", "Erhan","Erhan", "MADINA","MADINA", "Safan", "Jamal", "Erhan"};
			
			List<String> nameList = new ArrayList<String>();
			nameList.addAll(Arrays.asList(students));
			
			for (Iterator<String> itr = nameList.iterator(); itr.hasNext(); ) {
				String str = itr.next();
				if(str.equals("Erhan") || str.equals("Holly")) {
					itr.remove();
				}
			}
			
			System.out.println(nameList);
	}
}
