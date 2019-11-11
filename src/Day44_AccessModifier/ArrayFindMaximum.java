package Day44_AccessModifier;

import java.util.Arrays;

public class ArrayFindMaximum {

	public static int FindMaximumArray(int[] num) {
/*
 public static int maxValue( int[]  n ) {

int max = Integer.MIN_VALUE;

for(int each: n)

if(each > max)

max = each;

 

return max;

}
 */
		Arrays.sort(num);
		return num[num.length - 1];
	}

	public static void main(String[] args) {
		
		int[] arr= {5,4,3,321,4,5,623,2,3,4,4,5,66,6};
		System.out.println(FindMaximumArray(arr));

	}

}
