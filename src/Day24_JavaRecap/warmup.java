package Day24_JavaRecap;

public class warmup {
public static void main(String[] args) {
	/*1. write a program that can return the maximum value from an int array
		2. write a program that can return the second maximum value from an int array
	    3. write a program that return the minimum value from an int array
	    4. write a program that return the second minimum valye from an int array
		    */
		    
	int[] arr = {20,10,30,50,30,40,5000};
	
	int maximum = 0; //max=20,max=200
	for(int i = 0; i <arr.length;i++) {
		if (arr[i]>maximum) {
			maximum = arr[i];
		}
	}
	
	System.out.println("Maximum number is: "+maximum);
	
	int secindMaxx = 0;
	
	for (int j=0;j<arr.length;j++) {
		if(arr[j]> secindMaxx&&arr[j] !=maximum) {
			secindMaxx=arr[j];
		}
	}
	System.out.println("Second maximum number:"+secindMaxx);
	
	
	
	
	
	
	
	
}
}
