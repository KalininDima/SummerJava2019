package Day28_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUP {
public static void main(String[] args) {
	/*
	 1.Write a method that can convert km to miles
	 1km = 0.612
	 
	 2.Write a method that can convert to litters
	 1 gal = 3.75
	 
	 3.Write a method that will sort an array in descending 
	 order
	 
	 4. 
	 */
	
Scanner scan = new Scanner (System.in);
double count = scan.nextDouble();
KMtoM(count);
count = scan.nextDouble();
GtoL(count);
int [] arr = {10,  8,  99,  0,  -1};
arrySortDes(arr);






}

public static void arrySortDes (int[] arr) {
	//arr={10,8,99,0,-1}
	Arrays.sort(arr);
	
	for(int i =arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}

public static void KMtoM(double km) {
	double mm = km *0.612;
	System.out.println(km+" km equals to "+ mm +" miles");
}

public static void GtoL(double G) {
	
double L = G * 3.75;
System.out.println(G+" gallons equal to "+L+" litters");
}

}
