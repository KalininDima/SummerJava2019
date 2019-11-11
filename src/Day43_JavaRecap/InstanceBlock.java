package Day43_JavaRecap;

import java.util.Arrays;

public class InstanceBlock {
	
	String [] names = new String [3];
	
	
	
	{
		System.out.println("Instance block");
		names[0] = "Alla";
		names[2] = "Seyfo";
		names[1] = "Khurshed";
		
		//names [3] = "Sukran"; out of bound
	}
	
	public InstanceBlock() {
		System.out.println("Constructor");
		names[0] = "rahgf";
		names[2] = "Swrqr";
		names[1] = "Kd";
	}
public static void main(String[] args) {
	InstanceBlock obj = new InstanceBlock();
	
	System.out.println("Main method");
System.out.println(Arrays.deepToString(obj.names));	

InstanceBlock obj2 = new InstanceBlock();
}
}
