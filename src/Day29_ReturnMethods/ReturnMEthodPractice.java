package Day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMEthodPractice {
	public static void main(String[] args) {
        sum(10,20);
        
        //int max = sum(10,20);  // the method sum does not return any value
        
        additiion(10,20); // this method is an int value
        
        System.out.println(  additiion(10,20)  );
        
        float num = additiion(10,20);
        
        System.out.println( num );
        
        
        
        int max = (int) greaterNumber(90, 200, 30);  
        // it's gonna be reusable if we assign to a variable
        
        System.out.println(max);
        
        System.out.println( greaterNumber(90, 200, 30)  );
        
        int[] arr = {20, 30, 1, 2, 3, 5, 9};
        int maxNum = maximum(arr);
        System.out.println(maxNum);
        
        
        int[] arr2 = {10000, 90000, 823112, 762112, 654312};
        int maxNum2 = maximum( arr2 );
        System.out.println(maxNum2);
        
        String [] names = {"emrah","zulfie","waris", "mehmet","Aktoty", "yusuf","Djalolitdin","Munevver","Hatice"};
        String longName = LongestWord(names);
        System.out.println(longName);

        System.out.println(LongestWord(names));

        int [] array = {1,2,3,4,5,6,7};
        Sort(array);
        System.out.println(Arrays.toString(array) );
	


    }
    
// write a method that accepts an int array and retuns the maximum number from the array
    
    public static int maximum( int[] arr ) {
        
        Arrays.sort(arr);
        
        return arr[arr.length-1];
    }
    
    
    
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }
    
    public static int additiion(int a, int b) {
        return a+b;
    }
    
    
    // write ba method that accepts 3 numbers and returns the largest number
    
    public static double greaterNumber(int a, int b, int c) {
        int[] arr = { a, b, c };
        //          {1 ,2 ,3};
        Arrays.sort(arr);
        
        return arr[arr.length-1];
        
        
}
    
    //1.Write a method that accepts String array,
    //and returns the longest String variable
    
    public static String LongestWord(String [] arr) {
    	String longWord = "";
    	int max = 0;
    	for (int i = 0;i < arr.length; i++) {
    		if (arr [i].length()>max) {
    			max = arr[i].length();
    			longWord = arr[i];
    		}
    	}
    	return longWord;
    }
    
    
    //write a method that accepts an int array
    
    public static int [] Sort (int [] arr){
    			//[5,4,3,2,1,22,33]
    	Arrays.sort(arr); // [1,2,3,4,5,22,33]
    	
    	int [] numbers = new int[arr.length];//numbers array has same length with
    	
    	int z =0;
    	for(int i = arr.length-1;i>=0;i--) {
    		numbers[1] = arr[i];
    		z++;
    	}
    	
    	
    	
    	return numbers;
    	
    }
}