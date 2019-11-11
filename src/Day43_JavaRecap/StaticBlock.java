package Day43_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

	static String [] arr = new String [3];
	static ArrayList<String> list = new ArrayList<>();	
	
	double salary;
	//static ChromDriver driver = new ChromeDriver();
	//static Excel data; 
 	/*
 	 static{
 	 sriver.manage().window().maximize();
 	 }
 	 */
	static {
		System.out.println("statik block");
		arr[2] = "rew";
		arr[0] = "KAt";
		arr[1] = "Rusl";
		
		list.addAll(Arrays.asList(arr));
		//salary = 5000; //static only accepts static
		
		StaticBlock obj = new StaticBlock();
		obj.salary = 4000;
		System.out.println(obj.salary);
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		StaticBlock obj = new StaticBlock();
		System.out.println(obj.salary);
		
	}
}
