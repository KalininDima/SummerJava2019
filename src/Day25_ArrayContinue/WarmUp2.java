package Day25_ArrayContinue;

public class WarmUp2 {
public static void main(String[] args) {
	
/*
 Write a program that can print out the uniqe from String Array
 */
	String[] arr = {"A", "A", "B", "C", "C"};
	//index			0	1	2	3	4	
	//how many times A is appeared in the array
	
	for (int j = 0; j<arr.length;j++) {
		
	int count = 0;
	
	for (int i=0; i< arr.length;i++) {
		if (arr[i].equals(arr[j]) ) {
			count++;
		}
	}
	 if (count == 1) {
		 System.out.println(arr[j]);
	 }
	 
	}
	
	
}
}
