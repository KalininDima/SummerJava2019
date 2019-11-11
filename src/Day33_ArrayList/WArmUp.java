package Day33_ArrayList;

import java.util.Arrays;

public class WArmUp {
public static void main(String[] args) {
	
	/*
	 Warm UP
	 1. Write a return  method that accepts an int array and
	  sorts it in descending order
	 2. Write a return method that accepts a double array and sorts 
	 it in descending order
	 3. write a return method that accepts a char array and sorts it in descending order
     4.write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is prefered here

	 
	 */
	
	int arr [] = {10,89,20,300,10,900,0,1};
			arr=SortDe(arr);
	System.out.println(Arrays.toString(arr));
	
	double [] arr2 = {10.5,55,300,2.0,6.5};
	
	arr2 = StortDo(arr2);
	System.out.println(Arrays.toString(arr2));
	
	char [] ch = {'c','a','d','r','p'};
	
		ch = StortCh(ch);
	System.out.println(Arrays.toString(ch));
	
	String [] names = {"Mikray","JAy","Miniver","Nurzat","Viktoria","Erhan"};
	names = StortCh(names);
	System.out.println(Arrays.toString(names));
}

//1.
public static int [] SortDe(int [] arr) {
	Arrays.sort(arr); // ascending order
	int arr2 []  = new int [arr.length];
	int j = 0;
	 for (int i = arr.length-1;i>=0;i--) {
		 arr2[j]=arr[i];
		 j++;
	 }
	return arr2;
	
}

public static double [] StortDo(double [] arr) {
	Arrays.sort(arr);
	 double arr2 [] = new double [arr.length];
	 int j = 0;
	 for (int i = arr.length-1; i>=0; i-- ) {
		 arr2[j]=arr[i];
		 j++;
	 }
	
	
	return arr2;
}

public static char [] StortCh(char [] arr) {
	Arrays.sort(arr);
	 char arr2 [] = new char [arr.length];
	 int j = 0;
	 for (int i = arr.length-1; i>=0; i-- ) {
		 arr2[j]=arr[i];
		 j++;
	 }
	
	
	return arr2;
}
public static String [] StortCh(String [] arr) {
	Arrays.sort(arr);
	 String arr2 [] = new String [arr.length];
	 int j = 0;
	 for (int i = arr.length-1; i>=0; i-- ) {
		 arr2[j]=arr[i];
		 j++;
	 }
	
	
	return arr2;



}



}