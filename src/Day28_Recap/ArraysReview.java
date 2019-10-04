package Day28_Recap;

import java.util.Arrays;

public class ArraysReview {
public static void main(String[] args) {
	
	/*
	 single dimensional array:
	 int[] arr1D = {1,2,3,4}
	 int arr1D[] = {1,2,3,4}
	 int arr1D[] =new int [] {1,2,3,4}
	 */
	int [] arr1D = {1,2,3,4};
	//	index		0 1 2 3
	
	// initialize the size of 1D array: int [] arr = new int [Length number]
	int[] arr = new int[3];//this array can contain three values
	
	arr[1] = 10;
	arr[0] = 30;
	arr[2] = 20;
	// to print the array:array needs to be converted to String
	System.out.println(Arrays.toString(arr) );
	
	int [] num = {10,20,30,40};
	for (int eachValues : num) {
		if (eachValues == 20) {
			continue;// skips everysingle statements after continue
		}
		System.out.println(eachValues+" ");
		break; //exists the loop
		
		
	}
		
	int [] nums = {100,200,300,400};
	int i;
	for (i =0;i < nums.length;i++) {
		break;
		
		
		}
		
	System.out.println(nums[i] + " ");
	
	/*
	 Arrays Util Class: toString(), sort(), deepToString()
	 			
	 		toString(): converting single dimensional array to String
	 		sort(): sorting single dimensional array in ascending order
	 		deepToString(): converting Multi-Dimensional array to String
	 */
	long[] LongArr = {20,400,500,300,10,20};

	
	Arrays.parallelSort(LongArr);
	System.out.println(Arrays.toString(LongArr));
	
	//deeptoString():
	
	int [] [] arr2d = {{1,2,3,4},{5,6,7}};
	// index 				0		1
	System.out.println(Arrays.toString(arr2d) );
	//will be hashcode because multi dimensional array to string
	
	System.out.println(Arrays.deepToString(arr2d) );
	
	// in 2d array:[index number of 1D arrays][index number of values]
	// print: {5,6,7}
	System.out.println(arr2d[1]);//needs to be converting to String
	System.out.println(Arrays.toString (arr2d[1]));
	
	//print [7]
	System.out.println(arr2d[1][2]);
}
}
