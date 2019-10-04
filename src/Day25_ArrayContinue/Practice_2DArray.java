package Day25_ArrayContinue;

import java.util.Arrays;

public class Practice_2DArray {
public static void main(String[] args) {
	
	int [][] arr2D = { {1,2} , {3,4,5,6,7} , {8,9} };
	
	// length method:
	
				int length = arr2D.length; //3 (2 by index's)
				
			for (int i=0;i<arr2D.length;i++) {//i:0 1 2 
				System.out.println(Arrays.toString( arr2D[0]) );
			}
	
	
			for (int i=0; i< arr2D.length; i++) {// checks each index of 1d array
				for (int j = 0; j<arr2D[i].length; j++ ) {// checks the each index 
				System.out.print(arr2D[i][j]+", ");
			}
		}
	System.out.println();
			
			
			char[][] ch2D = { { 'A','B'} , { 'C','D'} } ;
			
			for (int i = 0; i<ch2D.length;i++) {
				for (int j = 0; j<ch2D[i].length;j++) {
					System.out.print(ch2D[i][j]);
				}
			}
			
			
			
			
			
}
	
	
	
	
	
}
