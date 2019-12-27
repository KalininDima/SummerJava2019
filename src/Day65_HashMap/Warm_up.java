package Day65_HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Warm_up {
public static void main(String[] args) {
	// write a program 

	        List<Integer>list1=new ArrayList<Integer>();
	        
	        for(Iterator<Integer>it =list1.iterator();it.hasNext();) {
	            int a = it.next();
	            if(a/2==0) {
	                it.remove();
	            }
	            
	        }
	        
	        
	        
	        System.out.println(list1);
	        
	        //write a programm that remove all the odd numbers from list interface
	        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2));
	        
	        Iterator<Integer> it2 = list2.iterator();
	        System.out.println(it2.hasNext());//true
	        System.out.println(it2.next());//1
	        
	        System.out.println(it2.hasNext());//true
	        System.out.println(it2.next());//2
	        System.out.println(it2.hasNext());//false
	    //    System.out.println(it2.next());
	        
	        
List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2));
	        
	        Iterator<Integer> it3 = list3.iterator();
	        while(it3.hasNext()) {
	        	int num = it3.next();
	        	if(num %2 !=0) {
	        		it3.remove();
	        	}
	        }
	    }
	

}
