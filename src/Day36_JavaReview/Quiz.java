package Day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
public static void main(String[] args) {
	
	//q1
	//ArrayList<Object> list = new ArrayList<>();
	
	
	//q3
	ArrayList<Integer> list = new ArrayList<Integer>();
			list.addAll(Arrays.asList(1,2,3));
			//					index 0, 1, 2
				
			int a = 1;
			list.remove(a);//[1,3]
			
			System.out.println(list);
	
	
	//q4
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			list.addAll(Arrays.asList(1,2,3));
			//					index 0, 1, 2
				
			Integer A = 1;
			list.remove(A);//[2,3]
			
			System.out.println(list1);
			
	//q5 
			String[] arr= {"Rob","Bran","Rick","Bran"};
		ArrayList<String> names= new ArrayList<>();
	if(names.remove("Bran")) {
		names.remove("John");
	}
		System.out.println(names);
			
	//q9 
		ArrayList<Integer> list4 = new ArrayList<>();
		Integer a1 = 1;
		System.out.println(list.remove(a1));
		
	//q10
		ArrayList<Integer> list5 = new ArrayList<>();
		int a2 = 1;
		System.out.println(list.remove(a2));
		
	//
}
}
